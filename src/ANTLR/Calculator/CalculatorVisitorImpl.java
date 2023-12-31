package ANTLR.Calculator;

import Calculator.CalculatorBaseVisitor;
import Calculator.CalculatorParser;

public class CalculatorVisitorImpl extends Calculator.CalculatorBaseVisitor<String> {
    private int tempVarCounter = 0;

    private String newTempVar() {
        return "t" + tempVarCounter++;
    }

    @Override
    public String visitMulDiv(CalculatorParser.MulDivContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        String tempVar = newTempVar();
        System.out.println(tempVar + " = " + left + " " + op + " " + right);
        return tempVar;
    }

    @Override
    public String visitAddSub(CalculatorParser.AddSubContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        String op = ctx.op.getText();
        String tempVar = newTempVar();
        System.out.println(tempVar + " = " + left + " " + op + " " + right);
        return tempVar;
    }

    @Override
    public String visitInt(CalculatorParser.IntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
