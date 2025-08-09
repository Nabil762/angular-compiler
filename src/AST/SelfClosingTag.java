package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag extends Tag {
    String tag_name;
    List<Attributes> attributes = new ArrayList<>();

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }
    @Override
    public String toString() {
        return "\nSelfClosingTag{" +
                "tag_name='" + tag_name + '\'' +
                "\nattributes=" + attributes +
                "\n}";
    }

}