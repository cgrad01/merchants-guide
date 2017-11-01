import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumeralParserTest {

    @Test
    public void shouldEqualI() {
        NumeralParser unit = new NumeralParser();
        unit.parse("glob is I");
        assertEquals(new Numeral("I"), unit.getValue());
    }

    @Test
    public void shouldHaveNameGlob() {
        NumeralParser unit = new NumeralParser();
        unit.parse("glob is I");
        assertEquals("glob", unit.getName());
    }

    @Test
    public void shouldEqualV() {
        NumeralParser unit = new NumeralParser();
        unit.parse("prok is V");
        assertEquals(new Numeral("V"), unit.getValue());
    }

    @Test
    public void shouldHaveNameProk() {
        NumeralParser unit = new NumeralParser();
        unit.parse("prok is V");
        assertEquals("prok", unit.getName());
    }

    @Test
    public void shouldbeStatement() {
        NumeralParser unit = new NumeralParser();
        assertTrue( unit.isUnitStatement("prok is V"));
    }

    @Test
    public void shouldntbeQuestion() {
        NumeralParser unit = new NumeralParser();
        assertFalse( unit.isUnitStatement("prok is V?"));
    }
}
