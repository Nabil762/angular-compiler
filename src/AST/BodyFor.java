package AST;

public class BodyFor {
    String array_name;
    String element_of_array;

    public String getArray_name() {
        return array_name;
    }

    public void setArray_name(String array_name) {
        this.array_name = array_name;
    }

    public String getElement_of_array() {
        return element_of_array;
    }

    public void setElement_of_array(String element_of_array) {
        this.element_of_array = element_of_array;
    }

    @Override
    public String toString() {
        return "\nBodyFor{" +
                "variable='" + array_name + '\'' +
                "\n iterator of array='" + element_of_array + '\'' +
                "\n}";
    }
}
