package AST;

public class Style extends PropertyAssignment {
    BodyOfCss bodyOfcss;

    public BodyOfCss getBodyOfcss() {
        return bodyOfcss;
    }

    public void setBodyOfcss(BodyOfCss bodyOfcss) {
        this.bodyOfcss = bodyOfcss;
    }

    @Override
    public String toString() {
        return "\nStyle{" +
                "\nbodyOfcss=" + bodyOfcss +
                "\n}";
    }
}
