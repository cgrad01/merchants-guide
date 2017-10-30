import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralTest {

    @Test
    public void IShouldHaveValue1() {
        assertEquals(new Integer(1), new Numeral("I").getValue());
    }

    @Test
    public void VShouldHaveValue5() {
        assertEquals(new Integer(5), new Numeral("V").getValue());
    }

    
}
