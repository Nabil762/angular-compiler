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
        propertyAssignment.setProperty(ctx.IDENTIFIER().getText());
        propertyAssignment.setPropertyValue(visitPropertyValue(ctx.propertyValue()));
        return propertyAssignment;
    }
    @Override
    public PropertyValue visitPropertyValue (angularParser.PropertyValueContext ctx){
        PropertyValue propertyValue = new PropertyValue();
        if(ctx.valueExpression() != null){
            propertyValue.setValueExpression(visitValueExpression(ctx.valueExpression()));
        }
        if(ctx.arrayLiteral() != null) {
            propertyValue.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        if(ctx.htmlElement() != null) {
            propertyValue.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        }
        return propertyValue;
    }
    @Override
    public HtmlElement visitHtmlElement (angularParser.HtmlElementContext ctx){
        HtmlElement htmlElement = new HtmlElement();
        for( int i=0;i < ctx.attribute().size();i++){
            htmlElement.getAttributeList().add(visitAttribute(ctx.attribute(i)));
        }
        for(int i=0;i < ctx.elements().size();i++){
            htmlElement.getElements().add(visitElement(ctx.elements(i)));
        }
        return htmlElement;
    }
    @Override
    public Element visitElement (angularParser.ElementsContext ctx){
        Element element = new Element();
        if(ctx.tagStatement() != null){
            element.setTagStatement(visitTagStatement(ctx.tagStatement()));
        }
        if(ctx.interpolation() != null) {
            element.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        if(ctx.imgTag() != null) {
            element.setImgTag(visitImgTag(ctx.imgTag()));
        }
        if(ctx.STRING_LITERAL() != null) {
            element.setText(ctx.STRING_LITERAL().getText());
        }
        return element;
    }
    @Override
    public TagStatement visitTagStatement (angularParser.TagStatementContext ctx) {
        TagStatement tagStatement = new TagStatement();
        tagStatement.setTag(ctx.TAGS(1).getText());
        for( int i=0;i < ctx.attribute().size();i++){
            tagStatement.getAttributeList().add(visitAttribute(ctx.attribute(i)));
        }
//        for(int i=0;i < ctx.elements().size();i++){
//            tagStatement.getElementList().add(visitElements(ctx.elements(i)));
//        }
        return tagStatement;
    }
    @Override
    public ImgTag visitImgTag (angularParser.ImgTagContext ctx){
        ImgTag imgTag = new ImgTag();
        imgTag.setTag(ctx.IMG().getText());
        for(int i=0;i < ctx.attribute().size(); i++){
            imgTag.getAttributeList().add(visitAttribute(ctx.attribute(i)));
        }
        return imgTag;
    }
    @Override
    public Attribute visitAttribute (angularParser.AttributeContext ctx){
        Attribute attribute = new Attribute();
        if(ctx.propertyBinding() != null && ctx.attributeValue() != null){
            attribute.setPropertyBinding(visitPropertyBinding(ctx.propertyBinding()));
            attribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        }
        if(ctx.eventBinding() != null && ctx.attributeValue() != null) {
            attribute.setEventBinding(visitEventBinding(ctx.eventBinding()));
            attribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        }
        if(ctx.STANDARD_ATTRIBUTE() != null && ctx.attributeValue() != null) {
            attribute.setStandard_attribute(ctx.STANDARD_ATTRIBUTE().getText());
            attribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        }
        if(ctx.DIRECTIVE_NAME() != null && ctx.attributeValue() != null){
            attribute.setDirective_name(ctx.DIRECTIVE_NAME().getText());
            attribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        }
        return attribute;
    }
    @Override
    public AttributeValue visitAttributeValue (angularParser.AttributeValueContext ctx) {
        AttributeValue attributeValue = new AttributeValue();
        if(ctx.STRING_LITERAL() != null) {
            attributeValue.setCssText(ctx.STRING_LITERAL().getText());
        }
        if(ctx.interpolation() != null) {
            attributeValue.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        return attributeValue;
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
    @Override
    public SingleType visitSingleType (angularParser.Single_typeContext ctx) {
        SingleType singleType = new SingleType();
        if(ctx.IDENTIFIER() != null) {
            singleType.setID(ctx.IDENTIFIER().getText());
        }
        if(ctx.TYPE() != null) {
            singleType.setType(ctx.TYPE().getText());
        }
        return singleType;
    }
    @Override
    public ArrayLiteral visitArrayLiteral (angularParser.ArrayLiteralContext ctx){
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for(int i = 0; i < ctx.IDENTIFIER().size();i++){
            arrayLiteral.getIdentifiers().add(ctx.IDENTIFIER().get(i).getText());
        }
        return arrayLiteral;
    }
    @Override
    public EventBinding visitEventBinding (angularParser.EventBindingContext ctx) {
        EventBinding eventBinding = new EventBinding();
        eventBinding.setStandard_event(ctx.STANDARD_EVENT().getText());
        return eventBinding;
    }
    @Override
    public Interpolation visitInterpolation (angularParser.InterpolationContext ctx){
        Interpolation interpolation = new Interpolation();
        interpolation.setString_literal(ctx.STRING_LITERAL().getText());
        return interpolation;
    }
    @Override
    public PropertyBinding visitPropertyBinding (angularParser.PropertyBindingContext ctx){
        PropertyBinding propertyBinding = new PropertyBinding();
        propertyBinding.setSrc(ctx.SRC().getText());
        return propertyBinding;
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
