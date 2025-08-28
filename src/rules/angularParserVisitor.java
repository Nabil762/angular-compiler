// Generated from C:/Users/ASUS/Desktop/compiler-angular-end/src/rules/angularParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(angularParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(angularParser.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProperty(angularParser.StylesPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportProperty(angularParser.ImportPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(angularParser.TemplatePropertyContext ctx);
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
	 * Visit a parse tree produced by the {@code TagNameElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagNameElement(angularParser.TagNameElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagElement(angularParser.TagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationElement(angularParser.InterpolationElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardTagElement}
	 * labeled alternative in {@link angularParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardTagElement(angularParser.StandardTagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingTagElement}
	 * labeled alternative in {@link angularParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTagElement(angularParser.SelfClosingTagElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#standardTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardTag(angularParser.StandardTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(angularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(angularParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectiveAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveAttribute(angularParser.DirectiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BindingAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttribute(angularParser.BindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(angularParser.EventAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttribute2}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute2(angularParser.HtmlAttribute2Context ctx);
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
	 * Visit a parse tree produced by the {@code ListStatement_Declaration}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStatement_Declaration(angularParser.ListStatement_DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationProperty}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationProperty(angularParser.DeclarationPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function_Declaration}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_Declaration(angularParser.Function_DeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link angularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(angularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(angularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(angularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexAssignment3}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAssignment3(angularParser.ComplexAssignment3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexAssignment2}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAssignment2(angularParser.ComplexAssignment2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment(angularParser.SimpleAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAssignment2}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssignment2(angularParser.SimpleAssignment2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IFELSE}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFELSE(angularParser.IFELSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexAssignment}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAssignment(angularParser.ComplexAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(angularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(angularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(angularParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericValue(angularParser.NumericValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(angularParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallValue(angularParser.FunctionCallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(angularParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcreteType}
	 * labeled alternative in {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcreteType(angularParser.ConcreteTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link angularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(angularParser.PropertyDeclarationContext ctx);
}