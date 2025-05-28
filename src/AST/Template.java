package AST;

import java.util.ArrayList;
import java.util.List;

public class Template extends PropertyAssignment {
    List<Element> elements = new ArrayList<>();

    public List<Element> getElement() {
        return elements;
    }

    public void setElement(List<Element> element) {
        this.elements = element;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("template: `");
        for (Element element : elements) {
            stringBuilder.append(element.toString());
        }
        stringBuilder.append("`");
        return stringBuilder.toString();
    }
    //    @Override
//    public String toString() {
//
//        return "\nTemplate{" +
//                "\n" + elements +
//                "\n}";
//    }

}



