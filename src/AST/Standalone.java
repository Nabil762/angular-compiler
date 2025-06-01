package AST;

public class Standalone extends PropertyAssignment {
    String isStandalone;


    public String getIsboolean() {
        return isStandalone;
    }

    public void setIsboolean(String isboolean) {
        this.isStandalone = isboolean;
    }

    @Override
    public String toString() {
        return "standalone: " + isStandalone;
    }

}


