package visitor;
import AST.*;
import rules.angularParser;
import rules.angularParserBaseVisitor;


public class AngularVisitor extends angularParserBaseVisitor {


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
    public ClassDeclaration visitClassDeclaration (angularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        classDeclaration.setClass_name(ctx.IDENTIFIER().getText());
        for(int i=0; i < ctx.listDeclaration().size(); i++) {
            classDeclaration.getListDeclarations().add(visitListDeclaration(ctx.listDeclaration(i)));
        }
        return classDeclaration;
    }
    public ListDeclaration visitListDeclaration (angularParser.ListDeclarationContext ctx) {
        ListDeclaration listDeclaration = new ListDeclaration();
        if(ctx.listStatement() != null) {
            listDeclaration.setListStatement(visitListStatement(ctx.listStatement()));
        }
        if(ctx.listStatement() != null) {
            listDeclaration.setProperty_declaration(visitProperty_declaration(ctx.property_declaration()));
        }
        if(ctx.forDeclaration() != null) {
            listDeclaration.setForDeclaration(visitForDeclaration(ctx.forDeclaration()));
        }
        return listDeclaration;
    }
    public ListStatement visitListStatement (angularParser.ListStatementContext ctx){
        ListStatement listStatement = new ListStatement();
        listStatement.setArray_name(ctx.IDENTIFIER(0).getText());
        listStatement.setName_object(ctx.IDENTIFIER(1).getText());
        listStatement.setArrayExpression(visitArrayExpression(ctx.arrayExpression()));
        return listStatement;
    }
    public ArrayExpression visitArrayExpression (angularParser.ArrayExpressionContext ctx) {
        ArrayExpression arrayExpression = new ArrayExpression();
        arrayExpression.setObjectExpressionList(visitObjectExpressionList(ctx.objectExpressionList()));
        return arrayExpression;
    }
    public ObjectExpressionList visitObjectExpressionList (angularParser.ObjectExpressionListContext ctx){
        ObjectExpressionList objectExpressionList = new ObjectExpressionList();
        for( int i=0; i < ctx.objectExpression().size();i++){
            objectExpressionList.getObjectExpression().add(visitObjectExpression(ctx.objectExpression(i)));
        }
        return objectExpressionList;
    }
    public ObjectExpression visitObjectExpression (angularParser.ObjectExpressionContext ctx) {
        ObjectExpression objectExpression = new ObjectExpression();
        objectExpression.setPropertyList(visitPropertyList(ctx.propertyList()));
        return objectExpression;
    }

    public PropertyList visitPropertyList (angularParser.PropertyListContext ctx) {
        PropertyList propertyList = new PropertyList();
        for (int i=0; i < ctx.property().size();i++){
            propertyList.getProperties().add(visitProperty(ctx.property(i)));
        }
        return propertyList;
    }
    public Property visitProperty (angularParser.PropertyContext ctx) {
        Property property = new Property();
        property.setID(ctx.IDENTIFIER().getText());
        property.setValueExpression(visitValueExpression(ctx.valueExpression()));
        return property;
    }
    public Property_declaration visitProperty_declaration (angularParser.Property_declarationContext ctx) {
        Property_declaration property_declaration = new Property_declaration();
        property_declaration.setID(ctx.IDENTIFIER().getText());
        for(int i=0;i < ctx.type().size();i++) {
            property_declaration.getTypes().add(visitType(ctx.type(i)));
        }
        return property_declaration;
    }
    public Type visitType (angularParser.TypeContext ctx) {
        Type type = new Type();
        for(int i=0; i < ctx.single_type().size(); i++){
            type.getSingleTypeList().add(visitSingleType(ctx.single_type(i)));
        }
        return type;
    }
    public ForDeclaration visitForDeclaration (angularParser.ForDeclarationContext ctx){
        ForDeclaration forDeclaration = new ForDeclaration();
        forDeclaration.setFunction_name(ctx.IDENTIFIER(0).getText());
        forDeclaration.setInstance_of_array(ctx.IDENTIFIER(1).getText());
        forDeclaration.setArray_name(ctx.IDENTIFIER(2).getText());
        forDeclaration.setBodyFor(visitBodyFor(ctx.bodyFor()));
        return forDeclaration;
    }
    public BodyFor visitBodyFor(angularParser.BodyForContext ctx) {
        BodyFor bodyFor = new BodyFor();
        bodyFor.setArray_name(ctx.IDENTIFIER(0).getText());
        bodyFor.setElement_of_array(ctx.IDENTIFIER(1).getText());
        return bodyFor;
    }

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
    public ArrayLiteral visitArrayLiteral (angularParser.ArrayLiteralContext ctx){
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        for(int i = 0; i < ctx.IDENTIFIER().size();i++){
            arrayLiteral.getIdentifiers().add(ctx.IDENTIFIER().get(i).getText());
        }
        return arrayLiteral;
    }
    public EventBinding visitEventBinding (angularParser.EventBindingContext ctx) {
        EventBinding eventBinding = new EventBinding();
        eventBinding.setStandard_event(ctx.STANDARD_EVENT().getText());
        return eventBinding;
    }
    public Interpolation visitInterpolation (angularParser.InterpolationContext ctx){
        Interpolation interpolation = new Interpolation();
        interpolation.setString_literal(ctx.STRING_LITERAL().getText());
        return interpolation;
    }
    public PropertyBinding visitPropertyBinding (angularParser.PropertyBindingContext ctx){
        PropertyBinding propertyBinding = new PropertyBinding();
        propertyBinding.setSrc(ctx.SRC().getText());
        return propertyBinding;
    }
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

    public PropertyDeclaration visitPropertyDeclaration (angularParser.PropertyDeclarationContext ctx){
        PropertyDeclaration  propertyDeclaration = new PropertyDeclaration();
        propertyDeclaration.setProperty(ctx.IDENTIFIER().getText());
        propertyDeclaration.setType(ctx.TYPE().getText());
        return propertyDeclaration;
    }
}
