package AST;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBody {
    List<PropertyDeclaration> propertyDeclarationList = new ArrayList<PropertyDeclaration>();

    public List<PropertyDeclaration> getPropertyDeclarationList() {
        return propertyDeclarationList;
    }

    public void setPropertyDeclarationList(List<PropertyDeclaration> propertyDeclarationList) {
        this.propertyDeclarationList = propertyDeclarationList;
    }

    @Override
    public String toString() {
        return "\nInterfaceBody{" +
                "\npropertyDeclarationList=" + propertyDeclarationList +
                "\n}";
    }
}
