package AST;

public class PropertyBinding {
    String src;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "\nPropertyBinding{" + src + "}";
    }
}
