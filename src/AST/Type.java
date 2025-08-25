package AST;

import java.util.ArrayList;
import java.util.List;

public class Type extends AstNode {
    List<SingleType> singleTypeList = new ArrayList<SingleType>();

    public List<SingleType> getSingleTypeList() {
        return singleTypeList;
    }

    public void setSingleTypeList(List<SingleType> singleTypeList) {
        this.singleTypeList = singleTypeList;
    }

    @Override
    public String toString() {
        return "\nType{ " +
                "\nsingleTypeList = " + singleTypeList +
                "\n}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < singleTypeList.size(); i++) {
            stringBuilder.append(singleTypeList.get(i).generatedCode());
        }
        return stringBuilder.toString();
    }
}
