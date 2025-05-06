package AST;

public class SingleType {
    String ID;
    String type;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nSingleType{" +
                "ID= '" + ID + '\'' +
                "\n type= '" + type + '\'' +
                "\n}";
    }
}
