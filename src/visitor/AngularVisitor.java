package visitor;
import AST.*;
import rules.angularParser;
import rules.angularParserBaseVisitor;


public class AngularVisitor extends angularParserBaseVisitor {

    @Override
    public Program visitProgram (angularParser.ProgramContext ctx){
        Program program = new Program();
        for(int i=0; i < ctx.statement().size();i++){
            program.getStatementList().add(visitStatement(ctx.statement(i)));
        }
        return program;
    }
    @Override
    public Statement visitStatement (angularParser.StatementContext ctx) {
        Statement statement = new Statement();
        for(int i=0;i < ctx.importStatement().size();i++) {
            statement.getImportStatementList().add(visitImportStatement(ctx.importStatement(i)));
        }
        for(int i=0; i < ctx.interfaceDeclaration().size();i++) {
            statement.getInterfaceDeclarationList().add(visitInterfaceDeclaration(ctx.interfaceDeclaration(i)));
        }
        statement.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        statement.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        return statement;
    }
    @Override
    public ImportStatement visitImportStatement (angularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        importStatement.setLibrary(ctx.STRING().getText());
        for(int i=0; i < ctx.IDENTIFIER().size();i++) {
            importStatement.getIdentifiers().add(ctx.IDENTIFIER(i).getText());
        }
        return importStatement;
    }
    @Override
    public InterfaceDeclaration visitInterfaceDeclaration (angularParser.InterfaceDeclarationContext ctx){
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();
        interfaceDeclaration.setInterfaceName(ctx.IDENTIFIER().getText());
        interfaceDeclaration.setInterfaceBody(visitInterfaceBody(ctx.interfaceBody()));
        return interfaceDeclaration;
    }
    @Override
    public InterfaceBody visitInterfaceBody (angularParser.InterfaceBodyContext ctx){
        InterfaceBody interfaceBody = new InterfaceBody();
        for (int i=0;i  < ctx.propertyDeclaration().size();i++) {
            interfaceBody.getPropertyDeclarationList().add(visitPropertyDeclaration(ctx.propertyDeclaration(i)));
        }
        return interfaceBody;
    }
    @Override
    public ComponentDeclaration visitComponentDeclaration (angularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        componentDeclaration.setComponentConfig(visitComponentConfig(ctx.componentConfig()));
        return componentDeclaration;
    }
    @Override
    public ComponentConfig visitComponentConfig (angularParser.ComponentConfigContext ctx) {
        ComponentConfig componentConfig = new ComponentConfig();
        for(int i=0; i < ctx.propertyAssignment().size(); i++) {
            componentConfig.getPropertyAssignmentList().add(visitPropertyAssignment(ctx.propertyAssignment(i)));
        }
        return componentConfig;
    }
    @Override
    public PropertyAssignment visitPropertyAssignment (angularParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment();
        if(ctx.selector()!=null){
            propertyAssignment.setSelector(visitSelector(ctx.selector()));

        }
        if(ctx.standalone()!=null){
            propertyAssignment.setStandalone(visitStandalone(ctx.standalone()));
        }
        if(ctx.importDeclaration()!=null){
            propertyAssignment.setImportDeclaration(visitImportDeclaration(ctx.importDeclaration()));
        }
        if(ctx.template()!=null){
            propertyAssignment.setTemplate(visitTemplate(ctx.template()));
        }
        if(ctx.styles()!=null){
            propertyAssignment.setStyle(visitStyle(ctx.styles()));
        }
        return propertyAssignment;
    }
    @Override
    public ImportDeclaration visitImportDeclaration (angularParser.ImportDeclarationContext ctx) {
        ImportDeclaration importDeclaration = new ImportDeclaration();
        importDeclaration.setId(ctx.IDENTIFIER().getText());
        return importDeclaration;
    }

    @Override
    public Selector visitSelector(angularParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if(ctx.STRING()!=null){
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
        if(ctx.BOOLEAN()!=null){
            standalone.setIsboolean(ctx.BOOLEAN().getText());
        }

        return standalone;
    }
    @Override
    public Template visitTemplate(angularParser.TemplateContext ctx) {
        Template template = new Template();
        for (int i=0 ;i<ctx.element().size() ;i++){
            if (ctx.element(i) != null) {
                template.getElement().add(visitElement(ctx.element(i)));
            }
        }

        return template;
    }
    @Override
    public Element visitElement(angularParser.ElementContext ctx) {
        Element element = new Element();
        if(ctx.tag()!=null){
            element.setTag(visitTag(ctx.tag()));
        }
        if(ctx.interpolation()!=null){
            element.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        if(ctx.TAG_NAME()!=null && ctx.TAG_NAME().getText()!=null){
            element.setHtmlName(ctx.TAG_NAME().getText());
//                Row row =new Row() ;
//                row.setType("HTML_KEYWORD");
//                row.setValue(element.getHtmlName());
//                symbolTable.getRows().add(row);
        }
        return element;
    }
    @Override
    public Tag visitTag(angularParser.TagContext ctx) {
        Tag tag = new Tag();
        if (ctx.openingTag() != null && ctx.openingTag().getText()!=null) {
            tag.setOpeningTag(visitOpeningTag(ctx.openingTag()));

        }
        if (ctx.closingTag() != null) {
            tag.setClosingTag(visitClosingTag(ctx.closingTag()));
        }
        if (ctx.selfClosingTag() != null) {
            tag.setSelfClosingTag(visitSelfClosingTag(ctx.selfClosingTag()));
        }
        if (ctx.element() != null) {
            for (angularParser.ElementContext elementCtx : ctx.element()) {
                if (elementCtx != null) {
                    tag.getElements().add(visitElement(elementCtx));
                }
            }
        }
        return tag;
    }
    @Override
    public OpeningTag visitOpeningTag(angularParser.OpeningTagContext ctx) {
        OpeningTag openingTag = new OpeningTag();
        if(ctx.attributes()!=null){
            for (int i =0 ; i<ctx.attributes().size();i++){
                if (ctx.attributes(i) != null && ctx.attributes(i).getText()!=null) {
                    openingTag.getAttributes().add(visitAttributes(ctx.attributes(i)));
                }
            }
        }
        return  openingTag;
    }
    @Override
    public ClosingTag visitClosingTag(angularParser.ClosingTagContext ctx) {
        ClosingTag closingTag = new ClosingTag();
        if(ctx.OPEN_TAG_CLOSE()!=null){
            closingTag.setNAME_HTML(ctx.OPEN_TAG_CLOSE().getText());
//            Row row =new Row() ;
//            row.setType("HTML_KEYWORD");
//            row.setValue(closingTag.getNAME_HTML());
//            symbolTable.getRows().add(row);

        }

        return  closingTag;
    }
    @Override
    public SelfClosingTag visitSelfClosingTag(angularParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        if(ctx.attributes()!=null){
            for (int i =0 ; i<ctx.attributes().size();i++){
                if (ctx.attributes(i) != null) {
                    selfClosingTag.getAttributes().add(visitAttributes(ctx.attributes(i)));
                }
            }
        }
        return  selfClosingTag;
    }
    @Override
    public Attributes visitAttributes(angularParser.AttributesContext ctx) {
        Attributes attributes = new Attributes();

        if (ctx.STRING1() != null && ctx.STRING1().getText()!=null) {
            attributes.setText(ctx.STRING1().getText()); // S
//            Row row =new Row() ;
//            row.setType("STRING");
//            row.setValue(attributes.getHtmlString());
//            symbolTable.getRows().add(row);

            // et standard HTML attribute
        }
        if (ctx.TAG_NAME() != null && ctx.TAG_NAME().getText() != null) {
            attributes.setHtmlName(ctx.TAG_NAME().getText());
//            Row row =new Row() ;
//            row.setType("NAME HTML");
//            row.setValue(attributes.getHtmlName());
//            symbolTable.getRows().add(row);

        }
        if (ctx.BINDING_PROPERTY() != null && ctx.BINDING_PROPERTY().getText()!=null) {
            attributes.setBinding(ctx.BINDING_PROPERTY().getText());
//            Row row =new Row() ;
//            row.setType("RESOURCE BINDING");
//            row.setValue(attributes.getBinding());
//            symbolTable.getRows().add(row);

        }
        if (ctx.DIRECTIVE_NAME() != null && ctx.DIRECTIVE_NAME().getText()!=null) {
            attributes.setStructuralDir(ctx.DIRECTIVE_NAME().getText());
//            Row row =new Row() ;
//            row.setType("ANGULAR ID");
//            row.setValue(attributes.getStructuralDir());
//            symbolTable.getRows().add(row);

        }
        if (ctx.STANDARD_EVENT() != null && ctx.STANDARD_EVENT()!=null) { // Make sure your grammar has EVENT_BINDING
            attributes.setEvent(ctx.STANDARD_EVENT().getText());
//            Row row =new Row() ;
//            row.setType("EVENT");
//            row.setValue(attributes.getEvent());
//            symbolTable.getRows().add(row);

        }

        return attributes;
    }
    @Override
    public Interpolation visitInterpolation(angularParser.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();

        if(ctx.TAG_NAME()!=null){
            interpolation.setNAME_HTML(ctx.TAG_NAME().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(interpolation.getNAME_HTML());
//            symbolTable.getRows().add(row);

        }
        return interpolation;
    }

    public Style visitStyle(angularParser.StylesContext ctx) {
        Style style = new Style();
        if(ctx.bodyOfCss()!=null){
            style.setBodyOfcss(visitBodyOfCss(ctx.bodyOfCss()));
        }
        return style;
    }
    @Override
    public BodyOfCss visitBodyOfCss(angularParser.BodyOfCssContext ctx) {
        BodyOfCss bodyOfCss = new BodyOfCss();
        if(ctx.objects()!=null){
            bodyOfCss.setObjecte(visitObjecte(ctx.objects()));
        }
        return  bodyOfCss;
    }

    public Objecte visitObjecte(angularParser.ObjectsContext ctx) {
        Objecte objecte = new Objecte();
        if(ctx.elementCss()!=null){
            for (int i =0 ; i<ctx.elementCss().size();i++){
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
        if(ctx.bodyOfelement()!=null){
            for (int i =0 ; i<ctx.bodyOfelement().size();i++){
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
        if(ctx.ID()!=null && ctx.ID().getText()!=null) {
            bodyOfelement.setIdentifier(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID CSS");
//            row.setValue(bodyelement.getId_css());
//            symbolTable.getRows().add(row);

        }
        if(ctx.valueCss()!=null){
            bodyOfelement.setValueCss(visitValueCss(ctx.valueCss()));
        }
        return bodyOfelement;

    }
    @Override
    public ValueCss visitValueCss(angularParser.ValueCssContext ctx) {
        ValueCss valueCss = new ValueCss();
        if(ctx.ID()!=null ){
            for (int i =0 ; i<ctx.ID().size();i++){
                if (ctx.ID(i) != null) {
                    valueCss.getIdentifiers().add(ctx.ID(i).getText());
                }
            }
        }
        return valueCss;
    }


    @Override
    public ClassDeclaration visitClassDeclaration (angularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        classDeclaration.setClass_name(ctx.IDENTIFIER().getText());
        for(int i=0; i < ctx.listDeclaration().size(); i++) {
            classDeclaration.getListDeclarations().add(visitListDeclaration(ctx.listDeclaration(i)));
        }
        return classDeclaration;
    }
    @Override
    public ListDeclaration visitListDeclaration (angularParser.ListDeclarationContext ctx) {
        ListDeclaration listDeclaration = new ListDeclaration();
        if(ctx.listStatement() != null) {
            listDeclaration.setListStatement(visitListStatement(ctx.listStatement()));
        }
        if(ctx.property_declaration() != null) {
            listDeclaration.setProperty_declaration(visitProperty_declaration(ctx.property_declaration()));
        }
        if(ctx.forDeclaration() != null) {
            listDeclaration.setForDeclaration(visitForDeclaration(ctx.forDeclaration()));
        }
        return listDeclaration;
    }
    @Override
    public ListStatement visitListStatement (angularParser.ListStatementContext ctx){
        ListStatement listStatement = new ListStatement();
        listStatement.setArray_name(ctx.IDENTIFIER(0).getText());
        listStatement.setName_object(ctx.IDENTIFIER(1).getText());
        listStatement.setArrayExpression(visitArrayExpression(ctx.arrayExpression()));
        return listStatement;
    }
    @Override
    public ArrayExpression visitArrayExpression (angularParser.ArrayExpressionContext ctx) {
        ArrayExpression arrayExpression = new ArrayExpression();
        arrayExpression.setObjectExpressionList(visitObjectExpressionList(ctx.objectExpressionList()));
        return arrayExpression;
    }
    @Override
    public ObjectExpressionList visitObjectExpressionList (angularParser.ObjectExpressionListContext ctx){
        ObjectExpressionList objectExpressionList = new ObjectExpressionList();
        for( int i=0; i < ctx.objectExpression().size();i++){
            objectExpressionList.getObjectExpression().add(visitObjectExpression(ctx.objectExpression(i)));
        }
        return objectExpressionList;
    }
    @Override
    public ObjectExpression visitObjectExpression (angularParser.ObjectExpressionContext ctx) {
        ObjectExpression objectExpression = new ObjectExpression();
        objectExpression.setPropertyList(visitPropertyList(ctx.propertyList()));
        return objectExpression;
    }
    @Override
    public PropertyList visitPropertyList (angularParser.PropertyListContext ctx) {
        PropertyList propertyList = new PropertyList();
        for (int i=0; i < ctx.property().size();i++){
            propertyList.getProperties().add(visitProperty(ctx.property(i)));
        }
        return propertyList;
    }
    @Override
    public Property visitProperty (angularParser.PropertyContext ctx) {
        Property property = new Property();
        property.setID(ctx.IDENTIFIER().getText());
        property.setValueExpression(visitValueExpression(ctx.valueExpression()));
        return property;
    }
    @Override
    public Property_declaration visitProperty_declaration (angularParser.Property_declarationContext ctx) {
        Property_declaration property_declaration = new Property_declaration();
        property_declaration.setID(ctx.IDENTIFIER().getText());
        for(int i=0;i < ctx.type().size();i++) {
            property_declaration.getTypes().add(visitType(ctx.type(i)));
        }
        return property_declaration;
    }
    @Override
    public Type visitType (angularParser.TypeContext ctx) {
        Type type = new Type();
        for(int i=0; i < ctx.single_type().size(); i++){
            type.getSingleTypeList().add(visitSingleType(ctx.single_type(i)));
        }
        return type;
    }
    @Override
    public ForDeclaration visitForDeclaration (angularParser.ForDeclarationContext ctx){
        ForDeclaration forDeclaration = new ForDeclaration();
        forDeclaration.setFunction_name(ctx.IDENTIFIER(0).getText());
        forDeclaration.setInstance_of_array(ctx.IDENTIFIER(1).getText());
        forDeclaration.setArray_name(ctx.IDENTIFIER(2).getText());
        forDeclaration.setBodyFor(visitBodyFor(ctx.bodyFor()));
        return forDeclaration;
    }
    @Override
    public BodyFor visitBodyFor(angularParser.BodyForContext ctx) {
        BodyFor bodyFor = new BodyFor();
        bodyFor.setArray_name(ctx.IDENTIFIER(0).getText());
        bodyFor.setElement_of_array(ctx.IDENTIFIER(1).getText());
        return bodyFor;
    }
    public SingleType visitSingleType (angularParser.Single_typeContext ctx) {
        SingleType singleType = new SingleType();
        if (ctx.IDENTIFIER() != null) {
            singleType.setID(ctx.IDENTIFIER().getText());
        }
        if (ctx.TYPE() != null) {
            singleType.setType(ctx.TYPE().getText());
        }
        return singleType;
    }
    @Override
    public ValueExpression visitValueExpression (angularParser.ValueExpressionContext ctx) {
        ValueExpression valueExpression = new ValueExpression();
        if (ctx.STRING() != null) {
            valueExpression.setText(ctx.STRING().getText());
        }
        if (ctx.NUMBER() != null) {
            valueExpression.setInteger(Integer.valueOf(ctx.NUMBER().getText()));
        }
        if (ctx.BOOLEAN() != null) {
            valueExpression.setIsBoolean(ctx.BOOLEAN().getText());
        }
        return valueExpression;
    }
    @Override
    public PropertyDeclaration visitPropertyDeclaration (angularParser.PropertyDeclarationContext ctx){
        PropertyDeclaration  propertyDeclaration = new PropertyDeclaration();
        propertyDeclaration.setProperty(ctx.IDENTIFIER().getText());
        propertyDeclaration.setType(ctx.TYPE().getText());
        return propertyDeclaration;
    }
}
