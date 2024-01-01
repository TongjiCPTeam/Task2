package ANTLR.PL0;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PL0Parser}.
 */
public interface PL0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PL0Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PL0Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PL0Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PL0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PL0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(PL0Parser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(PL0Parser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#subprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram(PL0Parser.SubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#subprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram(PL0Parser.SubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(PL0Parser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(PL0Parser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstDefinition(PL0Parser.ConstDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#constDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstDefinition(PL0Parser.ConstDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PL0Parser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PL0Parser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(PL0Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(PL0Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#statementPart}.
	 * @param ctx the parse tree
	 */
	void enterStatementPart(PL0Parser.StatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#statementPart}.
	 * @param ctx the parse tree
	 */
	void exitStatementPart(PL0Parser.StatementPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PL0Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PL0Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PL0Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PL0Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PL0Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PL0Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PL0Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PL0Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PL0Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PL0Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PL0Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PL0Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PL0Parser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PL0Parser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(PL0Parser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(PL0Parser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PL0Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PL0Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#relOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelOperator(PL0Parser.RelOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#relOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelOperator(PL0Parser.RelOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PL0Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PL0Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PL0Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PL0Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PL0Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PL0Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PL0Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PL0Parser.EmptyStatementContext ctx);
}