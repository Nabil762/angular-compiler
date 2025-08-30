package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCall extends AstNode {
    String functionName;
    List<ValueExpression> arguments = new ArrayList<>();

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

    @Override
    public String generatedCode() {
        if (functionName.contains(".JSON.stringify")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("const ").append(functionName.substring(0, functionName.indexOf("."))).append(" = JSON.stringify(");
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(arguments.get(i).getsession());
                if (i < arguments.size() - 1)
                    stringBuilder.append(",");
            }
            stringBuilder.append(");");
            return stringBuilder.toString();
        } else if (functionName.contains(".encodeURIComponent")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("const ").append(functionName.substring(0, functionName.indexOf("."))).append(" = encodeURIComponent(");
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(arguments.get(i).getsession());
                if (i < arguments.size() - 1)
                    stringBuilder.append(",");
            }
            stringBuilder.append(");");
            return stringBuilder.toString();
        } else if (Objects.equals(functionName, "this.router.navigate")) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(arguments.get(i).gethref());
            }
            return stringBuilder.toString();
        } else if (functionName.contains(".sessionStorage.setItem")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sessionStorage.setItem( ");
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(arguments.get(i).getsession());
                if (i < arguments.size() - 1)
                    stringBuilder.append(",");
            }
            stringBuilder.append(", JSON.stringify(").append(functionName.substring(0, functionName.indexOf("."))).append(")").append(");");
            return stringBuilder.toString();
        } else if (functionName.contains("this.cars.push")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("this.cars.push(");
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(arguments.get(i).getsession().substring(1, arguments.get(i).getsession().length() - 1));
                if (i < arguments.size() - 1)
                    stringBuilder.append(",");
            }

            stringBuilder.append(");");
            return stringBuilder.toString();
        } else if (functionName.contains(".localStorage.setItem")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("localStorage.setItem('").append(functionName.substring(0, functionName.indexOf("."))).append("'");
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(", JSON.stringify(this.").append(functionName.substring(0, functionName.indexOf("."))).append(")").append(");");
                if (i < arguments.size() - 1)
                    stringBuilder.append(",");
            }
            return stringBuilder.toString();
        } else if (functionName.contains("alert")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("alert(");
            for (int i = 0; i < arguments.size(); i++) {
                stringBuilder.append(arguments.get(i).getsession());
                if (i < arguments.size() - 1)
                    stringBuilder.append(",");
            }

            stringBuilder.append(");");
            return stringBuilder.toString();
        }
        return this.toString() + ";";
    }
}