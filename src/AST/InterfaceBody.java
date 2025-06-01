package AST;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBody extends AstNode {
    List<PropertyDeclaration> propertyDeclarationList = new ArrayList<PropertyDeclaration>();

    public List<PropertyDeclaration> getPropertyDeclarationList() {
        return propertyDeclarationList;
    }

    public void setPropertyDeclarationList(List<PropertyDeclaration> propertyDeclarationList) {
        this.propertyDeclarationList = propertyDeclarationList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (PropertyDeclaration prop : propertyDeclarationList) {
            stringBuilder.append("\n  ").append(prop.toString()).append(";");
        }
        return stringBuilder.toString();
    }
}
