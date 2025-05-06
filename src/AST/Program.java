package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Statement> statementList = new ArrayList<Statement>();

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        return "\nProgram{" +
                "\nstatementList=" + statementList +
                "\n}";
    }
}
