package AST;

import java.util.ArrayList;
import java.util.List;

public class ElementCss {
    List<BodyOfelement> bodyOfelementList = new ArrayList<BodyOfelement>();

    public List<BodyOfelement> getBodyOfelementList() {
        return bodyOfelementList;
    }

    public void setBodyOfelementList(List<BodyOfelement> bodyOfelementList) {
        this.bodyOfelementList = bodyOfelementList;
    }

    @Override
    public String toString() {
        return "\nElementCss{" +
                "\nbodyOfelementList=" + bodyOfelementList +
                "\n}";
    }
}
