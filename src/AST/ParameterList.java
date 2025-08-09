package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList extends AstNode {
    List<Parameter> parameters = new ArrayList<Parameter>();

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "\nParameterList{" +
                "\nparameters=" + parameters +
                "\n}";
    }
    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            stringBuilder.append(parameters.get(i).generatedCode());
            if (i < parameters.size() - 1)
                stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }
}
