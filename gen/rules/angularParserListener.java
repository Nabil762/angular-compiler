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
	 * Enter a parse tree produced by {@link angularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(angularParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(angularParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(angularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(angularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(angularParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(angularParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#tagStatement}.
	 * @param ctx the parse tree
	 */
	void enterTagStatement(angularParser.TagStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#tagStatement}.
	 * @param ctx the parse tree
	 */
	void exitTagStatement(angularParser.TagStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#imgTag}.
	 * @param ctx the parse tree
	 */
	void enterImgTag(angularParser.ImgTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#imgTag}.
	 * @param ctx the parse tree
	 */
	void exitImgTag(angularParser.ImgTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(angularParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(angularParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(angularParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(angularParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(angularParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(angularParser.AttributeValueContext ctx);
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
	 * Enter a parse tree produced by {@link angularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(angularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(angularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(angularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(angularParser.EventBindingContext ctx);
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
	 * Enter a parse tree produced by {@link angularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(angularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(angularParser.PropertyBindingContext ctx);
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
	 * Enter a parse tree produced by {@link angularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(angularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(angularParser.LiteralContext ctx);
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