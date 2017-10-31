import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CurrencyUnitTest {

    @Test
    public void shouldEqualI() {
        CurrencyUnit unit = new CurrencyUnit();
        unit.parse("glob is I");
        assertEquals(new Numeral("I"), unit.getValue());
    }

    @Test
    public void shouldHaveNameGlob() {
        CurrencyUnit unit = new CurrencyUnit();
        unit.parse("glob is I");
        assertEquals("glob", unit.getName());
    }

    @Test
    public void shouldEqualV() {
        CurrencyUnit unit = new CurrencyUnit();
        unit.parse("prok is V");
        assertEquals(new Numeral("V"), unit.getValue());
    }

    @Test
    public void shouldHaveNameProk() {
        CurrencyUnit unit = new CurrencyUnit();
        unit.parse("prok is V");
        assertEquals("prok", unit.getName());
    }

    @Test
    public void shouldbeStatement() {
        CurrencyUnit unit = new CurrencyUnit();
        assertTrue( unit.isUnitStatement("prok is V"));
    }

    @Test
    public void shouldntbeQuestion() {
        CurrencyUnit unit = new CurrencyUnit();
        assertFalse( unit.isUnitStatement("prok is V?"));
    }
}
