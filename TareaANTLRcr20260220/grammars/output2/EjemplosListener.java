// Generated from Ejemplos.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EjemplosParser}.
 */
public interface EjemplosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EjemplosParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EjemplosParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemplosParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EjemplosParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemplosParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EjemplosParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemplosParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EjemplosParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemplosParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EjemplosParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemplosParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EjemplosParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemplosParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EjemplosParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemplosParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EjemplosParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemplosParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(EjemplosParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemplosParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(EjemplosParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemplosParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EjemplosParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemplosParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EjemplosParser.ExprContext ctx);
}