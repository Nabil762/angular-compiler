package AST;

import java.util.ArrayList;
import java.util.List;

public class TagStatement {
    List<Attribute> attributeList = new ArrayList<Attribute>();

    List<Element> elementList = new ArrayList<Element>();
    String tag;

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

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


    @Override
    public String toString() {
        return "\nTagStatement{ tag:" + tag +
                "\nattributeList=" + attributeList +
                "\nelements=" + elementList +
                "\n}";
    }
}
