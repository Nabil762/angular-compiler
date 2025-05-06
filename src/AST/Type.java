package AST;

import java.util.ArrayList;
import java.util.List;

public class Type {
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
}
