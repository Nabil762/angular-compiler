package AST;

import java.util.ArrayList;
import java.util.List;

public class ImgTag {
    List<Attribute> attributeList = new ArrayList<Attribute>();

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

    @Override
    public String toString() {
        return "\nImgTag{ tag: " + tag +
                "\nattributeList=" + attributeList + "\n}";
    }
}
