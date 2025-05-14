package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag {
    List<Attributes> attributes = new ArrayList<>();
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "\nSelfClosingTag{" +
                "\nattributes=" + attributes +
                "\n}";
    }
}
