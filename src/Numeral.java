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
        setValue();
    }

    private void setValue() {
        String[] digits = name.split("");
        if (name.length() == 1){
            value = NUMERAL_VALUES.get(name);
        } else if (name.length() == 2){
            value = new Numeral(digits[0]).add(new Numeral(digits[1]));
        } else if(name.length() == 3){
            Integer subtotal = new Numeral(digits[1] + digits[2]).value;
            value = new Numeral(digits[0]).value + subtotal;
        }
    }

    public Integer getValue() {
        return value;
    }

    public Integer add(Numeral next) {
        if (next.value > this.value){
            return next.value - this.value;
        } else {
            return this.value + next.value;
        }
    }
}