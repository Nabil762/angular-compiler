// Generated from C:/Users/ASUS/Desktop/compiler-angular-end/src/rules/angularParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(angularParser.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(angularParser.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProperty(angularParser.StandalonePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProperty(angularParser.StandalonePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStylesProperty(angularParser.StylesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStylesProperty(angularParser.StylesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterImportProperty(angularParser.ImportPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitImportProperty(angularParser.ImportPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(angularParser.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link angularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(angularParser.TemplatePropertyContext ctx);
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
	 * Enter a parse tree produced by the {@code TagNameElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTagNameElement(angularParser.TagNameElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagNameElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTagNameElement(angularParser.TagNameElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterTagElement(angularParser.TagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitTagElement(angularParser.TagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationElement(angularParser.InterpolationElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link angularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationElement(angularParser.InterpolationElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardTagElement}
	 * labeled alternative in {@link angularParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterStandardTagElement(angularParser.StandardTagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardTagElement}
	 * labeled alternative in {@link angularParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitStandardTagElement(angularParser.StandardTagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingTagElement}
	 * labeled alternative in {@link angularParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTagElement(angularParser.SelfClosingTagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingTagElement}
	 * labeled alternative in {@link angularParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTagElement(angularParser.SelfClosingTagElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#standardTag}.
	 * @param ctx the parse tree
	 */
	void enterStandardTag(angularParser.StandardTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#standardTag}.
	 * @param ctx the parse tree
	 */
	void exitStandardTag(angularParser.StandardTagContext ctx);
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
	 * Enter a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(angularParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(angularParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectiveAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveAttribute(angularParser.DirectiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectiveAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveAttribute(angularParser.DirectiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterBindingAttribute(angularParser.BindingAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitBindingAttribute(angularParser.BindingAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterEventAttribute(angularParser.EventAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventAttribute}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitEventAttribute(angularParser.EventAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttribute2}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute2(angularParser.HtmlAttribute2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttribute2}
	 * labeled alternative in {@link angularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute2(angularParser.HtmlAttribute2Context ctx);
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
	 * Enter a parse tree produced by the {@code ListStatement_Declaration}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListStatement_Declaration(angularParser.ListStatement_DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListStatement_Declaration}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListStatement_Declaration(angularParser.ListStatement_DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationProperty}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationProperty(angularParser.DeclarationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationProperty}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationProperty(angularParser.DeclarationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function_Declaration}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_Declaration(angularParser.Function_DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function_Declaration}
	 * labeled alternative in {@link angularParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_Declaration(angularParser.Function_DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link angularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(angularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(angularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(angularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(angularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(angularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(angularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexAssignment3}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterComplexAssignment3(angularParser.ComplexAssignment3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexAssignment3}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitComplexAssignment3(angularParser.ComplexAssignment3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexAssignment2}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterComplexAssignment2(angularParser.ComplexAssignment2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexAssignment2}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitComplexAssignment2(angularParser.ComplexAssignment2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment(angularParser.SimpleAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssignment}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment(angularParser.SimpleAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAssignment2}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAssignment2(angularParser.SimpleAssignment2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAssignment2}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAssignment2(angularParser.SimpleAssignment2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IFELSE}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterIFELSE(angularParser.IFELSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFELSE}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitIFELSE(angularParser.IFELSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexAssignment}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterComplexAssignment(angularParser.ComplexAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexAssignment}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitComplexAssignment(angularParser.ComplexAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(angularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link angularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(angularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link angularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(angularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link angularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(angularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(angularParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(angularParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericValue(angularParser.NumericValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericValue(angularParser.NumericValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(angularParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(angularParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallValue(angularParser.FunctionCallValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallValue}
	 * labeled alternative in {@link angularParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallValue(angularParser.FunctionCallValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(angularParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(angularParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcreteType}
	 * labeled alternative in {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 */
	void enterConcreteType(angularParser.ConcreteTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcreteType}
	 * labeled alternative in {@link angularParser#single_type}.
	 * @param ctx the parse tree
	 */
	void exitConcreteType(angularParser.ConcreteTypeContext ctx);
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