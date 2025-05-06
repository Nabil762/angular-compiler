package AST;

public class AttributeValue {
    String cssText;
    Interpolation interpolation;

    public String getCssText() {
        return cssText;
    }

    public void setCssText(String cssText) {
        this.cssText = cssText;
    }

    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        if(cssText != null)
            return "\n AttributeValue{ cssText" + cssText + "\n}";
        return  "\n AttributeValue{ interpolation" + interpolation + "\n}";
    }
}
