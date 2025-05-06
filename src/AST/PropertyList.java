package AST;
import java.util.List;
import java.util.ArrayList;

public class PropertyList {
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
                "\nproperties=" + properties +
                "\n}";
    }
}
