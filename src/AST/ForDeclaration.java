package AST;

public class ForDeclaration extends AstNode {
    String function_name;
    String instance_of_array;
    String array_name;
    String type_of_function;
    BodyFor bodyFor;

    public String getType_of_function() {
        return type_of_function;
    }

    public void setType_of_function(String type_of_function) {
        this.type_of_function = type_of_function;
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public String getInstance_of_array() {
        return instance_of_array;
    }

    public void setInstance_of_array(String instance_of_array) {
        this.instance_of_array = instance_of_array;
    }

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
                "\nfunction_name='" + function_name + '\'' +
                "\ntype_of_function='" + type_of_function + '\'' +
                "\ninstance_of_array='" + instance_of_array + '\'' +
                "\narray_name='" + array_name + '\'' +
                "\nbodyFor=" + bodyFor +
                "\n}";
    }
}
