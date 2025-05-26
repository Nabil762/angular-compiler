package visitor;

import AST.*;
import rules.angularParser;
import rules.angularParserBaseVisitor;
import symbolTableAngular.Row;
import symbolTableAngular.SymbolTable;

import java.util.ArrayList;
import java.util.List;


public class AngularVisitor extends angularParserBaseVisitor {
    List<SymbolTable> symbolTableList = new ArrayList<SymbolTable>();

    public void addFiveSymbolTables() {
        for (int i = 0; i < 5; i++) {
            symbolTableList.add(new SymbolTable());
        }
    }

    @Override
    public Program visitProgram(angularParser.ProgramContext ctx) {
        addFiveSymbolTables();
        Program program = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            program.getStatementList().add(visitStatement(ctx.statement(i)));
        }
        for (SymbolTable symbolTable : symbolTableList) {
            symbolTable.print();
        }
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
//        Row row = new Row();
//        row.setType("library string");
//        row.setValue(ctx.STRING().getText());
//        symbolTableList.get(0).setRow(row);
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            importStatement.getIdentifiers().add(ctx.IDENTIFIER(i).getText());
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
        }
        return importDeclaration;
    }

    @Override
    public Selector visitSelector(angularParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx.STRING() != null) {
            selector.setSTRING_LIT(ctx.STRING().getText());
//            Row row =new Row() ;
//            row.setType("STRING");
//            row.setValue(selector.getSTRING_LIT());
//            symbolTable.getRows().add(row);

        }
        return selector;
    }

    @Override
    public Standalone visitStandalone(angularParser.StandaloneContext ctx) {
        Standalone standalone = new Standalone();
        if (ctx.BOOLEAN() != null) {
            standalone.setIsboolean(ctx.BOOLEAN().getText());
        }
        return standalone;
    }

    @Override
    public Template visitTemplate(angularParser.TemplateContext ctx) {
        Template template = new Template();
        for (int i = 0; i < ctx.element().size(); i++) {
            if (ctx.element(i) != null) {
                template.getElement().add((Element) visit(ctx.element(i)));
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
        if (ctx.TAG_NAME() != null && ctx.TAG_NAME().getText() != null) {
            element.setHtmlName(ctx.TAG_NAME().getText());
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
    public Tag visitStandardTag(angularParser.StandardTagContext ctx) {
        return visitOpeningTag(ctx.openingTag());
    }

    @Override
    public Tag visitSelfClosingTagElement(angularParser.SelfClosingTagElementContext ctx) {
        return visitSelfClosingTag(ctx.selfClosingTag());
    }

    @Override
    public OpeningTag visitOpeningTag(angularParser.OpeningTagContext ctx) {
        OpeningTag openingTag = new OpeningTag();
        if (ctx.attributes() != null) {
            for (int i = 0; i < ctx.attributes().size(); i++) {
                if (ctx.attributes(i) != null && ctx.attributes(i).getText() != null) {
                    openingTag.getAttributes().add((Attributes) visit(ctx.attributes(i)));
                }
            }
        }
        return openingTag;
    }

    @Override
    public ClosingTag visitClosingTag(angularParser.ClosingTagContext ctx) {
        ClosingTag closingTag = new ClosingTag();
        if (ctx.OPEN_TAG_CLOSE() != null) {
            closingTag.setNAME_HTML(ctx.OPEN_TAG_CLOSE().getText());
//            Row row =new Row() ;
//            row.setType("HTML_KEYWORD");
//            row.setValue(closingTag.getNAME_HTML());
//            symbolTable.getRows().add(row);

        }

        return closingTag;
    }

    @Override
    public Tag visitSelfClosingTag(angularParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
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
//            Row row = new Row();
//            row.setType("String");
//            row.setValue(attributes.getText());
//            symbolTable.getRows().add(row);

        }
        if (ctx.TAG_NAME() != null && ctx.TAG_NAME().getText() != null) {
            attributes.setHtmlName(ctx.TAG_NAME().getText());
//            Row row = new Row();
//            row.setType("Tag_name");
//            row.setValue(attributes.getHtmlName());
//            symbolTable.getRows().add(row);
        }


        return attributes;
    }

    @Override
    public Attributes visitDirectiveAttribute(angularParser.DirectiveAttributeContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.DIRECTIVE_NAME() != null && ctx.DIRECTIVE_NAME().getText() != null) {
            attributes.setStructuralDir(ctx.DIRECTIVE_NAME().getText());
//            Row row = new Row();
//            row.setType("directive_name");
//            row.setValue(attributes.getStructuralDir());
//            symbolTable.getRows().add(row);
        }
        return attributes;
    }

    @Override
    public Attributes visitBindingAttribute(angularParser.BindingAttributeContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.BINDING_PROPERTY() != null && ctx.BINDING_PROPERTY().getText() != null) {
            attributes.setBinding(ctx.BINDING_PROPERTY().getText());
//            Row row = new Row();
//            row.setType("binding_property");
//            row.setValue(attributes.getBinding());
//            symbolTable.getRows().add(row);

        }
        return attributes;
    }

    @Override
    public Attributes visitEventAttribute(angularParser.EventAttributeContext ctx) {
        Attributes attributes = new Attributes();
        if (ctx.STANDARD_EVENT() != null && ctx.STANDARD_EVENT() != null) {
            attributes.setEvent(ctx.STANDARD_EVENT().getText());
//            Row row = new Row();
//            row.setType("standard_event");
//            row.setValue(attributes.getEvent());
//            symbolTable.getRows().add(row);
        }

        return attributes;
    }

    @Override
    public Interpolation visitInterpolation(angularParser.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();

        if (ctx.TAG_NAME() != null) {
            interpolation.setNAME_HTML(ctx.TAG_NAME().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(interpolation.getNAME_HTML());
//            symbolTable.getRows().add(row);

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
//            Row row =new Row() ;
//            row.setType("ID CSS");
//            row.setValue(bodyelement.getId_css());
//            symbolTable.getRows().add(row);

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
//        System.out.println("ddd" + ctx.objectExpressionList().objectExpression().size());
        ArrayExpression arrayExpression = new ArrayExpression();
        arrayExpression.setObjectExpressionList(visitObjectExpressionList(ctx.objectExpressionList()));
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
//        System.out.println("size" + ctx.property().size());
        for (int i = 0; i < ctx.property().size(); i++) {
            propertyList.getProperties().add(visitProperty(ctx.property(i)));
        }
        return propertyList;
    }

    @Override
    public Property visitProperty(angularParser.PropertyContext ctx) {
        Property property = new Property();
        property.setID(ctx.IDENTIFIER().getText());
//        System.out.println(ctx.IDENTIFIER().getText());
        property.setValueExpression((ValueExpression) visit(ctx.valueExpression()));
        Row row = new Row();
        row.setType("StringInFunction");
        row.setValue(ctx.IDENTIFIER().getText());
        symbolTableList.get(0).setRow(row);
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
//        Row row = new Row() ;
//        row.setType("Identifier");
//        row.setValue(functionDeclaration.getFunctionName());
//        symbolTable.getRows().add(row);
        if (ctx.parameters() != null) {
            functionDeclaration.setParameterList(visitParameters(ctx.parameters()));
        }
        if (ctx.type() != null) {
            functionDeclaration.setType(visitType(ctx.type()));
        }
        if (ctx.functionBody() != null) {
            for (int i = 0; i < ctx.functionBody().size(); i++) {
                functionDeclaration.getFunctionBodyList().add((FunctionBody) visit(ctx.functionBody(i)));
            }
        }
        return functionDeclaration;
    }

    @Override
    public Parameter visitParameter(angularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setIdentifier(ctx.IDENTIFIER().getText());
        parameter.setSingleType((SingleType) visit(ctx.single_type()));
//        Row row =new Row() ;
//        row.setType("Identifier");
//        row.setValue(parameter.getIdentifier());
//        symbolTable.getRows().add(row);
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
            simpleAssignment.setThisis(ctx.THIS().getText());
            simpleAssignment.setIdentifierDotThis(ctx.IDENTIFIER(0).getText());
            simpleAssignment.setIdentifier(ctx.IDENTIFIER(1).getText());
//            Row row =new Row() ;
//            row.setType("Identifier");
//            row.setValue(simpleAssignment.getIdentifierDotThis());
//            row.setType("Identifier");
//            row.setValue(simpleAssignment.getIdentifier());
//            symbolTable.getRows().add(row);
        }
        return simpleAssignment;
    }

    @Override
    public FunctionBody visitComplexAssignment(angularParser.ComplexAssignmentContext ctx) {
        FunctionBody complexAssignment = new FunctionBody();
        if (ctx.valueExpression() != null && ctx.IDENTIFIER() != null) {
            complexAssignment.setThisis(ctx.THIS().getText());
            complexAssignment.setIdentifierDotThis(ctx.IDENTIFIER().getText());
            complexAssignment.setValueExpression((ValueExpression) visit(ctx.valueExpression()));
//            Row row = new Row();
//            row.setType("Identifier");
//            row.setValue(complexAssignment.getIdentifierDotThis());
//            symbolTable.getRows().add(row);
        }
        return complexAssignment;
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
            functionCall.getArguments().add((ValueExpression) visit(ctx.valueExpression(i)));
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
        symbolTableList.get(0).setRow(row);
        return propertyDeclaration;
    }

}
