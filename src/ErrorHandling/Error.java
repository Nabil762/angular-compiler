package ErrorHandling;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Error {
    List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public void print() {
        String filePath = "src/ErrorHandling/Errors.txt";
        try {
            if (errors.isEmpty())
                errors.add("No Error in this test");
            Files.write(Paths.get(filePath), errors, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        for (String error : errors)
//            System.err.println(error);
    }
}