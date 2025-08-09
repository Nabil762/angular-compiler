package AST;

import java.util.Objects;

public class Element extends AstNode {
    Tag tag;
    String htmlName;
    Interpolation interpolation;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName;
    }

    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        if (htmlName != null)
            return "\nElement{" +
                    this.getHtmlName()
                    + "}";
        else if (interpolation != null)
            return "\nElement{" +
                    interpolation
                    + "}";

        return "\nElement{" +
                tag
                + "}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (tag == null) {
            return "";
        }
        if (tag instanceof StandardTag) {
            StandardTag standardTag = (StandardTag) tag;
            stringBuilder.append(standardTag.generatedCode());
        }
        return stringBuilder.toString();
    }

    public String getStructure(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (tag != null && tag instanceof StandardTag) {
            stringBuilder.append(tag.getStructure(fatherName));
        }
        return stringBuilder.toString();
    }

    public String getRender(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (tag != null && tag instanceof StandardTag) {
            stringBuilder.append(tag.getRender(fatherName));
        }
        return stringBuilder.toString();
    }

}