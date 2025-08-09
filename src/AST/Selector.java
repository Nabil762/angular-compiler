package AST;

public class Selector extends PropertyAssignment {
    String STRING_LIT;

    public String getSTRING_LIT() {
        return STRING_LIT;
    }

    public void setSTRING_LIT(String STRING_LIT) {
        this.STRING_LIT = STRING_LIT;
    }

    @Override
    public String toString() {
        return "selector: '" + STRING_LIT + "'";
    }
    @Override
    public String generatedCode() {
        return "";
    }
}



