package AST;

import java.util.ArrayList;
import java.util.List;

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
        return "\nProgram{" +
                "\nstatementList=" + statementList +
                "\n}";
    }
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder=new StringBuilder();
//        for(Statement statement :this.statementList)
//        {
//            stringBuilder.append(statement);
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }
}
