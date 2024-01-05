package ANTLR.PL0;

import ANTLR.PL0.PL0BaseVisitor;
import ANTLR.PL0.PL0Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PL0VisitorImpl extends PL0BaseVisitor<String> {
	private final StringBuilder code                = new StringBuilder();
	private final List<Integer> addrList = new ArrayList<>();
	private       int           addr;
	private       int           addrNum  = 0;
	private       int           dNumber  = 0;

	public PL0VisitorImpl(int addrStart) {
		super();
		this.addr = addrStart;
	}

	@Override
	public String visitAssignmentStatement(PL0Parser.AssignmentStatementContext ctx) {
		String dest = ctx.identifier().getText();
		String src  = visitExpression(ctx.expression());
		emit(":=", src, null, dest);
		return null;
	}

	@Override
	public String visitExpression(PL0Parser.ExpressionContext ctx) {
		if (ctx.getChildCount() == 3) {
			String dst = getDst();
			String src1    = visitExpression(ctx.expression());
			String op      = ctx.ADD_OPERATOR().getText();
			String src2    = visitTerm(ctx.term());
			emit(op, src1, src2, dst);
			return dst;
		} else if (ctx.getChildCount() == 2) {
			String dst = getDst();
			String op      = ctx.ADD_OPERATOR().getText();
			String src     = visitTerm(ctx.term());
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
			emit(op, src1, src2, dst);
			return dst;
		}
	}

	@Override
	public String visitFactor(PL0Parser.FactorContext ctx) {
		if (ctx.expression() != null) {
			String dst = getDst();
			String src     = visitExpression(ctx.expression());
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

		return left + "," + operator + "," + right;
	}

	@Override
	public String visitConditionalStatement(PL0Parser.ConditionalStatementContext ctx) {
		String label = getTempAddr();
		String condition = visitCondition(ctx.condition());
		List<String> conditionList = List.of(condition.split(","));
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
}
