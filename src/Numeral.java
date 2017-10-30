import java.util.HashMap;

public class Numeral {

    String name;
    Integer value;

    private static final HashMap<String, Integer> NUMERAL_VALUES = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public Numeral(String name) {
        this.name = name;
        value = NUMERAL_VALUES.get(this.name);
    }

    public Integer getValue() {
        return value;
    }
}