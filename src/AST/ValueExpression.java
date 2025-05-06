package AST;

public class ValueExpression {
    String text;
    Integer integer;
    String isBoolean;

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

    @Override
    public String toString() {
        if(text != null)
            return "\n ValueExpression{ " + text + "\n }";
        else if (integer != null) {
            return "\n ValueExpression{ " + integer + "\n }";
        }
        return "\n ValueExpression{ " + isBoolean + "\n }";
    }

}
