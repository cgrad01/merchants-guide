import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

    public static HashMap<String, Numeral> UNIT_VALUES = new HashMap<String, Numeral>() {};
    public static HashMap<String, Integer> RESOURCE_VALUES = new HashMap<String, Integer>() {};
    public static ArrayList<String> QUESTION_ANSWERS = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("./input.txt"));
        Parsable[] parsers = {new NumeralParser(), new ResourceValueParser(), new UnitConverter()};
        try {
            String line = br.readLine();

            while (line != null) {
                for (Parsable parser : parsers) {
                    parser.parse(line);
                }
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        for (String answer: QUESTION_ANSWERS) {
            System.out.println(answer);
        }
    }
}
