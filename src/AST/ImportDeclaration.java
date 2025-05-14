package AST;

public class ImportDeclaration {
    String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nImportDeclaration{" +
                "\nid='" + id + '\'' +
                "\n}";
    }
}
