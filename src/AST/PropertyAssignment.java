package AST;

public class PropertyAssignment {
    String property;
    PropertyValue propertyValue;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        return "\nPropertyAssignment{" +
                "\nproperty : " + property + propertyValue +
                "\n}";
    }
}
