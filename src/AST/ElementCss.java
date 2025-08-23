package AST;

import java.util.ArrayList;
import java.util.List;

public class ElementCss extends AstNode {
    String identifier;
    List<BodyOfelement> bodyOfelementList = new ArrayList<BodyOfelement>();

    public List<BodyOfelement> getBodyOfelementList() {
        return bodyOfelementList;
    }

    public void setBodyOfelementList(List<BodyOfelement> bodyOfelementList) {
        this.bodyOfelementList = bodyOfelementList;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "\nElementCss{" +
                "\nidentifier='" + identifier +
                "\nbodyOfelementList=" + bodyOfelementList +
                "\n}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (identifier.contains("-hover"))
            identifier = identifier.replace("-hover", ":hover");
        if (identifier.contains("-placeholder"))
            identifier = identifier.replace("-placeholder", "::placeholder");
        if (identifier.contains("-focus"))
            identifier = identifier.replace("-focus", ":focus");
        if (identifier.equals("app ")) {
            stringBuilder.append("#").append(identifier).append("{\n");
        } else if (!identifier.equals("body ")) {
            stringBuilder.append(".").append(identifier).append("{\n");
        } else {
            stringBuilder.append(identifier).append("{\n");
        }
        for (BodyOfelement bodyOfelement : bodyOfelementList) {
            stringBuilder.append(bodyOfelement.generatedCode()).append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
