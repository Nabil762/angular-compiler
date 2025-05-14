package AST;

public class ClosingTag {
    String NAME_HTML ;

    public String getNAME_HTML() {
        return NAME_HTML;
    }

    public void setNAME_HTML(String NAME_HTML) {
        this.NAME_HTML = NAME_HTML;
    }

    @Override
    public String toString() {
        return "\nClosingTag{" +
                "\nNAME_HTML='" + NAME_HTML + '\'' +
                "\n}";
    }
}
