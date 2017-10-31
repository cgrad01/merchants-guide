import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Runner {

    public Runner() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("./input.txt"));
        ArrayList<CurrencyUnit> currencies = new ArrayList<>();
        try {
            String line = br.readLine();

            while (line != null) {
                CurrencyUnit unit = new CurrencyUnit(line);
                currencies.add(unit);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
    }
}
