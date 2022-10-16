import java.util.HashMap;
import java.util.List;

public class Database {
    String name;
    HashMap<String,Table> tables;


    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", tables=" + tables +
                '}';
    }

    public Database(String name) {
        this.tables = new HashMap<>();
        this.name=name;
    }
    public Table addTable(Table table){
        return tables.put(table.getName(),table);

    }
}
