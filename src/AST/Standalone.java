package AST;

public class Standalone {
    String isboolean;

    public String getIsboolean() {
        return isboolean;
    }

    public void setIsboolean(String isboolean) {
        this.isboolean = isboolean;
    }

    @Override
    public String toString() {
        return "\nStandalone{" +
                "\n" + isboolean +
                "\n}";
    }
}
