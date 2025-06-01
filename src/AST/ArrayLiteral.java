package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral extends AstNode {
    List<String> identifiers = new ArrayList<String>();

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        return "\nimported components from angular library [" + identifiers + "]";
    }
}
