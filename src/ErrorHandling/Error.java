package ErrorHandling;

import java.util.ArrayList;
import java.util.List;

public class Error {
    List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public void print() {
        for(String error : errors ){
            System.err.println(error);
        }
    }
}
