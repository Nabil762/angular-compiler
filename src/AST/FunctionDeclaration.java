package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends ListDeclaration {
    String functionName;
    ParameterList parameterList;
    Type type;

    List<FunctionBody> functionBodyList = new ArrayList<FunctionBody>();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<FunctionBody> getFunctionBodyList() {
        return functionBodyList;
    }

    public void setFunctionBodyList(List<FunctionBody> functionBodyList) {
        this.functionBodyList = functionBodyList;
    }

    @Override
    public String toString() {
        if (type == null && parameterList != null && functionBodyList != null) {
            return "\nFunctionDeclaration {" +
                    "\nfunctionName =" + functionName +
                    ",\n" + parameterList +
                    "\n{" + functionBodyList +
                    "\n}";
        }
        if (parameterList == null && type != null && functionBodyList != null) {
            return "\nFunctionDeclaration {" +
                    "\nfunctionName =" + functionName +
                    ",type =" + type +
                    "\n {" + functionBodyList +
                    "\n}";
        }

        return "\nFunctionDeclaration{" +
                "\nname='" + functionName + '\'' +
                parameterList +
                type +
                "\n, {" + functionBodyList +
                "\n}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(functionName).append("(");
        if (parameterList != null)
            stringBuilder.append(parameterList.generatedCode());
        stringBuilder.append(") {\n");
        for (FunctionBody functionBody : functionBodyList) {
            stringBuilder.append(functionBody.generatedCode());
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
