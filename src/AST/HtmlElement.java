package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    List<Attribute> attributeList = new ArrayList<Attribute>();
    List<Element> elements = new ArrayList<Element>();

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "\nHtmlElement{ Tag = div" +
                "\nattributeList=" + attributeList +
                "\nelements=" + elements +
                "\n}";
    }
}
