package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration {
    String class_name;
    List<ListDeclaration> listDeclarations = new ArrayList<ListDeclaration>();

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public List<ListDeclaration> getListDeclarations() {
        return listDeclarations;
    }

    public void setListDeclarations(List<ListDeclaration> listDeclarations) {
        this.listDeclarations = listDeclarations;
    }

    @Override
    public String toString() {
        return "\nClassDeclaration{" +
                "\nclass_name = '" + class_name + '\'' +
                "\nlistDeclarations = " + listDeclarations +
                "\n}";
    }
}
