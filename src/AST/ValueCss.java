package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ValueCss extends AstNode {
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
                "}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String identifier : identifiers) {
            if (Objects.equals(identifier, "vh")) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.append(identifier).append(" ");

        }
        return stringBuilder.toString();
    }
}
