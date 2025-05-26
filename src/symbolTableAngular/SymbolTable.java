package symbolTableAngular;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void setRow(Row row) {
        rows.add(row);
    }

    public void print() {
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i) != null) {
                System.out.println(rows.get(i).getType() + "\t\t\t\t " + rows.get(i).getValue());
            }
        }
    }
}
