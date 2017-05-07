// Generated from TinyBasic.g4 by ANTLR 4.7
package com.hfernandes.tinybasic.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyBasicParser}.
 */
public interface TinyBasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TinyBasicParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TinyBasicParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(TinyBasicParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(TinyBasicParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TinyBasicParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TinyBasicParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(TinyBasicParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(TinyBasicParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(TinyBasicParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(TinyBasicParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TinyBasicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TinyBasicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TinyBasicParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TinyBasicParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TinyBasicParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TinyBasicParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyBasicParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TinyBasicParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyBasicParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TinyBasicParser.NumberContext ctx);
}