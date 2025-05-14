// Generated from /home/nabil_al-hamza/IdeaProjects/angular-compiler/src/rules/angularParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link angularParser}.
 */
public interface angularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link angularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(angularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(angularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(angularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(angularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(angularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(angularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(angularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(angularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(angularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(angularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(angularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(angularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfig(angularParser.ComponentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfig(angularParser.ComponentConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(angularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(angularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(angularParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(angularParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(angularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(angularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(angularParser.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(angularParser.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(angularParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(angularParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(angularParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(angularParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(angularParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(angularParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void enterOpeningTag(angularParser.OpeningTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void exitOpeningTag(angularParser.OpeningTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(angularParser.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(angularParser.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(angularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(angularParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(angularParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(angularParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(angularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(angularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#styles}.
	 * @param ctx the parse tree
	 */
	void enterStyles(angularParser.StylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#styles}.
	 * @param ctx the parse tree
	 */
	void exitStyles(angularParser.StylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#bodyOfCss}.
	 * @param ctx the parse tree
	 */
	void enterBodyOfCss(angularParser.BodyOfCssContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#bodyOfCss}.
	 * @param ctx the parse tree
	 */
	void exitBodyOfCss(angularParser.BodyOfCssContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#objects}.
	 * @param ctx the parse tree
	 */
	void enterObjects(angularParser.ObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#objects}.
	 * @param ctx the parse tree
	 */
	void exitObjects(angularParser.ObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#elementCss}.
	 * @param ctx the parse tree
	 */
	void enterElementCss(angularParser.ElementCssContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#elementCss}.
	 * @param ctx the parse tree
	 */
	void exitElementCss(angularParser.ElementCssContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#bodyOfelement}.
	 * @param ctx the parse tree
	 */
	void enterBodyOfelement(angularParser.BodyOfelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#bodyOfelement}.
	 * @param ctx the parse tree
	 */
	void exitBodyOfelement(angularParser.BodyOfelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#valueCss}.
	 * @param ctx the parse tree
	 */
	void enterValueCss(angularParser.ValueCssContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#valueCss}.
	 * @param ctx the parse tree
	 */
	void exitValueCss(angularParser.ValueCssContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(angularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(angularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(angularParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(angularParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#listStatement}.
	 * @param ctx the parse tree
	 */
	void enterListStatement(angularParser.ListStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#listStatement}.
	 * @param ctx the parse tree
	 */
	void exitListStatement(angularParser.ListStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(angularParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(angularParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#objectExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionList(angularParser.ObjectExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#objectExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionList(angularParser.ObjectExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(angularParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(angularParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(angularParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(angularParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(angularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(angularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(angularParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(angularParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(angularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(angularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(angularParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(angularParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#bodyFor}.
	 * @param ctx the parse tree
	 */
	void enterBodyFor(angularParser.BodyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#bodyFor}.
	 * @param ctx the parse tree
	 */
	void exitBodyFor(angularParser.BodyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_type(angularParser.Single_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_type(angularParser.Single_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(angularParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(angularParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(angularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(angularParser.PropertyDeclarationContext ctx);
}