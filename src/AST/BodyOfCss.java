package AST;

public class BodyOfCss extends AstNode {
    Objecte objecte;

    public Objecte getObjecte() {
        return objecte;
    }

    public void setObjecte(Objecte objecte) {
        this.objecte = objecte;
    }

    @Override
    public String toString() {
        return "\nBodyOfCss{" +
                "\nobjecte=" + objecte +
                "\n}";
    }
}
