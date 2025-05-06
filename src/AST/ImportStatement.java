package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement {
    List<String> identifiers = new ArrayList<String>();
    String library;

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "\nImportStatement{" +
                "\n components =" + identifiers +
                "\n from library =" + library +
                "\n}";
    }
}
