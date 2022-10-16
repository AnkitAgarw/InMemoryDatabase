import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String args[]){
        Database db= new  Database("db_name");
        List<Column> columnList = new ArrayList<>();
        columnList.add(new IntColumn("id"));
        columnList.add(new StringColumn("name"));

        Table table = new Table("student",columnList);
        db.addTable(table);
        Map<String, Object> values =new HashMap<> ();
        values.put("id",1);
        values.put("name","a");
        Row  row= new Row(values);
        table.insert(row);
        System.out.println(db.toString());

    }
}
