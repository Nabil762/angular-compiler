package AST;

import java.util.ArrayList;
import java.util.List;

public class Property_declaration extends ListDeclaration{
    String ID;
    List<Type> types = new ArrayList<Type>();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "\nProperty_declaration{" +
                "\nID='" + ID + '\'' + "   types=" + types +
                "\n}";
    }
}
