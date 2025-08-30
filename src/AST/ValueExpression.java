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
            return "\n ValueExpression{ " + text + "}";
        else if (integer != null) {
            return "\n ValueExpression{ " + integer + "}";
        } else if (functionCall != null) {
            return "\n ValueExpression{ " + functionCall + " }";
        }
        return "\n ValueExpression{ " + isBoolean + " }";
    }

    public String val() {
        if (text != null)
            return text;
        else if (integer != null) {
            return integer + "";
        } else if (functionCall != null) {
            return functionCall + "";
        }
        return isBoolean + "";
    }

    @Override
    public String generatedCode() {
        if (text != null)
            return text;
        else if (integer != null) {
            return integer.toString();
        } else if (functionCall != null) {
            return functionCall.generatedCode();
        }
        return isBoolean;
    }


    public String getInput() {
        if (text != null)
            return text;
        else if (integer != null) {
            return integer.toString();
        } else if (functionCall != null) {
//            functionCall.generatedCode();
        }
        return isBoolean;
    }

    //https://api.whatsapp.com/send/?phone=${phone_number}&text=${encodedMessage}`;
//            window.open(whatsappUrl, '_blank');
    public String gethref() {
        if (text != null) {
            if (text.contains("http")) {
                text = text.replace("'", "`");
                return "const Url = " + text + ";\nwindow.open(Url, '_blank');";
            } else {
                return "window.location.href = " + text.substring(0, text.length() - 1) + ".html';";
            }
        }
        return "";
    }

    public String getsession() {
        if (text != null) {
            if (text.contains("${")) {
                return text.substring(3, text.length() - 2);
            } else if (text.contains("[")) {
                text=text.replace("'","");

                return text;
            } else {
                return text;
            }
        }
        return "";
    }

}

