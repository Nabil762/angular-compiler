package AST;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private OpeningTag openingTag;
    private List<Element> elements = new ArrayList<>();
    private ClosingTag closingTag;
    private SelfClosingTag selfClosingTag;

    public OpeningTag getOpeningTag() {
        return openingTag;
    }

    public void setOpeningTag(OpeningTag openingTag) {
        this.openingTag = openingTag;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public ClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(ClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nTag{");

        if (selfClosingTag != null && openingTag!=null) {
            sb.append("\n").append(openingTag);
            sb.append("\n").append(selfClosingTag);
        } else if (elements != null && !elements.isEmpty() && openingTag!=null) {
            sb.append("\n").append(openingTag);
            sb.append("\n").append(elements);
            sb.append("\n").append(closingTag);
        }

        sb.append("\n}");
        return sb.toString();
    }
}