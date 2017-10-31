import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

    public static HashMap<String, Numeral> UNIT_VALUES = new HashMap<String, Numeral>() {};

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("./input.txt"));
        Parsable[] parsers = {new CurrencyUnit()};
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
        System.out.println(Runner.UNIT_VALUES.toString());

    }
}
