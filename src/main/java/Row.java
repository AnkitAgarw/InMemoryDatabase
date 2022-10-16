import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Row {
    public Row(Map<String, Object> values) {
        this.values = values;
    }

    Map<String, Object> values;

    @Override
    public String toString() {
        return "Row{" +
                "values=" + values +
                '}';
    }
}
