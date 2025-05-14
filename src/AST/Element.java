package AST;

public class Element {
    Tag tag ;
    String htmlName ;
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
        if (htmlName!=null)
            return  "\nElement{" +
                    "\n"+htmlName
                    +"\n}";
       else if (interpolation!=null)
            return  "\nElement{" +
                    "\n"+interpolation
                    +"\n}";

        return  "\nElement{" +
                "\n"+tag
                +"\n}";

    }
}
