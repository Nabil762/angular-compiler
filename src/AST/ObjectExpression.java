package AST;

public class ObjectExpression extends AstNode{
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
                "\npropertyList= " + propertyList +
                "\n}";
    }
}
