package AST;

public class PropertyDeclaration extends ListDeclaration {
    String property;
    String type;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nPropertyDeclaration{" +
                "\nproperty=" + property +
                "\ntype of property=" + type +
                "\n}";
    }
}