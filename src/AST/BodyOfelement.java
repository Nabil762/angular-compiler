package AST;

public class BodyOfelement extends AstNode {

    String identifier;
    ValueCss valueCss;

    public ValueCss getValueCss() {
        return valueCss;
    }

    public void setValueCss(ValueCss valueCss) {
        this.valueCss = valueCss;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nBodyOfelement{" +
                "\nidentifier='" + identifier + '\'' +
                valueCss +
                "}";
    }

    @Override
    public String generatedCode() {
        return identifier+ ": "+valueCss.generatedCode()+" ;";
    }
}
