import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyUnitTest {

    @Test
    public void shouldEqualI() {
        assertEquals(new Numeral("I"), new CurrencyUnit("glob is I").getValue());
    }

    @Test
    public void shouldHaveNameGlob() {
        assertEquals("glob", new CurrencyUnit("glob is I").getName());
    }

    @Test
    public void shouldEqualV() {
        assertEquals(new Numeral("V"), new CurrencyUnit("prok is V").getValue());
    }

    @Test
    public void shouldHaveNameProk() {
        assertEquals("prok", new CurrencyUnit("prok is V").getName());
    }
}
