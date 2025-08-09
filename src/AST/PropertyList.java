package AST;

import java.util.List;
import java.util.ArrayList;

public class PropertyList extends AstNode {
    List<Property> properties = new ArrayList<Property>();

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "\nPropertyList{ " +
                properties +
                "}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < properties.size(); i++) {
            stringBuilder.append(properties.get(i).generatedCode());
            if (i < properties.size() - 1)
                stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

    public String getInput() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Property property : properties) {
            stringBuilder.append(property.getInput());
        }
        return stringBuilder.toString();
    }

    public String getAsinment() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Property property : properties) {
            stringBuilder.append(property.getAsinment());
        }
        return stringBuilder.toString();
    }
}
