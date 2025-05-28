package AST;

public class ValueExpression extends AstNode {

    String text;
    Integer integer;
    String isBoolean;

    FunctionCall functionCall;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getIsBoolean() {
        return isBoolean;
    }

    public void setIsBoolean(String isBoolean) {
        this.isBoolean = isBoolean;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        if (text != null)
            return "\n ValueExpression{ " + text + "\n }";
        else if (integer != null) {
            return "\n ValueExpression{ " + integer + "\n }";
        } else if (functionCall != null) {
            return "\n ValueExpression{ " + functionCall + "\n }";
        }
        return "\n ValueExpression{ " + isBoolean + "\n }";
    }
}
