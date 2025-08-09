package AST;

import java.util.ArrayList;
import java.util.List;

public class Objecte extends AstNode {
    List<ElementCss> elementCssList = new ArrayList<ElementCss>();

    public List<ElementCss> getElementCssList() {
        return elementCssList;
    }

    public void setElementCssList(List<ElementCss> elementCssList) {
        this.elementCssList = elementCssList;
    }

    @Override
    public String toString() {
        return "\nObjecte{" +
                "\nelementCssList=" + elementCssList +
                "\n}";
    }
    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ElementCss elementCss : elementCssList) {
            stringBuilder.append(elementCss.generatedCode()).append("\n");
        }
        return stringBuilder.toString();
    }
}
