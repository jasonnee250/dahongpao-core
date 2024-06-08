// Generated from /Users/nijiaxin/Codes/dahongpao-core/src/parser/grammar/RMGLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RMGLParser}.
 */
public interface RMGLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RMGLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RMGLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RMGLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(RMGLParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(RMGLParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#charText}.
	 * @param ctx the parse tree
	 */
	void enterCharText(RMGLParser.CharTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#charText}.
	 * @param ctx the parse tree
	 */
	void exitCharText(RMGLParser.CharTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#annotationText}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationText(RMGLParser.AnnotationTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#annotationText}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationText(RMGLParser.AnnotationTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#lineAnnotationText}.
	 * @param ctx the parse tree
	 */
	void enterLineAnnotationText(RMGLParser.LineAnnotationTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#lineAnnotationText}.
	 * @param ctx the parse tree
	 */
	void exitLineAnnotationText(RMGLParser.LineAnnotationTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#lineGraphicDefine}.
	 * @param ctx the parse tree
	 */
	void enterLineGraphicDefine(RMGLParser.LineGraphicDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#lineGraphicDefine}.
	 * @param ctx the parse tree
	 */
	void exitLineGraphicDefine(RMGLParser.LineGraphicDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#graphicType}.
	 * @param ctx the parse tree
	 */
	void enterGraphicType(RMGLParser.GraphicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#graphicType}.
	 * @param ctx the parse tree
	 */
	void exitGraphicType(RMGLParser.GraphicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#propertyDefine}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefine(RMGLParser.PropertyDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#propertyDefine}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefine(RMGLParser.PropertyDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#textDefine}.
	 * @param ctx the parse tree
	 */
	void enterTextDefine(RMGLParser.TextDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#textDefine}.
	 * @param ctx the parse tree
	 */
	void exitTextDefine(RMGLParser.TextDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#annotationDefine}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDefine(RMGLParser.AnnotationDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#annotationDefine}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDefine(RMGLParser.AnnotationDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RMGLParser#linkDefine}.
	 * @param ctx the parse tree
	 */
	void enterLinkDefine(RMGLParser.LinkDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RMGLParser#linkDefine}.
	 * @param ctx the parse tree
	 */
	void exitLinkDefine(RMGLParser.LinkDefineContext ctx);
}