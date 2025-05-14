// Generated from /home/nabil_al-hamza/IdeaProjects/angular-compiler/src/rules/angularParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link angularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface angularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link angularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(angularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(angularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(angularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(angularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(angularParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(angularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfig(angularParser.ComponentConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(angularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(angularParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(angularParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(angularParser.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(angularParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(angularParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(angularParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#openingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningTag(angularParser.OpeningTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(angularParser.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(angularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(angularParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(angularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#styles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(angularParser.StylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#bodyOfCss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyOfCss(angularParser.BodyOfCssContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#objects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjects(angularParser.ObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#elementCss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCss(angularParser.ElementCssContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#bodyOfelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyOfelement(angularParser.BodyOfelementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#valueCss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueCss(angularParser.ValueCssContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(angularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(angularParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#listStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStatement(angularParser.ListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(angularParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#objectExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionList(angularParser.ObjectExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#objectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(angularParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(angularParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(angularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(angularParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(angularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(angularParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#bodyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFor(angularParser.BodyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_type(angularParser.Single_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(angularParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(angularParser.PropertyDeclarationContext ctx);
}