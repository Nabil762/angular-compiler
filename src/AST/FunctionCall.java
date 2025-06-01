package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends AstNode {
    String functionName;
    List<ValueExpression> arguments;

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(ValueExpression argument) {
        arguments.add(argument);
    }

    public List<ValueExpression> getArguments() {
        return new ArrayList<>(arguments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");

        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).toString());
            if (i < arguments.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append(")");
        return sb.toString();
    }
}