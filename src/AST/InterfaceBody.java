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
        stringBuilder.append("\nPropertyDeclaration{");
        for (PropertyDeclaration prop : propertyDeclarationList) {
            stringBuilder.append(prop.toString());
        }
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < propertyDeclarationList.size(); i++) {
            stringBuilder.append(propertyDeclarationList.get(i).generatedCode());
            if (i < propertyDeclarationList.size() - 1)
                stringBuilder.append(",");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
