package AST;

public class Interpolation {
    String string_literal;

    public String getString_literal() {
        return string_literal;
    }

    public void setString_literal(String string_literal) {
        this.string_literal = string_literal;
    }

    @Override
    public String toString() {
        return "\nInterpolation{" +
                "string_literal= '" + string_literal + '\'' +
                "\n}";
    }
}
