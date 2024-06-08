// Generated from /Users/nijiaxin/Codes/dahongpao-core/src/parser/grammar/RMGLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RMGLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RMGLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RMGLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RMGLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(RMGLParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#charText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharText(RMGLParser.CharTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#annotationText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationText(RMGLParser.AnnotationTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#lineAnnotationText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineAnnotationText(RMGLParser.LineAnnotationTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#lineGraphicDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineGraphicDefine(RMGLParser.LineGraphicDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#graphicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphicType(RMGLParser.GraphicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#propertyDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDefine(RMGLParser.PropertyDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#textDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDefine(RMGLParser.TextDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#annotationDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDefine(RMGLParser.AnnotationDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RMGLParser#linkDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkDefine(RMGLParser.LinkDefineContext ctx);
}