package AST;

public class ForDeclaration {
    String array_name;
    BodyFor bodyFor;

    public String getArray_name() {
        return array_name;
    }

    public void setArray_name(String array_name) {
        this.array_name = array_name;
    }

    public BodyFor getBodyFor() {
        return bodyFor;
    }

    public void setBodyFor(BodyFor bodyFor) {
        this.bodyFor = bodyFor;
    }

    @Override
    public String toString() {
        return "\nForDeclaration{" +
                "\narray_name='" + array_name + '\'' +
                "\nbodyFor=" + bodyFor +
                "\n}";
    }
}
