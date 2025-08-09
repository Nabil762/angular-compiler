package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement extends AstNode {
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
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("import ");
        if (identifiers.isEmpty()) {
            stringBuilder.append("*");
        } else {
            stringBuilder.append("{ ");
            for (int i = 0; i < identifiers.size(); i++) {
                stringBuilder.append(identifiers.get(i));
                if (i < identifiers.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(" }");
        }
        stringBuilder.append(" from '").append(library).append("';");

        return stringBuilder.toString();
    }
    @Override
    public String generatedCode() {
        return "";
    }
}

