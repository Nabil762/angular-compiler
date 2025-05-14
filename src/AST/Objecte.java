package AST;

import java.util.ArrayList;
import java.util.List;

public class Objecte {
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
}
