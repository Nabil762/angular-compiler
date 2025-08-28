package visitor;

import AST.*;
import ErrorHandling.SemanticError;
import rules.angularParser;
import rules.angularParserBaseVisitor;
import symbolTableAngular.*;

import java.util.Objects;

public class AngularVisitor extends angularParserBaseVisitor {
    AttributeSymbolTable attributeSymbolTable = new AttributeSymbolTable();
    DetectCompositionSymbolTable detectCompositionSymbolTable = new DetectCompositionSymbolTable();
    DetectSelectorSymbolTable detectSelectorSymbolTable = new DetectSelectorSymbolTable();
    DetectTemplateSymbolTable detectTemplateSymbolTable = new DetectTemplateSymbolTable();
    DeclarationFunctionSymbolTable declarationFunctionSymbolTable = new DeclarationFunctionSymbolTable();
    DeclarationObjectInInterfaceSymbolTable declarationObjectInInterfaceSymbolTable = new DeclarationObjectInInterfaceSymbolTable();
    AttributeCssSymbolTable attributeCssSymbolTable = new AttributeCssSymbolTable();
    ClassDeclarationAndStandaloneSymbolTable classDeclarationAndStandaloneSymbolTable = new ClassDeclarationAndStandaloneSymbolTable();

    @Override
    public Program visitProgram(angularParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            program.getStatementList().add(visitStatement(ctx.statement(i)));
        }
        SemanticError semanticError = new SemanticError(attributeSymbolTable, detectCompositionSymbolTable, detectSelectorSymbolTable, detectTemplateSymbolTable, declarationFunctionSymbolTable, declarationObjectInInterfaceSymbolTable, attributeCssSymbolTable, classDeclarationAndStandaloneSymbolTable);
        semanticError.check();
        semanticError.printErrors();
        program.generatedCode();
        return program;
    }

    @Override
    public Statement visitStatement(angularParser.StatementContext ctx) {
        Statement statement = new Statement();
        for (int i = 0; i < ctx.importStatement().size(); i++) {
            statement.getImportStatementList().add(visitImportStatement(ctx.importStatement(i)));
        }
        for (int i = 0; i < ctx.interfaceDeclaration().size(); i++) {
            statement.getInterfaceDeclarationList().add(visitInterfaceDeclaration(ctx.interfaceDeclaration(i)));
        }
        statement.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        return statement;
    }

    @Override
    public ImportStatement visitImportStatement(angularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        importStatement.setLibrary(ctx.STRING().getText());
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            importStatement.getIdentifiers().add(ctx.IDENTIFIER(i).getText());
            Row row = new Row();
            row.setType("StringImportStatement");
            row.setValue(ctx.IDENTIFIER(i).getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            detectCompositionSymbolTable.setRow(row);
        }
        return importStatement;
    }

    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(angularParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();
        interfaceDeclaration.setInterfaceName(ctx.IDENTIFIER().getText());
        interfaceDeclaration.setInterfaceBody(visitInterfaceBody(ctx.interfaceBody()));
        return interfaceDeclaration;
    }

    @Override
    public InterfaceBody visitInterfaceBody(angularParser.InterfaceBodyContext ctx) {
        InterfaceBody interfaceBody = new InterfaceBody();
        for (int i = 0; i < ctx.propertyDeclaration().size(); i++) {
            interfaceBody.getPropertyDeclarationList().add(visitPropertyDeclaration(ctx.propertyDeclaration(i)));
        }
        return interfaceBody;
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(angularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setComponentConfig(visitComponentConfig(ctx.componentConfig()));
        return componentDeclaration;
    }

    @Override
    public ComponentConfig visitComponentConfig(angularParser.ComponentConfigContext ctx) {
        ComponentConfig componentConfig = new ComponentConfig();
        for (int i = 0; i < ctx.propertyAssignment().size(); i++) {
            componentConfig.getPropertyAssignmentList().add((PropertyAssignment) visit(ctx.propertyAssignment(i)));
        }
        return componentConfig;
    }

    @Override
    public PropertyAssignment visitImportProperty(angularParser.ImportPropertyContext ctx) {
        return visitImportDeclaration(ctx.importDeclaration());
    }

    @Override
    public PropertyAssignment visitSelectorProperty(angularParser.SelectorPropertyContext ctx) {
        return visitSelector(ctx.selector());
    }

    @Override
    public PropertyAssignment visitStandaloneProperty(angularParser.StandalonePropertyContext ctx) {
        return visitStandalone(ctx.standalone());
    }

    @Override
    public PropertyAssignment visitTemplateProperty(angularParser.TemplatePropertyContext ctx) {
        return visitTemplate(ctx.template());
    }

    @Override
    public PropertyAssignment visitStylesProperty(angularParser.StylesPropertyContext ctx) {
        return visitStyles(ctx.styles());
    }

    @Override
    public ImportDeclaration visitImportDeclaration(angularParser.ImportDeclarationContext ctx) {
        ImportDeclaration importDeclaration = new ImportDeclaration();
        if (ctx.IDENTIFIER() != null) {
            importDeclaration.setId(ctx.IDENTIFIER().getText());
            Row row = new Row();
            row.setType("StringImportDecl");
            row.setValue(ctx.IDENTIFIER().getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            detectCompositionSymbolTable.setRow(row);
        }
        return importDeclaration;
    }

    @Override
    public Selector visitSelector(angularParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx.STRING() != null) {
            selector.setSTRING_LIT(ctx.STRING().getText());
            Row row = new Row();
            row.setType("StringSelector");
            row.setValue(ctx.SELECTOR().getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            detectSelectorSymbolTable.setRow(row);
        }
        return selector;
    }

    @Override
    public Standalone visitStandalone(angularParser.StandaloneContext ctx) {
        Standalone standalone = new Standalone();
        if (ctx.BOOLEAN() != null) {
            standalone.setIsboolean(ctx.BOOLEAN().getText());
            Row row = new Row();
            row.setType("StringStandalone");
            row.setValue(ctx.BOOLEAN().getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            classDeclarationAndStandaloneSymbolTable.setRow(row);
        }
        return standalone;
    }

    @Override
    public Template visitTemplate(angularParser.TemplateContext ctx) {
        Template template = new Template();
        for (int i = 0; i < ctx.element().size(); i++) {
            if (ctx.element(i) != null) {
                template.getElement().add((Element) visit(ctx.element(i)));
                Row row = new Row();
                row.setType("StringTemplate");
                row.setValue(ctx.TEMPLATE().getText());
                row.setLine(ctx.getStart().getLine());
                row.setPosition(ctx.getStart().getCharPositionInLine());
                detectTemplateSymbolTable.setRow(row);
            }
        }
        return template;
    }

    @Override
    public Style visitStyles(angularParser.StylesContext ctx) {
        Style style = new Style();
        if (ctx.bodyOfCss() != null) {
            style.setBodyOfcss(visitBodyOfCss(ctx.bodyOfCss()));
        }
        return style;
    }

    @Override
    public Element visitTagElement(angularParser.TagElementContext ctx) {
        Element element = new Element();
        if (ctx.tag() != null) {
            element.setTag((Tag) visit(ctx.tag()));
        }
        return element;
    }

    @Override
    public Element visitTagNameElement(angularParser.TagNameElementContext ctx) {
        Element element = new Element();
        if (ctx.TAG_NAME() != null && ctx.COLON1() != null) {
            String name = ctx.TAG_NAME() + " " + ctx.COLON1();
            element.setHtmlName(name);
        } else if (ctx.TAG_NAME() != null) {
            element.setHtmlName(ctx.TAG_NAME().toString());
        }
        return element;
    }

    @Override
    public Element visitInterpolationElement(angularParser.InterpolationElementContext ctx) {
        Element element = new Element();
        if (ctx.interpolation() != null) {
            element.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        return element;
    }

    @Override
    public Tag visitStandardTagElement(angularParser.StandardTagElementContext ctx) {
        return visitStandardTag(ctx.standardTag());
    }

    @Override
    public Tag visitSelfClosingTagElement(angularParser.SelfClosingTagElementContext ctx) {
        return visitSelfClosingTag(ctx.selfClosingTag());
    }

    @Override
    public Tag visitStandardTag(angularParser.StandardTagContext ctx) {
        StandardTag standardTag = new StandardTag();
        if (!ctx.H1().isEmpty()) {
            standardTag.setTag_name(ctx.H1(0).toString());
        }
        if (!ctx.H2().isEmpty()) {
            standardTag.setTag_name(ctx.H2(0).toString());
        }
        if (!ctx.H3().isEmpty()) {
            standardTag.setTag_name(ctx.H3(0).toString());
        }
        if (!ctx.H4().isEmpty()) {
            standardTag.setTag_name(ctx.H4(0).toString());
        }
        if (!ctx.H5().isEmpty()) {
            standardTag.setTag_name(ctx.H5(0).toString());
        }
        if (!ctx.H6().isEmpty()) {
            standardTag.setTag_name(ctx.H6(0).toString());
        }
        if (!ctx.P().isEmpty()) {
            standardTag.setTag_name(ctx.P(0).toString());
        }
        if (!ctx.UL().isEmpty()) {
            standardTag.setTag_name(ctx.UL(0).toString());
        }
        if (!ctx.DIV().isEmpty()) {
            standardTag.setTag_name(ctx.DIV(0).toString());
        }
        if (!ctx.STRONG().isEmpty()) {
            standardTag.setTag_name(ctx.STRONG(0).toString());
        }
        if (!ctx.LI().isEmpty()) {
            standardTag.setTag_name(ctx.LI(0).toString());
        }
        if (!ctx.BUTTON().isEmpty()) {
            standardTag.setTag_name(ctx.BUTTON(0).toString());
        }
        if (!ctx.FORM().isEmpty()) {
            standardTag.setTag_name(ctx.FORM(0).toString());
        }
        if (!ctx.LABLE().isEmpty()) {
            standardTag.setTag_name(ctx.LABLE(0).toString());
        }
        if (!ctx.INPUT().isEmpty()) {
            standardTag.setTag_name(ctx.INPUT(0).toString());
        }
        if (ctx.attributes() != null) {
            for (int i = 0; i < ctx.attributes().size(); i++) {
                if (ctx.attributes(i) != null) {
                    standardTag.getAttributes().add((Attributes) visit(ctx.attributes(i)));
                }
            }
        }
        if (ctx.element() != null) {
            for (int i = 0; i < ctx.element().size(); i++) {
                if (ctx.element(i) != null) {
                    standardTag.getElements().add((Element) visit(ctx.element(i)));
                }
            }
        }
        return standardTag;
    }

    @Override
    public Tag visitSelfClosingTag(angularParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        selfClosingTag.setTag_name(ctx.IMG().toString());
        if (ctx.attributes() != null) {
            for (int i = 0; i < ctx.attributes().size(); i++) {
                if (ctx.attributes(i) != null) {
                    selfClosingTag.getAttributes().add((Attributes) visit(ctx.attributes(i)));
                }
            }
        }
        return selfClosingTag;
    }

    @Override
    public Attributes visitHtmlAttribute(angularParser.HtmlAttributeContext ctx) {
        Attributes attributes = new Attributes();

        if (ctx.STRING1() != null && ctx.STRING1().getText() != null) {
            attributes.setText(ctx.STRING1().getText());
        }
        if (ctx.TAG_NAME() != null && ctx.TAG_NAME().getText() != null) {
            attributes.setHtmlName(ctx.TAG_NAME().getText());
        }
        return attributes;
    }

    @Override
    public Attributes visitDirectiveAttribute(angularParser.DirectiveAttributeContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.DIRECTIVE_NAME() != null && ctx.STRING1() != null) {
            attributes.setStructuralDir(ctx.DIRECTIVE_NAME().getText());
            attributes.setText(ctx.STRING1().getText());
        }
        return attributes;
    }

    @Override
    public Attributes visitBindingAttribute(angularParser.BindingAttributeContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.BINDING_PROPERTY() != null && ctx.STRING1() != null) {
            attributes.setBinding(ctx.BINDING_PROPERTY().getText());
            attributes.setText(ctx.STRING1().getText());
        }
        return attributes;
    }

    @Override
    public Attributes visitEventAttribute(angularParser.EventAttributeContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.STANDARD_EVENT() != null && ctx.STRING1() != null) {
            attributes.setEvent(ctx.STANDARD_EVENT().getText());
            attributes.setText(ctx.STRING1().getText());
        }

        return attributes;
    }

    @Override
    public Attributes visitHtmlAttribute2(angularParser.HtmlAttribute2Context ctx) {
        Attributes attributes = new Attributes();
        if (ctx.TAG_NAME() != null) {
            attributes.setHtmlName(ctx.TAG_NAME().getText());
        }
        return attributes;
    }

    @Override
    public Interpolation visitInterpolation(angularParser.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();
        if (ctx.TAG_NAME() != null) {
            interpolation.setNAME_HTML(ctx.TAG_NAME().getText());
        }
        return interpolation;
    }

    @Override
    public BodyOfCss visitBodyOfCss(angularParser.BodyOfCssContext ctx) {
        BodyOfCss bodyOfCss = new BodyOfCss();
        if (ctx.objects() != null) {
            bodyOfCss.setObjecte(visitObjects(ctx.objects()));
        }
        return bodyOfCss;
    }

    @Override
    public Objecte visitObjects(angularParser.ObjectsContext ctx) {
        Objecte objecte = new Objecte();
        if (ctx.elementCss() != null) {
            for (int i = 0; i < ctx.elementCss().size(); i++) {
                if (ctx.elementCss(i) != null) {
                    objecte.getElementCssList().add(visitElementCss(ctx.elementCss(i)));
                }
            }
        }
        return objecte;
    }

    @Override
    public ElementCss visitElementCss(angularParser.ElementCssContext ctx) {
        ElementCss elementCss = new ElementCss();
        if (ctx.ID() != null) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < ctx.ID().size(); i++) {
                s.append(ctx.ID(i).toString()).append(" ");
            }
            elementCss.setIdentifier(s.toString());
        }
        if (ctx.bodyOfelement() != null) {
            for (int i = 0; i < ctx.bodyOfelement().size(); i++) {
                if (ctx.bodyOfelement(i) != null) {
                    elementCss.getBodyOfelementList().add(visitBodyOfelement(ctx.bodyOfelement(i)));
                }
            }
        }
        return elementCss;
    }

    @Override
    public BodyOfelement visitBodyOfelement(angularParser.BodyOfelementContext ctx) {
        BodyOfelement bodyOfelement = new BodyOfelement();
        if (ctx.ID() != null && ctx.ID().getText() != null) {
            bodyOfelement.setIdentifier(ctx.ID().getText());
            Row row = new Row();
            row.setType("StringAttCss");
            row.setValue(ctx.ID().getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            attributeCssSymbolTable.setRow(row);
        }
        if (ctx.valueCss() != null) {
            bodyOfelement.setValueCss(visitValueCss(ctx.valueCss()));
        }
        return bodyOfelement;

    }

    @Override
    public ValueCss visitValueCss(angularParser.ValueCssContext ctx) {
        ValueCss valueCss = new ValueCss();
        if (ctx.ID() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                if (ctx.ID(i) != null) {
                    valueCss.getIdentifiers().add(ctx.ID(i).getText());
                }
            }
        }
        return valueCss;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(angularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        classDeclaration.setClass_name(ctx.IDENTIFIER().getText());
        for (int i = 0; i < ctx.listDeclaration().size(); i++) {
            classDeclaration.getListDeclarations().add((ListDeclaration) visit(ctx.listDeclaration(i)));
            Row row = new Row();
            row.setType("StringClassDeclaration");
            row.setValue(ctx.IDENTIFIER().getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            classDeclarationAndStandaloneSymbolTable.setRow(row);
        }
        return classDeclaration;
    }

    @Override
    public ListDeclaration visitListStatement_Declaration(angularParser.ListStatement_DeclarationContext ctx) {
        return visitListStatement((angularParser.ListStatementContext) ctx.listStatement());
    }

    @Override
    public ListDeclaration visitDeclarationProperty(angularParser.DeclarationPropertyContext ctx) {
        return visitProperty_declaration(ctx.property_declaration());
    }

    @Override
    public ListDeclaration visitFunction_Declaration(angularParser.Function_DeclarationContext ctx) {
        return visitFunctionDeclaration(ctx.functionDeclaration());
    }

    @Override
    public ListStatement visitListStatement(angularParser.ListStatementContext ctx) {
        ListStatement listStatement = new ListStatement();
        listStatement.setArray_name(ctx.IDENTIFIER(0).getText());
        listStatement.setName_object(ctx.IDENTIFIER(1).getText());
        listStatement.setArrayExpression(visitArrayExpression(ctx.arrayExpression()));
        return listStatement;
    }

    @Override
    public ArrayExpression visitArrayExpression(angularParser.ArrayExpressionContext ctx) {
        ArrayExpression arrayExpression = new ArrayExpression();
        arrayExpression.setObjectExpressionList(visitObjectExpressionList(ctx.objectExpressionList()));
        Row row = new Row();
        row.setType("numberObjectExpressionList");
        row.setValue(String.valueOf(ctx.objectExpressionList().objectExpression().size()));
        row.setLine(ctx.getStart().getLine());
        row.setPosition(ctx.getStart().getCharPositionInLine());
        attributeSymbolTable.setRow(row);
        declarationObjectInInterfaceSymbolTable.setRow(row);
        return arrayExpression;
    }

    @Override
    public ObjectExpressionList visitObjectExpressionList(angularParser.ObjectExpressionListContext ctx) {
        ObjectExpressionList objectExpressionList = new ObjectExpressionList();
        for (int i = 0; i < ctx.objectExpression().size(); i++) {
            objectExpressionList.getObjectExpression().add(visitObjectExpression(ctx.objectExpression(i)));
        }
        return objectExpressionList;
    }

    @Override
    public ObjectExpression visitObjectExpression(angularParser.ObjectExpressionContext ctx) {
        ObjectExpression objectExpression = new ObjectExpression();
        objectExpression.setPropertyList(visitPropertyList(ctx.propertyList()));
        return objectExpression;
    }

    @Override
    public PropertyList visitPropertyList(angularParser.PropertyListContext ctx) {
        PropertyList propertyList = new PropertyList();
        for (int i = 0; i < ctx.property().size(); i++) {
            propertyList.getProperties().add(visitProperty(ctx.property(i)));
        }
        return propertyList;
    }

    @Override
    public Property visitProperty(angularParser.PropertyContext ctx) {
        Property property = new Property();
        if (ctx.IDENTIFIER() != null) {
            property.setID(ctx.IDENTIFIER().getText());
            property.setValueExpression((ValueExpression) visit(ctx.valueExpression()));
        }
        if (ctx.IDENTIFIER() != null && (ValueExpression) visit(ctx.valueExpression()) != null && !Objects.equals(((ValueExpression) visit(ctx.valueExpression())).getText(), "\"\"")) {
            Row row = new Row();
            row.setType("StringInFunction");
            row.setValue(ctx.IDENTIFIER().getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            attributeSymbolTable.setRow(row);
            declarationObjectInInterfaceSymbolTable.setRow(row);
        }

        return property;
    }

    @Override
    public Property_declaration visitProperty_declaration(angularParser.Property_declarationContext ctx) {
        Property_declaration property_declaration = new Property_declaration();
        property_declaration.setID(ctx.IDENTIFIER().getText());
        for (int i = 0; i < ctx.type().size(); i++) {
            property_declaration.getTypes().add(visitType(ctx.type(i)));
        }
        return property_declaration;
    }

    @Override
    public Type visitType(angularParser.TypeContext ctx) {
        Type type = new Type();
        for (int i = 0; i < ctx.single_type().size(); i++) {
            type.getSingleTypeList().add((SingleType) visit(ctx.single_type(i)));
        }
        return type;
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(angularParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.setFunctionName(ctx.IDENTIFIER().getText());
        if (ctx.parameters() != null) {
            functionDeclaration.setParameterList(visitParameters(ctx.parameters()));
        }
        if (ctx.type() != null) {
            functionDeclaration.setType(visitType(ctx.type()));
            Row row = new Row();
            row.setType("StringReturnValue");
            row.setValue(ctx.type().single_type(0).getText());
            row.setLine(ctx.getStart().getLine());
            row.setPosition(ctx.getStart().getCharPositionInLine());
            declarationFunctionSymbolTable.setRow(row);
        }
        if (ctx.functionBody() != null) {
            for (int i = 0; i < ctx.functionBody().size(); i++) {
                functionDeclaration.getFunctionBodyList().add((FunctionBody) visit(ctx.functionBody(i)));
                Row row = new Row();
                row.setType("StringFunctionName");
                row.setValue(ctx.IDENTIFIER().getText());
                row.setLine(ctx.getStart().getLine());
                row.setPosition(ctx.getStart().getCharPositionInLine());
                declarationFunctionSymbolTable.setRow(row);
            }
        }
        return functionDeclaration;
    }

    @Override
    public Parameter visitParameter(angularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setIdentifier(ctx.IDENTIFIER().getText());
        parameter.setSingleType((SingleType) visit(ctx.single_type()));
        Row row = new Row();
        row.setType("StringParameter");
        row.setValue(ctx.IDENTIFIER().getText());
        row.setLine(ctx.getStart().getLine());
        row.setPosition(ctx.getStart().getCharPositionInLine());
        declarationFunctionSymbolTable.setRow(row);
        return parameter;
    }

    @Override
    public ParameterList visitParameters(angularParser.ParametersContext ctx) {
        ParameterList parameterList = new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameterList.getParameters().add(visitParameter(ctx.parameter(i)));
        }
        return parameterList;
    }

    @Override
    public FunctionBody visitSimpleAssignment(angularParser.SimpleAssignmentContext ctx) {
        FunctionBody simpleAssignment = new FunctionBody();
        if (ctx.IDENTIFIER(1) != null && ctx.IDENTIFIER(0) != null) {
            simpleAssignment.setIdentifier1(ctx.IDENTIFIER(0).getText());
            simpleAssignment.setIdentifier2(ctx.IDENTIFIER(1).getText());
        } else if (ctx.TYPE() != null && ctx.IDENTIFIER(0) != null) {
            simpleAssignment.setIdentifier1(ctx.IDENTIFIER(0).getText());
            simpleAssignment.setIdentifier2(ctx.TYPE().getText());
        }
        return simpleAssignment;
    }

    @Override
    public FunctionBody visitSimpleAssignment2(angularParser.SimpleAssignment2Context ctx) {
        FunctionBody simpleAssignment = new FunctionBody();
        if (ctx.IDENTIFIER(1) != null && ctx.IDENTIFIER(0) != null && ctx.IDENTIFIER(2) != null) {
            simpleAssignment.setIdentifier1(ctx.IDENTIFIER(0).getText() + "[" + ctx.IDENTIFIER(1).getText() + "]");
            simpleAssignment.setIdentifier2(ctx.IDENTIFIER(2).getText());
        } else if (ctx.TYPE() != null && ctx.IDENTIFIER(0) != null && ctx.IDENTIFIER(1) != null) {
            simpleAssignment.setIdentifier1(ctx.IDENTIFIER(0).getText() + "[" + ctx.IDENTIFIER(1).getText() + "]");
            simpleAssignment.setIdentifier2(ctx.TYPE().getText());
        }
        return simpleAssignment;
    }
//   | IDENTIFIER LBRACKET IDENTIFIER RBRACKET EQUAL (IDENTIFIER|TYPE) SEMICOLON           # SimpleAssignment2

    @Override
    public FunctionBody visitComplexAssignment(angularParser.ComplexAssignmentContext ctx) {
        FunctionBody complexAssignment = new FunctionBody();
        if (ctx.valueExpression() != null && ctx.IDENTIFIER() != null) {
            complexAssignment.setIdentifier1(ctx.IDENTIFIER().getText());
            complexAssignment.setValueExpression((ValueExpression) visit(ctx.valueExpression()));
        }
        return complexAssignment;
    }

    @Override
    public FunctionBody visitComplexAssignment2(angularParser.ComplexAssignment2Context ctx) {
        FunctionBody complexAssignment2 = new FunctionBody();
        if (ctx.IDENTIFIER(0) != null && ctx.IDENTIFIER(6) != null) {
            complexAssignment2.setIdentifier1(ctx.IDENTIFIER(0).getText());
            complexAssignment2.setIdentifier2(ctx.IDENTIFIER(1).getText());
            complexAssignment2.setIdentifier3(ctx.IDENTIFIER(2).getText());
            complexAssignment2.setIdentifier4(ctx.IDENTIFIER(3).getText());
            complexAssignment2.setIdentifier5(ctx.IDENTIFIER(4).getText());
            complexAssignment2.setIdentifier6(ctx.IDENTIFIER(5).getText());
            complexAssignment2.setIdentifier7(ctx.IDENTIFIER(6).getText());
        }
        if (ctx.NOT_EQUAL() != null)
            complexAssignment2.setEq(ctx.NOT_EQUAL().getText());
        else {
            complexAssignment2.setEq(ctx.EQUALEQUAL().getText());
        }
        if (ctx.THIS().size() == 2) {
            complexAssignment2.setIdentifier1("this." + ctx.IDENTIFIER(0).getText());

        } else {
            complexAssignment2.setIdentifier1("const " + ctx.IDENTIFIER(0).getText());

        }
        return complexAssignment2;
    }

    @Override
    public FunctionBody visitComplexAssignment3(angularParser.ComplexAssignment3Context ctx) {
        FunctionBody complexAssignment3 = new FunctionBody();
        if (ctx.IDENTIFIER() != null && ctx.objectExpression() != null) {
            complexAssignment3.setIdentifier1(ctx.IDENTIFIER().getText());
            complexAssignment3.setObjectExpression((ObjectExpression) visit(ctx.objectExpression()));

        }
        return complexAssignment3;
    }

    @Override
    public FunctionBody visitIFELSE(angularParser.IFELSEContext ctx) {
        FunctionBody functionBody = new FunctionBody();
        if (ctx.functionBody(0) != null) {
            for (int i = 0; i < ctx.functionBody().size(); i++) {
                if (Objects.equals(ctx.functionBody(i).toString(), ctx.functionBody(0).toString())) {
                    functionBody.getFunctionBody1().add((FunctionBody) visit(ctx.functionBody(i)));
                } else {
                    functionBody.getFunctionBody2().add((FunctionBody) visit(ctx.functionBody(i)));
                }
            }
        }
        if (ctx.CONFIRM() != null) {
            functionBody.setIdentifier1(ctx.CONFIRM().getText() + "(" + ctx.STRING().getText() + ")");
        } else {
            functionBody.setIdentifier1(ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1));
        }
        return functionBody;
    }

    @Override
    public FunctionBody visitExpressionStatement(angularParser.ExpressionStatementContext ctx) {
        FunctionBody expressionStatement = new FunctionBody();
        if (ctx.valueExpression() != null) {
            expressionStatement.setValueExpression((ValueExpression) visit(ctx.valueExpression()));
        }
        return expressionStatement;
    }

    @Override
    public FunctionCall visitFunctionCall(angularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        functionCall.setFunctionName(ctx.IDENTIFIER().getText());
        for (int i = 0; i < ctx.valueExpression().size(); i++) {
            functionCall.addArgument((ValueExpression) visit(ctx.valueExpression(i)));
        }
        return functionCall;
    }

    @Override
    public ValueExpression visitStringValue(angularParser.StringValueContext ctx) {
        ValueExpression stringValue = new ValueExpression();
        if (ctx.STRING() != null) {
            stringValue.setText(ctx.STRING().getText());
        }
        return stringValue;
    }

    @Override
    public ValueExpression visitNumericValue(angularParser.NumericValueContext ctx) {
        ValueExpression numericValue = new ValueExpression();
        if (ctx.NUMBER() != null) {
            numericValue.setInteger(Integer.valueOf(ctx.NUMBER().getText()));
        }
        return numericValue;
    }

    @Override
    public ValueExpression visitBooleanValue(angularParser.BooleanValueContext ctx) {
        ValueExpression booleanValue = new ValueExpression();

        if (ctx.BOOLEAN() != null) {
            booleanValue.setIsBoolean(ctx.BOOLEAN().getText());
        }
        return booleanValue;
    }

    @Override
    public ValueExpression visitFunctionCallValue(angularParser.FunctionCallValueContext ctx) {
        ValueExpression functionCallValue = new ValueExpression();
        if (ctx.functionCall() != null) {
            functionCallValue.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        }
        return functionCallValue;
    }

    @Override
    public SingleType visitIdentifierType(angularParser.IdentifierTypeContext ctx) {
        SingleType identifierType = new SingleType();
        if (ctx.IDENTIFIER() != null) {
            identifierType.setID(ctx.IDENTIFIER().getText());
        }
        return identifierType;
    }

    @Override
    public SingleType visitConcreteType(angularParser.ConcreteTypeContext ctx) {
        SingleType concreteType = new SingleType();
        if (ctx.TYPE() != null) {
            concreteType.setType(ctx.TYPE().getText());
        }
        return concreteType;
    }

    @Override
    public PropertyDeclaration visitPropertyDeclaration(angularParser.PropertyDeclarationContext ctx) {
        PropertyDeclaration propertyDeclaration = new PropertyDeclaration();
        propertyDeclaration.setProperty(ctx.IDENTIFIER().getText());
        propertyDeclaration.setType(ctx.TYPE().getText());
        Row row = new Row();
        row.setType("StringInterfaceDecl");
        row.setValue(ctx.IDENTIFIER().getText());
        row.setLine(ctx.getStart().getLine());
        row.setPosition(ctx.getStart().getCharPositionInLine());
        attributeSymbolTable.setRow(row);
        declarationObjectInInterfaceSymbolTable.setRow(row);
        return propertyDeclaration;
    }


}
