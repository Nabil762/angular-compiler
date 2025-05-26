package AST;

public class Interpolation extends Element {

    String NAME_HTML;

    public String getNAME_HTML() {
        return NAME_HTML;
    }

    public void setNAME_HTML(String NAME_HTML) {
        this.NAME_HTML = NAME_HTML;
    }

    @Override
    public String toString() {
        return "\nInterpolation{" +
                "\nNAME_HTML='" + NAME_HTML +
                "\n}";
    }
}

