package AST;

import java.util.ArrayList;
import java.util.List;

public class Template {
    List<Element> element =new ArrayList();

    public List<Element> getElement() {
        return element;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

    @Override
    public String toString() {

        return "\nTemplate{" +
                "\n" + element +
                "\n}";
    }
}
