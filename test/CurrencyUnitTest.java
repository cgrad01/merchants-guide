import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyUnitTest {

    @Test
    public void shouldEqualI() {
        assertEquals("I", new CurrencyUnit("glob is I").getValue());
    }

    @Test
    public void shouldHaveNameGlob() {
        assertEquals("glob", new CurrencyUnit("glob is I").getName());
    }
}
