package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program extends AstNode {
    List<Statement> statementList = new ArrayList<Statement>();

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public void addChild(Statement s) {
        this.statementList.add(s);
    }

    @Override
    public String toString() {
        return "Program{" +
                "\nstatementList=" + statementList +
                "\n}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("class AppComponent {\n");
        for (Statement statement : statementList) {
            stringBuilder.append(statement.generatedCode());
        }
        stringBuilder.append("}");
        stringBuilder.append(getDocument());
        return stringBuilder.toString();
    }

    public String getNa() {
        for (Statement statement : statementList) {
            if (statement.classDeclaration != null) {
                for (int i = 0; i < statement.classDeclaration.listDeclarations.size(); i++) {
                    if (statement.classDeclaration.listDeclarations.get(i) instanceof FunctionDeclaration) {
                        for (int j = 0; j < ((FunctionDeclaration) statement.classDeclaration.listDeclarations.get(i)).functionBodyList.size(); j++) {
                            if (((FunctionDeclaration) statement.classDeclaration.listDeclarations.get(i)).functionBodyList.get(j).objectExpression != null) {
                                return ((FunctionDeclaration) statement.classDeclaration.listDeclarations.get(i)).functionBodyList.get(j).identifier1;
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    public String getDocument() {
        StringBuilder stringBuilder = new StringBuilder();
        String n = getNa();
        stringBuilder.append("\ndocument.addEventListener('DOMContentLoaded', () => {\n" +
                "const app = new AppComponent();\n" +
                "app.createAppStructure();\n");

        ListStatement listStatement = getList();
        if (listStatement == null) {
            stringBuilder.append("const stored = localStorage.getItem('").append(n).append("');\n");
            stringBuilder.append("if (stored) {\n" +
                    "app.").append(n).append(" = JSON.parse(stored);\n" +
                    "app.nextId = app.").append(n).append(".length > 0\n" +
                    "? Math.max(...app.").append(n).append(".map(p => p.id)) + 1\n" +
                    ": 1;\n}\n");
        } else {

            stringBuilder.append(listStatement.loadList());
        }
        stringBuilder.append("app.render();\n" +
                "});");
        return stringBuilder.toString();
    }

    public ListStatement getList() {
        for (Statement statement : statementList) {
            if (statement.classDeclaration != null) {
                for (int i = 0; i < statement.classDeclaration.listDeclarations.size(); i++) {
                    if (statement.classDeclaration.listDeclarations.get(i) instanceof ListStatement) {
                        for (int j = 0; j < ((ListStatement) statement.classDeclaration.listDeclarations.get(i)).arrayExpression.objectExpressionList.objectExpression.size(); j++) {
                            for (int k = 0; k < (((ListStatement) statement.classDeclaration.listDeclarations.get(i)).arrayExpression.objectExpressionList.objectExpression.get(j)).propertyList.properties.size(); k++) {
                                if (Objects.equals((((ListStatement) statement.classDeclaration.listDeclarations.get(i)).arrayExpression.objectExpressionList.objectExpression.get(j)).propertyList.properties.get(k).valueExpression.getText(), "\"null\"")) {
                                    return null;
                                }
                            }

                        }
                        return (ListStatement) statement.classDeclaration.listDeclarations.get(i);
                    }
                }
            }
        }
        return null;
    }
}



