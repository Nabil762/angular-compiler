package AST;

public class FunctionBody extends AstNode {
    String thisis;
    String identifierDotThis;
    String identifier;
    ValueExpression valueExpression;

    public String getThisis() {
        return thisis;
    }

    public void setThisis(String thisis) {
        this.thisis = thisis;
    }

    public String getIdentifierDotThis() {
        return identifierDotThis;
    }

    public void setIdentifierDotThis(String identifierDotThis) {
        this.identifierDotThis = identifierDotThis;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(ValueExpression valueExpression) {
        this.valueExpression = valueExpression;
    }

    @Override
    public String toString() {
        if (identifierDotThis != null && identifier != null && valueExpression == null) {
            return "FunctionBody{" +
                    "\nthis = '" + thisis + '\'' +
                    "\n identifierDotThis = '" + identifierDotThis + '\'' +
                    "\n identifier equivalent='" + identifier + '\'' +
                    "\n}";
        }
        if (identifier == null && valueExpression != null && identifierDotThis != null) {
            return "FunctionBody{" +
                    "\nthis = '" + thisis + '\'' +
                    "\n identifierDotThis = '" + identifierDotThis + '\'' +
                    "\n valueExpression equivalent='" + valueExpression + '\'' +
                    "\n}";
        }

        return "FunctionBody{" +
                "\n valueExpression = '" + valueExpression + '\'' +
                "\n}";
    }
}