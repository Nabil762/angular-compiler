import AST.Program;
import AST.StandardTag;
import AST.Style;
import AST.Template;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import rules.angularLexer;
import rules.angularParser;
import visitor.AngularVisitor;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/ErrorHandling/Errors.txt";
        try {
            if (!Files.exists(Paths.get(filePath))) {
                Files.createFile(Paths.get(filePath));
            } else {
                Files.write(Paths.get(filePath), new byte[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        String[] source = {"tests/AngularTestShowEnd.txt", "tests/AngularTestAdd.txt"};
//        String[] source = {"tests/AngularTestShowEndCar.txt", "tests/AngularTestAddCar.txt"};
//        String[] source = {"tests/AngularTestShowEndCaronly.txt", "tests/AngularTestShowEndCardetails.txt", "tests/AngularTestAddCar2.txt"};
        String[] source = {"tests/AngularTestShowEndCaronly.txt", "tests/AngularTestShowEndCardetails.txt", "tests/AngularTestAddCar2.txt", "tests/AngularTestUpdateCar.txt"};
//        String[] source = {"tests/AngularTest.txt"};
//        String[] source = {"tests/AngularTest2.txt"};
//        String[] source = {"tests/AngularTestErrors.txt"};
//        String[] source = {"tests/t.txt"};
//        String[] source = {"tests/ahmad.txt"};
        for (int i = 0; i < source.length; i++) {
            CharStream st = fromFileName(source[i]);
            angularLexer lexer = new angularLexer(st);
            CommonTokenStream token = new CommonTokenStream(lexer);
            angularParser parser = new angularParser(token);
            ParseTree tree = parser.program();
            String fileName = source[i].substring(6, source[i].indexOf(".txt"));
            try {
                Files.write(Paths.get(filePath), (fileName + "\n").getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Program doc = (Program) new AngularVisitor().visit(tree);
            astStorage(doc.toString(), fileName);
            //        System.out.println(doc);
            String fileNameReplace = fileName;
            if (source.length == 2) {
                fileNameReplace = source[1 - i].substring(6, source[1 - i].indexOf(".txt"));
            } else if (source.length == 3) {
                fileNameReplace = source[2 - i - i % 2].substring(6, source[2 - i - i % 2].indexOf(".txt"));

            } else if (source.length == 4) {
                if (i == 0) {
                    fileNameReplace = source[2].substring(6, source[2].indexOf(".txt"));
                } else {
                    fileNameReplace = source[0].substring(6, source[0].indexOf(".txt"));
                }
            }

            StringBuilder content = new StringBuilder();
            try (Scanner scanner = new Scanner(new File("src/ErrorHandling/Errors.txt"))) {
                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine()).append("\n");
                }
            }
            String checkError = fileName + "\nNo Error in this test\n";
            if (content.substring(content.toString().indexOf(fileName)).equals(checkError)) {
                generateJsFile(jsGetContent(doc, fileNameReplace), fileName);
                generateHtmlFile(fileName, fileNameReplace);
                generateCssFile(doc, fileName);
                System.out.println("\u001B[32m" + "The Files " + fileName + ".(js,css,html) Generated Successfully! and no Errors in code" + "\u001B[0m");
            } else {
                Files.deleteIfExists(Paths.get("src/generatedCode/" + fileName + ".js"));
                Files.deleteIfExists(Paths.get("src/generatedCode/" + fileName + ".html"));
                Files.deleteIfExists(Paths.get("src/generatedCode/" + fileName + ".css"));
                System.err.println("The Files " + fileName + ".(js,css,html) Doesn't Generated Because their are Errors");
            }
        }
    }

    public static void generateJsFile(String js, String name) {
        String filePath = "src/generatedCode/" + name + ".js";
        if (js == null) {
            System.err.print("The Js file  " + name + " Doesn't Stored");
            js = "";
        }
        StringBuilder stringBuilder = new StringBuilder(js);
        try {
            if (!Files.exists(Paths.get(filePath))) {
                Files.createFile(Paths.get(filePath));
            } else {
                Files.write(Paths.get(filePath), new byte[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.write(Paths.get(filePath), stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void generateCssFile(Program program, String fileName) {
        for (int i = 0; i < program.getStatementList().size(); i++) {
            if (program.getStatementList().get(i).getComponentDeclaration() != null) {
                for (int j = 0; j < program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().size(); j++) {
                    if (program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j) instanceof Style) {
                        String filePath = "src/generatedCode/" + fileName + ".css";
                        try {
                            if (!Files.exists(Paths.get(filePath))) {
                                Files.createFile(Paths.get(filePath));
                            } else {
                                Files.write(Paths.get(filePath), new byte[0]);
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            Files.write(Paths.get(filePath), program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j).generatedCode().getBytes(StandardCharsets.UTF_8));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    public static void generateHtmlFile(String fileName, String fileNameOther) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n" + "<html lang=\"en\">\n" + "<head>\n" + "    <meta charset=\"UTF-8\"/>\n" + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" + "    <title>Angular compiler</title>\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n" + "    <link rel=\"stylesheet\" href=\"").append(fileName).append(".css\"/>\n").append("</head>\n").append("<body>\n").append("<div class=\"fixed top-4 right-4\">\n").append("    <button id=\"goToOtherPage\" class=\"bg-blue-500 hover:bg-green-600 text-white text-sm py-1 px-3 rounded shadow\">\n");
        stringBuilder.append("    Go to ").append(fileNameOther).append("Page \n");
        stringBuilder.append("    </button>\n").append("</div>\n").append("<script src=\"").append(fileName).append(".js\" defer></script>\n").append("<script>\n").append("document.addEventListener('DOMContentLoaded', function() {\n").append("const goToOtherPageBtn = document.getElementById('goToOtherPage');\n").append("goToOtherPageBtn.addEventListener('click', function() {\n").append("        window.location.href = '").append(fileNameOther).append(".html';\n").append("    });\n").append("});\n").append("</script>\n").append("</body>\n").append("<div id=\"app\"></div>\n").append("</html>");
        String filePath = "src/generatedCode/" + fileName + ".html";
        try {
            if (!Files.exists(Paths.get(filePath))) {
                Files.createFile(Paths.get(filePath));
            } else {
                Files.write(Paths.get(filePath), new byte[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.write(Paths.get(filePath), stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void astStorage(String ast, String name) {
        String filePath = "src/AstStorage/Ast" + name + ".txt";
        if (ast == null) {
            System.err.print("The Ast " + name + " Doesn't Stored");
            ast = "No Ast";
        }
        StringBuilder stringBuilder = new StringBuilder(ast);
        try {
            if (!Files.exists(Paths.get(filePath))) {
                Files.createFile(Paths.get(filePath));
            } else {
                Files.write(Paths.get(filePath), new byte[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.write(Paths.get(filePath), stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String jsGetContent(Program program, String fileNameReplace) {
        String js = program.generatedCode();
        String fileInput = getFileInput(program);
        if (!Objects.equals(fileInput, "")) {
            js = js.replace(fileInput + "Input.value.trim();", fileInput + "Input.files?.[0];");
            StringBuilder sb = new StringBuilder(js);
            String toInsert = "const reader = new FileReader();\n" + "reader.onload = (e) => { \n";
            sb.insert(sb.indexOf("const new"), toInsert);
            if (sb.indexOf(".html';\n}\n}\n}") != -1)
                sb.insert(sb.indexOf(".html';\n}") + 9, "}\nreader.readAsDataURL(" + fileInput + ");\n");
            else
                sb.insert(sb.indexOf(".html';\n}") + 9, "\nreader.readAsDataURL(" + fileInput + ");\n}\n");

            js = sb.toString();
            js = js.replace(fileInput + ",", fileInput + ": e.target.result,");
            js = js.replace("reader.readAsDataURL(" + fileInput + ");\n" + "\n" + "}", "reader.readAsDataURL(" + fileInput + ");\n" + "\n}");
        }
        return js;
    }

    public static String getFileInput(Program program) {
        for (int i = 0; i < program.getStatementList().size(); i++) {
            if (program.getStatementList().get(i).getComponentDeclaration() != null) {
                for (int j = 0; j < program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().size(); j++) {
                    if (program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j) instanceof Template) {
                        if (((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0) != null) {
                            if (((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag() != null && ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag() instanceof StandardTag) {
                                if (((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag() instanceof StandardTag && Objects.equals(((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getTag_name(), "form")) {
                                    for (int k = 0; k < ((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().size(); k++) {
                                        if (((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().get(k).getTag() instanceof StandardTag && Objects.equals(((StandardTag) ((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().get(k).getTag()).getTag_name(), "label")) {
                                            for (int l = 0; l < ((StandardTag) ((StandardTag) ((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().get(k).getTag()).getElements().get(1).getTag()).getAttributes().size(); l++) {
                                                if (Objects.equals(((StandardTag) ((StandardTag) ((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().get(k).getTag()).getElements().get(1).getTag()).getAttributes().get(l).getHtmlName(), "type") && Objects.equals(((StandardTag) ((StandardTag) ((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().get(k).getTag()).getElements().get(1).getTag()).getAttributes().get(l).getText(), "\"file\"")) {
                                                    return (((StandardTag) ((StandardTag) ((StandardTag) ((Template) program.getStatementList().get(i).getComponentDeclaration().getComponentConfig().getPropertyAssignmentList().get(j)).getElement().get(0).getTag()).getElements().get(0).getTag()).getElements().get(k).getTag()).getElements().get(0)).getHtmlName();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}
