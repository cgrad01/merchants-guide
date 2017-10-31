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

    @Test
    public void XVShouldHaveValue15NoAdd() {
        assertEquals(new Integer(15), new Numeral("XV").getValue());
    }

    @Test
    public void IVShouldHaveValue4NoAdd() {
        assertEquals(new Integer(4), new Numeral("IV").getValue());
    }

    @Test
    public void XIVShouldHaveValue14() {
        assertEquals(new Integer(14), new Numeral("XIV").getValue());
    }
}
