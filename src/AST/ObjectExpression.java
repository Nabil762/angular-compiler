package AST;

public class ObjectExpression extends AstNode {
    PropertyList propertyList;

    public PropertyList getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(PropertyList propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public String toString() {
        return "\nObjectExpression{ " +
                propertyList +
                "\n}";
    }

    @Override
    public String generatedCode() {
        return "{" + propertyList.generatedCode() + "}";
    }

    public String getInput() {
        return propertyList.getInput();
    }

    public String getAsinment() {
        return propertyList.getAsinment();
    }

}
