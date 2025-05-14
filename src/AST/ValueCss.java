package AST;

import java.util.ArrayList;
import java.util.List;

public class ValueCss {
    List<String> identifiers = new ArrayList<String>();

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        return "\nValueCss{" +
                "\nidentifiers=" + identifiers +
                "\n}";
    }
}
