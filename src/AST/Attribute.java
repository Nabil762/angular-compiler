package AST;

public class Attribute {
    PropertyBinding propertyBinding;
    EventBinding eventBinding;
    String directive_name;
    String standard_attribute;
    AttributeValue attributeValue;

    public PropertyBinding getPropertyBinding() {
        return propertyBinding;
    }

    public void setPropertyBinding(PropertyBinding propertyBinding) {
        this.propertyBinding = propertyBinding;
    }

    public EventBinding getEventBinding() {
        return eventBinding;
    }

    public void setEventBinding(EventBinding eventBinding) {
        this.eventBinding = eventBinding;
    }

    public String getDirective_name() {
        return directive_name;
    }

    public void setDirective_name(String directive_name) {
        this.directive_name = directive_name;
    }

    public String getStandard_attribute() {
        return standard_attribute;
    }

    public void setStandard_attribute(String standard_attribute) {
        this.standard_attribute = standard_attribute;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        if(propertyBinding != null)
            return "\n Attribute{ " + propertyBinding + " = " + attributeValue + "\n}";
        else if (eventBinding != null) {
            return "\n Attribute{ " + eventBinding + " = " + attributeValue + "\n }";
        } else if (directive_name != null) {
            return "\n Attribute{ " + directive_name + " = " + attributeValue + "\n }";
        }
        return "\n Attribute{ " + standard_attribute + " = " + attributeValue + "\n }";
    }
}
