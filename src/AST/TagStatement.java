package AST;

import java.util.ArrayList;
import java.util.List;

public class TagStatement {
    List<Attribute> attributeList = new ArrayList<Attribute>();
    List<Element> elements = new ArrayList<Element>();

    String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

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
        return "\nTagStatement{ tag:" + tag +
                "\nattributeList=" + attributeList +
                "\nelements=" + elements +
                "\n}";
    }
}
