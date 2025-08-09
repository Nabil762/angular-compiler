package AST;

public  class SingleType extends AstNode {
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
        if (ID != null) {
            return "\nSingleType{" +
                    "ID= '" + ID + '\'' +
                    "}";
        }
        return "\nSingleType{" +
                "type= '" + type + '\'' +
                "}";
    }
    @Override
    public String generatedCode() {
        return "";
    }
}

