package AST;

import java.util.ArrayList;
import java.util.List;

public class Statement extends AstNode {
    List<ImportStatement> importStatementList = new ArrayList<ImportStatement>();
    List<InterfaceDeclaration> interfaceDeclarationList = new ArrayList<InterfaceDeclaration>();
    ComponentDeclaration componentDeclaration;
    ClassDeclaration classDeclaration;

    public List<ImportStatement> getImportStatementList() {
        return importStatementList;
    }

    public void setImportStatementList(List<ImportStatement> importStatementList) {
        this.importStatementList = importStatementList;
    }

    public List<InterfaceDeclaration> getInterfaceDeclarationList() {
        return interfaceDeclarationList;
    }

    public void setInterfaceDeclarationList(List<InterfaceDeclaration> interfaceDeclarationList) {
        this.interfaceDeclarationList = interfaceDeclarationList;
    }

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        return "\nStatement{" +
                "\nimportStatementList=" + importStatementList +
                "\ninterfaceDeclarationList=" + interfaceDeclarationList +
                "\ncomponentDeclaration=" + componentDeclaration +
                "\nclassDeclaration=" + classDeclaration +
                "\n}";
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (ImportStatement imp : importStatementList) {
//            stringBuilder.append(imp);
//            stringBuilder.append("\n");
//        }
//
//        for (InterfaceDeclaration inter : interfaceDeclarationList) {
//            stringBuilder.append(inter);
//            stringBuilder.append("\n");
//
//        }
//
//        if (componentDeclaration != null) {
//            stringBuilder.append(componentDeclaration);
//            stringBuilder.append("\n");
//        }
//
//        if (classDeclaration != null) {
//            stringBuilder.append(classDeclaration);
//            stringBuilder.append("\n");
//        }
//
//        return stringBuilder.toString();
//    }
}



