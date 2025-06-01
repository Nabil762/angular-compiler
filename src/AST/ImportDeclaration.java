package AST;

public class ImportDeclaration extends PropertyAssignment {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "imports: [" + (id != null ? id : "") + "]";
    }
}