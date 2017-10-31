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

    @Test
    public void XVShouldHaveValue15() {
        assertEquals(new Integer(15), new Numeral("X").add(new Numeral("V")));
    }

    @Test
    public void IVShouldHaveValue4() {
        assertEquals(new Integer(4), new Numeral("I").add(new Numeral("V")));
    }
}
