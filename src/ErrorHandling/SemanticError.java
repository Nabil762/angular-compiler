package ErrorHandling;

import symbolTableAngular.Row;
import symbolTableAngular.SymbolTable;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class SemanticError {
    private List<SymbolTable> symbolTables;
    private final Error error;


    public SemanticError() {
        this(new ArrayList<>());
    }

    public SemanticError(List<SymbolTable> symbolTables) {
        this.symbolTables = symbolTables != null ? symbolTables : new ArrayList<>();
        this.error = new Error();
    }

    public List<SymbolTable> getSymbolTables() {
        return new ArrayList<>(symbolTables);
    }

    public Error getError() {
        return error;
    }

    public void setSymbolTables(List<SymbolTable> symbolTables) {
        this.symbolTables = symbolTables != null ? symbolTables : new ArrayList<>();
    }

    public boolean check() {
        boolean isValid = true;
        if (!IncorrectAttribute(this.symbolTables)) {
            error.getErrors().add("Exception Incorrect_Attribute");
            System.out.println();
            isValid = false;
        }
        if (!DetectCompositionError(this.symbolTables)) {
            error.getErrors().add("Exception Composition Error");
            System.out.println();
            isValid = false;
        }
        if (!DetectSelectorTemplateError(this.symbolTables)) {
            error.getErrors().add("Exception Selector|Template Error");
            System.out.println();
            isValid = false;
        }
        if (!RepeatedDeclarationFunction(this.symbolTables)) {
            error.getErrors().add("Exception RepeatedDeclarationFunction");
            System.out.println();
            isValid = false;
        }
        if (!RepeatedDeclarationObjectInInterface(this.symbolTables)) {
            error.getErrors().add("Exception RepeatedDeclarationObjectInInterface");
            System.out.println();
            isValid = false;
        }
        if (!IncorrectAttributeCss(this.symbolTables)) {
            error.getErrors().add("Exception IncorrectAttributeCss");
            System.out.println();
            isValid = false;
        }
        if (!ClassDeclarationAndStandalone(this.symbolTables)) {
            error.getErrors().add("Exception IncorrectBodyComponent");
            System.out.println();
            isValid = false;
        }
        return isValid;
    }

    private boolean IncorrectAttribute(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        boolean checkError = true;
        SymbolTable symbolTable = symbolTables.get(0);
        List<Row> listAttributeInInterface = new ArrayList<>();
        List<Row> listAttributeInFunction = new ArrayList<>();
        Map<Row, Integer> Attr = new HashMap<>();
        int numberObjectExpressionList = 0;
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringInterfaceDecl"))
                    listAttributeInInterface.add(symbolTable.getRows().get(i));
                if (symbolTable.getRows().get(i).getType().contains("StringInFunction")) {
                    listAttributeInFunction.add(symbolTable.getRows().get(i));
                    String x = symbolTable.getRows().get(i).getValue();
                    if (!Attr.keySet().stream().anyMatch(key -> x.equals(key.getValue())) && listAttributeInInterface.stream().anyMatch(obj -> x.equals(obj.getValue()))) {
                        Attr.put(symbolTable.getRows().get(i), 1);
                    } else {
                        for (Map.Entry<Row, Integer> entry : Attr.entrySet()) {
                            String key = entry.getKey().getValue();
                            Integer value = entry.getValue();
                            if (Objects.equals(key, x)) {
                                entry.setValue(value + 1);
                            }
                        }
                    }
                }
                if (symbolTable.getRows().get(i).getType().contains("numberObjectExpressionList"))
                    numberObjectExpressionList = Integer.parseInt(symbolTable.getRows().get(i).getValue());
            }
        }
        for (Row funcAttr : listAttributeInFunction) {
            if (!listAttributeInInterface.stream().anyMatch(obj -> funcAttr.getValue().equals(obj.getValue()))) {
                error.getErrors().add("At Line " + funcAttr.getLine() + " in position " + funcAttr.getPosition() + " Attribute " + funcAttr.getValue() + " not found in interface");
                checkError = false;
            }
        }
        System.out.println();
        for (Map.Entry<Row, Integer> entry : Attr.entrySet()) {
            String key = entry.getKey().getValue();
            Integer value = entry.getValue();
            int line = entry.getKey().getLine();
            int pos = entry.getKey().getPosition();
            if (value != numberObjectExpressionList) {
                error.getErrors().add("At Line " + line + " in position " + pos + " Attribute " + key + " not found in Assignment");
                checkError = false;
            }
        }
        return checkError;
    }

    private boolean DetectCompositionError(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        boolean checkError = true, imp = false;
        SymbolTable symbolTable = symbolTables.get(1);
        List<Row> listImportStatement = new ArrayList<>();
        List<Row> listImportDecl = new ArrayList<>();
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringImportDecl"))
                    listImportDecl.add(symbolTable.getRows().get(i));
                if (symbolTable.getRows().get(i).getType().contains("StringImportStatement")) {
                    listImportStatement.add(symbolTable.getRows().get(i));
                    if (symbolTable.getRows().get(i).getValue().equals("Component")) {
                        imp = true;
                    }
                }
            }
        }


        for (Row imports : listImportDecl) {
            if (!listImportStatement.stream().anyMatch(obj -> imports.getValue().equals(obj.getValue()))) {
                error.getErrors().add("At Line " + imports.getLine() + " in position " + imports.getPosition() + " imports " + imports.getValue() + " not found in import statement");
                checkError = false;
            }
        }
        if (!imp) {
            error.getErrors().add("import Component not found in import statement");
        }
        return checkError && imp;
    }

    private boolean DetectSelectorTemplateError(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        boolean checkError = true;
        SymbolTable symbolTable = symbolTables.get(4);
        List<Row> listSelector = new ArrayList<>();
        List<Row> listTemplate = new ArrayList<>();
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringTemplate"))
                    listTemplate.add(symbolTable.getRows().get(i));
                if (symbolTable.getRows().get(i).getType().contains("StringSelector"))
                    listSelector.add(symbolTable.getRows().get(i));
            }
        }
        if (listTemplate.isEmpty()) {
            error.getErrors().add("template not found in Component Declaration");
            checkError = false;
        }
        if (listSelector.isEmpty()) {
            error.getErrors().add("selector not found in Component Declaration");
            checkError = false;
        }
        if (listSelector.size() > 1) {
            for (int i = 1; i < listSelector.size(); i++) {
                error.getErrors().add("At Line " + listSelector.get(i).getLine() + " in position " + listSelector.get(i).getPosition() + "selector Duplicated");
            }
            checkError = false;
        }
        if (listTemplate.size() > 1) {
            for (int i = 1; i < listTemplate.size(); i++) {
                error.getErrors().add("At Line " + listTemplate.get(i).getLine() + " in position " + listTemplate.get(i).getPosition() + "template Duplicated");
            }
            checkError = false;
        }

        return checkError;
    }

    private boolean RepeatedDeclarationFunction(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        boolean checkError = true;
        SymbolTable symbolTable = symbolTables.get(2);
        List<Row> listParameter = new ArrayList<>();
        List<Row> listFunctionName = new ArrayList<>();
        List<Row> listReturnType = new ArrayList<>();

        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringReturnValue"))
                    listReturnType.add(symbolTable.getRows().get(i));
                if (symbolTable.getRows().get(i).getType().contains("StringFunctionName"))
                    listFunctionName.add(symbolTable.getRows().get(i));
                if (symbolTable.getRows().get(i).getType().contains("StringParameter"))
                    listParameter.add(symbolTable.getRows().get(i));
            }
        }
        for (int j = 0; j < listFunctionName.size(); j++) {
            for (int i = j + 1; i < listFunctionName.size(); i++) {
                if (Objects.equals(listFunctionName.get(i).getValue(), listFunctionName.get(j).getValue()) && Objects.equals(listParameter.get(i).getValue(), listParameter.get(j).getValue()) && Objects.equals(listReturnType.get(i).getValue(), listReturnType.get(j).getValue())) {
                    error.getErrors().add("At Line " + listFunctionName.get(i).getLine() + " in position " + listFunctionName.get(i).getPosition() + " Function was Decelerated already ");
                    checkError = false;
                }
            }
        }
        return checkError;
    }

    private boolean RepeatedDeclarationObjectInInterface(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        boolean checkError = true;
        SymbolTable symbolTable = symbolTables.get(0);
        List<Row> listObjectName = new ArrayList<>();
        List<Row> listCheck = new ArrayList<>();

        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringInterfaceDecl"))
                    listObjectName.add(symbolTable.getRows().get(i));
            }
        }
        if (!listObjectName.isEmpty())
            listCheck.add(listObjectName.get(0));
        for (int j = 1; j < listObjectName.size(); j++) {
            for (int i = 0; i < listCheck.size(); i++) {
                if (Objects.equals(listCheck.get(i).getValue(), listObjectName.get(j).getValue())) {
                    error.getErrors().add("At Line " + listObjectName.get(i).getLine() + " in position " + listObjectName.get(i).getPosition() + " Object was Decelerated already ");
                    checkError = false;
                }
            }
        }
        return checkError;
    }

    private boolean IncorrectAttributeCss(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        List<String> CssAttr = Arrays.asList("display", "width", "gap", "border-right", "list-style-type", "padding", "align-items", "border-bottom", "cursor", "height", "object-fit", "margin-bottom");
        boolean checkError = true;
        SymbolTable symbolTable = symbolTables.get(3);
        List<Row> listAttr = new ArrayList<>();
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringAttCss"))
                    listAttr.add(symbolTable.getRows().get(i));
            }
        }
        for (Row Attr : listAttr) {
            if (!CssAttr.stream().anyMatch(obj -> Attr.getValue().equals(obj))) {
                error.getErrors().add("At Line " + Attr.getLine() + " in position " + Attr.getPosition() + " Css attribute not found in Body of Css ");
                checkError = false;
            }
        }
        return checkError;
    }

    private boolean ClassDeclarationAndStandalone(List<SymbolTable> symbolTables) {
        if (symbolTables == null || symbolTables.isEmpty()) {
            error.getErrors().add("No symbol tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> standlist = new ArrayList<>();
        Row classlist = new Row();
        SymbolTable symbolTable = symbolTables.get(5);
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("StringStandalone"))
                    standlist.add(symbolTable.getRows().get(i));
                if (symbolTable.getRows().get(i).getType().contains("StringClassDeclaration"))
                    classlist = symbolTable.getRows().get(i);
            }
        }
        boolean checkStandalone = true;
        if (standlist.isEmpty()) {
            error.getErrors().add("standalone not found in Component Declaration");
            checkError = false;
            checkStandalone = false;
        }
        if (standlist.size() > 1) {
            for (int i = 1; i < standlist.size(); i++) {
                error.getErrors().add("At Line " + standlist.get(i).getLine() + " in position " + standlist.get(i).getPosition() + " standalone Duplicated");
            }
            checkError = false;
        }
        for (Row row : standlist) {
            if (Objects.equals(row.getValue(), "false"))
                checkStandalone = false;
        }
        if (!checkStandalone) {
            error.getErrors().add("At Line " + classlist.getLine() + " in position " + classlist.getPosition() + " classDeclaration Error the standalone is false or not found");
        }
        return checkError && checkStandalone;
    }

    public void printErrors() {
        error.print();
    }
}
