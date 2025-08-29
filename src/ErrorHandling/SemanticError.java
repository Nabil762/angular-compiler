package ErrorHandling;

import symbolTableAngular.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class SemanticError {
    private AttributeSymbolTable attributeSymbolTable;
    private DetectCompositionSymbolTable detectCompositionSymbolTable;
    private DetectSelectorSymbolTable detectSelectorSymbolTable;
    private DetectTemplateSymbolTable detectTemplateSymbolTable;
    private DeclarationFunctionSymbolTable declarationFunctionSymbolTable;
    private DeclarationObjectInInterfaceSymbolTable declarationObjectInInterfaceSymbolTable;
    private AttributeCssSymbolTable attributeCssSymbolTable;
    private ClassDeclarationAndStandaloneSymbolTable classDeclarationAndStandaloneSymbolTable;
    private TagsSymbolTable tagsSymbolTable;
    private final Error error;

    public SemanticError() {
        this.error = new Error();
        this.attributeSymbolTable = new AttributeSymbolTable();
        this.detectCompositionSymbolTable = new DetectCompositionSymbolTable();
        this.detectSelectorSymbolTable = new DetectSelectorSymbolTable();
        this.detectTemplateSymbolTable = new DetectTemplateSymbolTable();
        this.declarationFunctionSymbolTable = new DeclarationFunctionSymbolTable();
        this.declarationObjectInInterfaceSymbolTable = new DeclarationObjectInInterfaceSymbolTable();
        this.attributeCssSymbolTable = new AttributeCssSymbolTable();
        this.classDeclarationAndStandaloneSymbolTable = new ClassDeclarationAndStandaloneSymbolTable();
        this.tagsSymbolTable = new TagsSymbolTable();
    }

    public SemanticError(AttributeSymbolTable attributeSymbolTable, DetectCompositionSymbolTable detectCompositionSymbolTable, DetectSelectorSymbolTable detectSelectorSymbolTable, DetectTemplateSymbolTable detectTemplateSymbolTable, DeclarationFunctionSymbolTable declarationFunctionSymbolTable, DeclarationObjectInInterfaceSymbolTable declarationObjectInInterfaceSymbolTable, AttributeCssSymbolTable attributeCssSymbolTable, ClassDeclarationAndStandaloneSymbolTable classDeclarationAndStandaloneSymbolTable, TagsSymbolTable tagsSymbolTable) {
        this.error = new Error();
        this.attributeSymbolTable = attributeSymbolTable;
        this.detectCompositionSymbolTable = detectCompositionSymbolTable;
        this.detectSelectorSymbolTable = detectSelectorSymbolTable;
        this.detectTemplateSymbolTable = detectTemplateSymbolTable;
        this.declarationFunctionSymbolTable = declarationFunctionSymbolTable;
        this.declarationObjectInInterfaceSymbolTable = declarationObjectInInterfaceSymbolTable;
        this.attributeCssSymbolTable = attributeCssSymbolTable;
        this.classDeclarationAndStandaloneSymbolTable = classDeclarationAndStandaloneSymbolTable;
        this.tagsSymbolTable = tagsSymbolTable;
    }

    public Error getError() {
        return error;
    }

    public AttributeSymbolTable getAttributeSymbolTable() {
        return attributeSymbolTable;
    }

    public void setAttributeSymbolTable(AttributeSymbolTable attributeSymbolTable) {
        this.attributeSymbolTable = attributeSymbolTable;
    }

    public DetectCompositionSymbolTable getDetectCompositionSymbolTable() {
        return detectCompositionSymbolTable;
    }

    public void setDetectCompositionSymbolTable(DetectCompositionSymbolTable detectCompositionSymbolTable) {
        this.detectCompositionSymbolTable = detectCompositionSymbolTable;
    }

    public DetectSelectorSymbolTable getDetectSelectorSymbolTable() {
        return detectSelectorSymbolTable;
    }

    public void setDetectSelectorSymbolTable(DetectSelectorSymbolTable detectSelectorSymbolTable) {
        this.detectSelectorSymbolTable = detectSelectorSymbolTable;
    }

    public DetectTemplateSymbolTable getDetectTemplateSymbolTable() {
        return detectTemplateSymbolTable;
    }

    public void setDetectTemplateSymbolTable(DetectTemplateSymbolTable detectTemplateSymbolTable) {
        this.detectTemplateSymbolTable = detectTemplateSymbolTable;
    }

    public DeclarationFunctionSymbolTable getDeclarationFunctionSymbolTable() {
        return declarationFunctionSymbolTable;
    }

    public void setDeclarationFunctionSymbolTable(DeclarationFunctionSymbolTable declarationFunctionSymbolTable) {
        this.declarationFunctionSymbolTable = declarationFunctionSymbolTable;
    }

    public DeclarationObjectInInterfaceSymbolTable getDeclarationObjectInInterfaceSymbolTable() {
        return declarationObjectInInterfaceSymbolTable;
    }

    public void setDeclarationObjectInInterfaceSymbolTable(DeclarationObjectInInterfaceSymbolTable declarationObjectInInterfaceSymbolTable) {
        this.declarationObjectInInterfaceSymbolTable = declarationObjectInInterfaceSymbolTable;
    }

    public AttributeCssSymbolTable getAttributeCssSymbolTable() {
        return attributeCssSymbolTable;
    }

    public void setAttributeCssSymbolTable(AttributeCssSymbolTable attributeCssSymbolTable) {
        this.attributeCssSymbolTable = attributeCssSymbolTable;
    }

    public ClassDeclarationAndStandaloneSymbolTable getClassDeclarationAndStandaloneSymbolTable() {
        return classDeclarationAndStandaloneSymbolTable;
    }

    public void setClassDeclarationAndStandaloneSymbolTable(ClassDeclarationAndStandaloneSymbolTable classDeclarationAndStandaloneSymbolTable) {
        this.classDeclarationAndStandaloneSymbolTable = classDeclarationAndStandaloneSymbolTable;
    }

    public TagsSymbolTable getTagsSymbolTable() {
        return tagsSymbolTable;
    }

    public void setTagsSymbolTable(TagsSymbolTable tagsSymbolTable) {
        this.tagsSymbolTable = tagsSymbolTable;
    }

    public boolean check() {
        boolean isValid = true;
        if (!IncorrectAttribute(this.attributeSymbolTable)) {
            error.getErrors().add("Exception Incorrect_Attribute");
            isValid = false;
        }
        if (!DetectCompositionError(this.detectCompositionSymbolTable)) {
            error.getErrors().add("Exception Composition Error");
            isValid = false;
        }
        if (!DetectSelectorError(this.detectSelectorSymbolTable)) {
            error.getErrors().add("Exception Selector Error");
            isValid = false;
        }
        if (!DetectTemplateError(this.detectTemplateSymbolTable)) {
            error.getErrors().add("Exception Template Error");
            isValid = false;
        }
        if (!RepeatedDeclarationFunction(this.declarationFunctionSymbolTable)) {
            error.getErrors().add("Exception RepeatedDeclarationFunction");
            isValid = false;
        }
        if (!RepeatedDeclarationObjectInInterface(this.declarationObjectInInterfaceSymbolTable)) {
            error.getErrors().add("Exception RepeatedDeclarationObjectInInterface");
            isValid = false;
        }
        if (!IncorrectAttributeCss(this.attributeCssSymbolTable)) {
            error.getErrors().add("Exception IncorrectAttributeCss");
            isValid = false;
        }
        if (!ClassDeclarationAndStandalone(this.classDeclarationAndStandaloneSymbolTable)) {
            error.getErrors().add("Exception IncorrectBodyComponent");
            isValid = false;
        }
        if (!Tags(this.tagsSymbolTable)) {
            error.getErrors().add("Exception Tage incorrect open and close");
            isValid = false;
        }
        return isValid;
    }

    private boolean IncorrectAttribute(AttributeSymbolTable attributeSymbolTable) {
        if (attributeSymbolTable == null) {
            error.getErrors().add("No AttributeSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> listAttributeInInterface = new ArrayList<>();
        List<Row> listAttributeInFunction = new ArrayList<>();
        Map<Row, Integer> Attr = new HashMap<>();
        int numberObjectExpressionList = 0;
        for (int i = 0; i < attributeSymbolTable.getRows().size(); i++) {
            if (attributeSymbolTable.getRows().get(i) != null) {
                if (attributeSymbolTable.getRows().get(i).getType().contains("StringInterfaceDecl"))
                    listAttributeInInterface.add(attributeSymbolTable.getRows().get(i));
                if (attributeSymbolTable.getRows().get(i).getType().contains("StringInFunction")) {
                    listAttributeInFunction.add(attributeSymbolTable.getRows().get(i));
                    String x = attributeSymbolTable.getRows().get(i).getValue();
                    if (!Attr.keySet().stream().anyMatch(key -> x.equals(key.getValue())) && listAttributeInInterface.stream().anyMatch(obj -> x.equals(obj.getValue()))) {
                        Attr.put(attributeSymbolTable.getRows().get(i), 1);
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
                if (attributeSymbolTable.getRows().get(i).getType().contains("numberObjectExpressionList"))
                    numberObjectExpressionList = Integer.parseInt(attributeSymbolTable.getRows().get(i).getValue());
            }
        }
        if (listAttributeInInterface.isEmpty() && listAttributeInFunction.size() == 1 && Objects.equals(listAttributeInFunction.get(0).getValue(), "id")) {
            return true;
        }
        for (Row funcAttr : listAttributeInFunction) {
            if (!listAttributeInInterface.stream().anyMatch(obj -> funcAttr.getValue().equals(obj.getValue()))) {
                error.getErrors().add("At Line " + funcAttr.getLine() + " in position " + funcAttr.getPosition() + " Attribute " + funcAttr.getValue() + " not found in interface");
                checkError = false;
            }
        }
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

    private boolean DetectCompositionError(DetectCompositionSymbolTable detectCompositionSymbolTable) {
        if (detectCompositionSymbolTable == null) {
            error.getErrors().add("No DetectCompositionSymbolTable tables provided");
            return false;
        }
        boolean checkError = true, imp = false;
        List<Row> listImportStatement = new ArrayList<>();
        List<Row> listImportDecl = new ArrayList<>();
        for (int i = 0; i < detectCompositionSymbolTable.getRows().size(); i++) {
            if (detectCompositionSymbolTable.getRows().get(i) != null) {
                if (detectCompositionSymbolTable.getRows().get(i).getType().contains("StringImportDecl"))
                    listImportDecl.add(detectCompositionSymbolTable.getRows().get(i));
                if (detectCompositionSymbolTable.getRows().get(i).getType().contains("StringImportStatement")) {
                    listImportStatement.add(detectCompositionSymbolTable.getRows().get(i));
                    if (detectCompositionSymbolTable.getRows().get(i).getValue().equals("Component")) {
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

    private boolean DetectSelectorError(DetectSelectorSymbolTable detectSelectorSymbolTable) {
        if (detectSelectorSymbolTable == null) {
            error.getErrors().add("No DetectSelectorSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> listSelector = new ArrayList<>();
        for (int i = 0; i < detectSelectorSymbolTable.getRows().size(); i++) {
            if (detectSelectorSymbolTable.getRows().get(i) != null) {
                if (detectSelectorSymbolTable.getRows().get(i).getType().contains("StringSelector"))
                    listSelector.add(detectSelectorSymbolTable.getRows().get(i));
            }
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
        return checkError;
    }

    private boolean DetectTemplateError(DetectTemplateSymbolTable detectTemplateSymbolTable) {
        if (detectTemplateSymbolTable == null) {
            error.getErrors().add("No DetectTemplateSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> listTemplate = new ArrayList<>();
        for (int i = 0; i < detectTemplateSymbolTable.getRows().size(); i++) {
            if (detectTemplateSymbolTable.getRows().get(i) != null) {
                if (detectTemplateSymbolTable.getRows().get(i).getType().contains("StringTemplate"))
                    listTemplate.add(detectTemplateSymbolTable.getRows().get(i));
            }
        }
        if (listTemplate.isEmpty()) {
            error.getErrors().add("template not found in Component Declaration");
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

    private boolean RepeatedDeclarationFunction(DeclarationFunctionSymbolTable declarationFunctionSymbolTable) {
        if (declarationFunctionSymbolTable == null) {
            error.getErrors().add("No DeclarationFunctionSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> listParameter = new ArrayList<>();
        List<Row> listFunctionName = new ArrayList<>();
        List<Row> listReturnType = new ArrayList<>();

        for (int i = 0; i < declarationFunctionSymbolTable.getRows().size(); i++) {
            if (declarationFunctionSymbolTable.getRows().get(i) != null) {
                if (declarationFunctionSymbolTable.getRows().get(i).getType().contains("StringReturnValue"))
                    listReturnType.add(declarationFunctionSymbolTable.getRows().get(i));
                if (declarationFunctionSymbolTable.getRows().get(i).getType().contains("StringFunctionName"))
                    listFunctionName.add(declarationFunctionSymbolTable.getRows().get(i));
                if (declarationFunctionSymbolTable.getRows().get(i).getType().contains("StringParameter"))
                    listParameter.add(declarationFunctionSymbolTable.getRows().get(i));
            }
        }
        for (int j = 0; j < listFunctionName.size(); j++) {
            for (int i = j + 1; i < listFunctionName.size(); i++) {
//                if (Objects.equals(listFunctionName.get(i).getValue(), listFunctionName.get(j).getValue()) && Objects.equals(listParameter.get(i).getValue(), listParameter.get(j).getValue()) && Objects.equals(listReturnType.get(i).getValue(), listReturnType.get(j).getValue())) {
//                    error.getErrors().add("At Line " + listFunctionName.get(i).getLine() + " in position " + listFunctionName.get(i).getPosition() + " Function was Decelerated already ");
//                    checkError = false;
//                }
            }
        }
        return checkError;
    }

    private boolean RepeatedDeclarationObjectInInterface(DeclarationObjectInInterfaceSymbolTable declarationObjectInInterfaceSymbolTable) {
        if (declarationObjectInInterfaceSymbolTable == null) {
            error.getErrors().add("No DeclarationObjectInInterfaceSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> listObjectName = new ArrayList<>();
        List<Row> listCheck = new ArrayList<>();

        for (int i = 0; i < declarationObjectInInterfaceSymbolTable.getRows().size(); i++) {
            if (declarationObjectInInterfaceSymbolTable.getRows().get(i) != null) {
                if (declarationObjectInInterfaceSymbolTable.getRows().get(i).getType().contains("StringInterfaceDecl"))
                    listObjectName.add(declarationObjectInInterfaceSymbolTable.getRows().get(i));
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

    private boolean IncorrectAttributeCss(AttributeCssSymbolTable attributeCssSymbolTable) {
        if (attributeCssSymbolTable == null) {
            error.getErrors().add("No AttributeCssSymbolTable tables provided");
            return false;
        }
        List<String> CssAttr = Arrays.asList(
                "display", "width", "gap", "border-right", "list-style-type", "padding", "align-items", "border-bottom",
                "cursor", "height", "object-fit", "margin-bottom", "margin", "min-height", "padding-right", "background",
                "border-radius", "flex", "flex-direction", "border", "max-width", "font-size", "box-shadow", "text-align",
                "margin-top", "color", "justify-content", "direction", "overflow", "font-weight", "unicode-bidi", "outline",
                "resize", "padding-left", "padding-right", "border-color");

        boolean checkError = true;
        List<Row> listAttr = new ArrayList<>();
        for (int i = 0; i < attributeCssSymbolTable.getRows().size(); i++) {
            if (attributeCssSymbolTable.getRows().get(i) != null) {
                if (attributeCssSymbolTable.getRows().get(i).getType().contains("StringAttCss"))
                    listAttr.add(attributeCssSymbolTable.getRows().get(i));
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

    private boolean ClassDeclarationAndStandalone(ClassDeclarationAndStandaloneSymbolTable classDeclarationAndStandaloneSymbolTable) {
        if (classDeclarationAndStandaloneSymbolTable == null) {
            error.getErrors().add("No ClassDeclarationAndStandaloneSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        List<Row> standlist = new ArrayList<>();
        Row classlist = new Row();
        for (int i = 0; i < classDeclarationAndStandaloneSymbolTable.getRows().size(); i++) {
            if (classDeclarationAndStandaloneSymbolTable.getRows().get(i) != null) {
                if (classDeclarationAndStandaloneSymbolTable.getRows().get(i).getType().contains("StringStandalone"))
                    standlist.add(classDeclarationAndStandaloneSymbolTable.getRows().get(i));
                if (classDeclarationAndStandaloneSymbolTable.getRows().get(i).getType().contains("StringClassDeclaration"))
                    classlist = classDeclarationAndStandaloneSymbolTable.getRows().get(i);
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

    private boolean Tags(TagsSymbolTable tagsSymbolTable) {
        if (tagsSymbolTable == null) {
            error.getErrors().add("No tagsSymbolTable tables provided");
            return false;
        }
        boolean checkError = true;
        for (int i = 0; i < tagsSymbolTable.getRows().size(); i++) {
            if (tagsSymbolTable.getRows().get(i) != null) {
                if (tagsSymbolTable.getRows().get(i).getType().contains("TagOpen")) {
                    error.getErrors().add("At Line " + tagsSymbolTable.getRows().get(i).getLine() + " in position " + tagsSymbolTable.getRows().get(i).getPosition() + " Tags  Error the " + tagsSymbolTable.getRows().get(i).getValue() + " tag not close in the same tage");
                    checkError = false;
                } else {
                    error.getErrors().add(" Tags  Error the " + tagsSymbolTable.getRows().get(i).getValue() + " tag not open in the same tage");
                    checkError = false;
                }
            }
        }
        return checkError;
    }

    public void printErrors() {
        error.print();
    }
}
