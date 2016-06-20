// Generated from Python.g4 by ANTLR 4.5.3

	package kompilator;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(PythonParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(PythonParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PythonParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PythonParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(PythonParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(PythonParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(PythonParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(PythonParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#loop_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stat_block(PythonParser.Loop_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#loop_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stat_block(PythonParser.Loop_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(PythonParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(PythonParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(PythonParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(PythonParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PythonParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PythonParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(PythonParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(PythonParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(PythonParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(PythonParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(PythonParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(PythonParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(PythonParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(PythonParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(PythonParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(PythonParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(PythonParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(PythonParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(PythonParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(PythonParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(PythonParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(PythonParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(PythonParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(PythonParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(PythonParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(PythonParser.NilAtomContext ctx);
}