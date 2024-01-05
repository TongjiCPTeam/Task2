package ANTLR.PL0;

public class PL0VisitorImpl extends PL0BaseVisitor<String>{
	private final StringBuilder code                = new StringBuilder();
	private       int           labelCounter        = 0;
	private       int           tempVariableCounter = 0;

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
			String dst = generateDestination();
			String src1    = visitExpression(ctx.expression());
			String op      = ctx.ADD_OPERATOR().getText();
			String src2    = visitTerm(ctx.term());
			emit(op, src1, src2, dst);
			return dst;
		} else if (ctx.getChildCount() == 2) {
			String dst = generateDestination();
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
			String dst = generateDestination();
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
			String dst = generateDestination();
			String src     = visitExpression(ctx.expression());
			emit(":=", src, null, dst);
			return dst;
		} else {
			return ctx.getText();
		}
	}

	@Override
	public String visitConditionalStatement(PL0Parser.ConditionalStatementContext ctx) {
		String label     = generateLabel();
		String condition = visitCondition(ctx.condition());
		emit("JMC", condition, null, label);
		visit(ctx.statement());
		emit("LABEL", null, null, label);
		return null;
	}

	@Override
	public String visitLoopStatement(PL0Parser.LoopStatementContext ctx) {
		String startLabel = generateLabel();
		String endLabel   = generateLabel();
		emit("LABEL", null, null, startLabel);
		String condition = visitCondition(ctx.condition());
		emit("JMC", condition, null, endLabel);
		visit(ctx.statement());
		emit("JMP", null, null, startLabel);
		emit("LABEL", null, null, endLabel);
		return null;
	}

	private String generateDestination() {
		return "T" + tempVariableCounter++;
	}

	private String generateLabel() {
		return "L" + labelCounter++;
	}

	private void emit(String op, String arg1, String arg2, String result) {
		code.append("(").append(op).append(", ")
				.append(arg1 != null ? arg1 : "_").append(", ")
				.append(arg2 != null ? arg2 : "_").append(", ")
				.append(result).append(")").append("\n");
	}

	public void printCode() {
		System.out.println(code);
	}
}
