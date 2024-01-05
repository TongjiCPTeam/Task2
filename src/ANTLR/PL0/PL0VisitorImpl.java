package ANTLR.PL0;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PL0VisitorImpl extends PL0BaseVisitor<String> {
	private final StringBuilder code                = new StringBuilder();
	private final List<Integer> addrList = new ArrayList<>();
	private       int           addr;
	private       int           addrNum  = 0;
	private final SymbolTable symbolTable;
	private       int         dNumber = 0;

	public PL0VisitorImpl(int addrStart, SymbolTable symbolTable) {
		super();
		this.addr = addrStart;
		this.symbolTable = symbolTable;
	}

	@Override
	public String visitIdentifier(PL0Parser.IdentifierContext ctx) {
		String identifier = ctx.getText();
		// 添加标识符到符号表
		ParserRuleContext parentCtx = ctx.getParent();
		// 如果标识符在常量声明中，将其添加为常量
		if (parentCtx instanceof PL0Parser.ConstDefinitionContext) {
			// 如果标识符在常量声明中，将其添加为常量
			symbolTable.addEntry(identifier, Kind.CONSTANT);
		} else {
			// 否则，将其添加为变量
			symbolTable.addEntry(identifier, Kind.VARIABLE);
		}
		return super.visitIdentifier(ctx);
	}

	@Override
	public String visitAssignmentStatement(PL0Parser.AssignmentStatementContext ctx) {
		String dst = ctx.identifier().getText();
		String src = visitExpression(ctx.expression());
		isDefined(dst);
		isDefined(src);

		emit(":=", src, null, dst);
		return null;
	}

	@Override
	public String visitExpression(PL0Parser.ExpressionContext ctx) {
		if (ctx.getChildCount() == 3) {
			String dst = getDst();
			String src1    = visitExpression(ctx.expression());
			String op      = ctx.ADD_OPERATOR().getText();
			String src2    = visitTerm(ctx.term());
			isDefined(dst);
			isDefined(src1);
			isDefined(src2);
			emit(op, src1, src2, dst);
			return dst;
		} else if (ctx.getChildCount() == 2) {
			String dst = getDst();
			String op      = ctx.ADD_OPERATOR().getText();
			String src     = visitTerm(ctx.term());
			isDefined(dst);
			isDefined(src);
			emit(op, src, null, dst);
			return dst;
		} else {
			return visitTerm(ctx.term());
		}
	}

	@Override
	public String visitTerm(PL0Parser.TermContext ctx) {
		if (ctx.getChildCount() == 1) {
			return visitFactor(ctx.factor());
		} else {
			String dst = getDst();
			String src1    = visitTerm(ctx.term());
			String src2    = visitFactor(ctx.factor());
			String op      = ctx.MUL_OPERATOR().getText();
			isDefined(dst);
			isDefined(src1);
			isDefined(src2);
			emit(op, src1, src2, dst);
			return dst;
		}
	}

	@Override
	public String visitFactor(PL0Parser.FactorContext ctx) {
		if (ctx.expression() != null) {
			String dst = getDst();
			String src     = visitExpression(ctx.expression());
			isDefined(dst);
			isDefined(src);

			emit(":=", src, null, dst);
			return dst;
		} else {
			return ctx.getText();
		}
	}

	@Override
	public String visitCondition(PL0Parser.ConditionContext ctx) {
		// 获取左操作数
		PL0Parser.ExpressionContext leftExpr = ctx.expression(0);
		String left = visit(leftExpr); // 假设visit方法会返回操作数的字符串表示

		// 获取右操作数
		PL0Parser.ExpressionContext rightExpr = ctx.expression(1);
		String right = visit(rightExpr); // 假设visit方法会返回操作数的字符串表示

		// 获取关系操作符
		PL0Parser.RelOperatorContext relOpCtx = ctx.relOperator();
		String operator = relOpCtx.getText(); // 假设getText()方法会返回操作符的文本

		operator = switch (operator) {
			case "=" -> "<>";
			case "<>" -> "=";
			case ">" -> "<=";
			case ">=" -> "<";
			case "<" -> ">=";
			case "<=" -> ">";
			default -> operator;
		};

		return left + "," + operator + "," + right;
	}

	@Override
	public String visitConditionalStatement(PL0Parser.ConditionalStatementContext ctx) {
		String label = getTempAddr();
		String condition = visitCondition(ctx.condition());
		List<String> conditionList = List.of(condition.split(","));
		isDefined(conditionList.get(0));
		isDefined(conditionList.get(2));
		emit("J" + conditionList.get(1), conditionList.get(0), conditionList.get(2), label);
		visit(ctx.statement());
		addrList.add(addr);
		return null;
	}

	@Override
	public String visitLoopStatement(PL0Parser.LoopStatementContext ctx) {
		String startLabel = getTempAddr();
		String endLabel   = getTempAddr();
		addrList.add(addr);
		String condition = visitCondition(ctx.condition());
		List<String> conditionList = List.of(condition.split(","));
		isDefined(conditionList.get(0));
		isDefined(conditionList.get(2));
		emit("J" + conditionList.get(1), conditionList.get(0), conditionList.get(2), endLabel);
		visit(ctx.statement());
		emit("J", null, null, startLabel);
		addrList.add(addr);
		return null;
	}

	private String getDst() {
		return "T" + dNumber++;
	}

	private String getTempAddr() {
		return "TEMPADDRBEGIN" + addrNum++ + "TEMPADDREND";
	}

	private void emit(String op, String arg1, String arg2, String result) {
		code.append(addr++).append(" ")
				.append("(").append(op).append(", ")
				.append(arg1 != null ? arg1 : "_").append(", ")
				.append(arg2 != null ? arg2 : "_").append(", ")
				.append(result).append(")").append("\n");
	}

	public void printCode() {
		String  regex   = "TEMPADDRBEGIN(\\d+)TEMPADDREND";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(code);

		while (matcher.find()) {
			int    index       = Integer.parseInt(matcher.group(1));
			String replacement = addrList.get(index).toString();
			code.replace(matcher.start(), matcher.end(), replacement);
			matcher.reset(code);
		}

		System.out.println(code);
	}

	private void isDefined(String var) {
		// 如果src不是立即数
		if (!var.matches("(\\d+|T\\d+)")) {
			// 获取src对应的符号表条目
			Kind srcEntry = symbolTable.lookup(var);
			if (srcEntry == null) {
				// 如果src是未定义的标识符，抛出错误
				throw new RuntimeException("变量" + var + "未定义！");
			}
			if (srcEntry == Kind.CONSTANT) {
				// 如果src是常量，抛出错误
				throw new RuntimeException("不能对常量" + var + "赋值！");
			}
		}
	}
}
