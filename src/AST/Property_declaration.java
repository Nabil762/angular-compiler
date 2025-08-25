package AST;

import java.util.ArrayList;
import java.util.List;

public class Property_declaration extends ListDeclaration {
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
                "\nID='" + ID + '\'' + "\ntypes=" + types +
                "}";
    }

    @Override
    public String generatedCode() {
        return "this." + ID + " = null;";
    }

    public String getJson() {
        StringBuilder stringBuilder = new StringBuilder();
        if (ID != null) {
            stringBuilder.append("const ").append(ID).append(" = ");
        }
        for (Type type : types) {
            String gen = type.generatedCode();
            String n = gen.substring(gen.indexOf("sessionStorage.getItem.")+23);
            stringBuilder.append("sessionStorage.getItem('").append(n).append("');\n");
            stringBuilder.append("if(").append(ID).append(") {\n").append("app.").append(n).append(" = JSON.parse(").append(ID).append(");\n}\n");
        }
        return stringBuilder.toString();
    }
}
