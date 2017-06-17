// Generated from miniC.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniCParser}.
 */
public interface miniCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniCParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(miniCParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(miniCParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLib(miniCParser.LibContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLib(miniCParser.LibContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(miniCParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(miniCParser.InitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(miniCParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(miniCParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(miniCParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(miniCParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#selectionStat}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStat(miniCParser.SelectionStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#selectionStat}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStat(miniCParser.SelectionStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#iterationStat}.
	 * @param ctx the parse tree
	 */
	void enterIterationStat(miniCParser.IterationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#iterationStat}.
	 * @param ctx the parse tree
	 */
	void exitIterationStat(miniCParser.IterationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#assigmentStat}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentStat(miniCParser.AssigmentStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#assigmentStat}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentStat(miniCParser.AssigmentStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#varibleDecl}.
	 * @param ctx the parse tree
	 */
	void enterVaribleDecl(miniCParser.VaribleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#varibleDecl}.
	 * @param ctx the parse tree
	 */
	void exitVaribleDecl(miniCParser.VaribleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#arithmeticStat}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticStat(miniCParser.ArithmeticStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#arithmeticStat}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticStat(miniCParser.ArithmeticStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#inOutStat}.
	 * @param ctx the parse tree
	 */
	void enterInOutStat(miniCParser.InOutStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#inOutStat}.
	 * @param ctx the parse tree
	 */
	void exitInOutStat(miniCParser.InOutStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(miniCParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(miniCParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miniCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miniCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#scanf}.
	 * @param ctx the parse tree
	 */
	void enterScanf(miniCParser.ScanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#scanf}.
	 * @param ctx the parse tree
	 */
	void exitScanf(miniCParser.ScanfContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(miniCParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(miniCParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(miniCParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(miniCParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(miniCParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(miniCParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#scanVar}.
	 * @param ctx the parse tree
	 */
	void enterScanVar(miniCParser.ScanVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#scanVar}.
	 * @param ctx the parse tree
	 */
	void exitScanVar(miniCParser.ScanVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#scanParam}.
	 * @param ctx the parse tree
	 */
	void enterScanParam(miniCParser.ScanParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#scanParam}.
	 * @param ctx the parse tree
	 */
	void exitScanParam(miniCParser.ScanParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#variables_1}.
	 * @param ctx the parse tree
	 */
	void enterVariables_1(miniCParser.Variables_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#variables_1}.
	 * @param ctx the parse tree
	 */
	void exitVariables_1(miniCParser.Variables_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#variables_2}.
	 * @param ctx the parse tree
	 */
	void enterVariables_2(miniCParser.Variables_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#variables_2}.
	 * @param ctx the parse tree
	 */
	void exitVariables_2(miniCParser.Variables_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#printParam}.
	 * @param ctx the parse tree
	 */
	void enterPrintParam(miniCParser.PrintParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#printParam}.
	 * @param ctx the parse tree
	 */
	void exitPrintParam(miniCParser.PrintParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCParser#printWord}.
	 * @param ctx the parse tree
	 */
	void enterPrintWord(miniCParser.PrintWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCParser#printWord}.
	 * @param ctx the parse tree
	 */
	void exitPrintWord(miniCParser.PrintWordContext ctx);
}