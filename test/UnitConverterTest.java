import org.junit.Test;

import static org.junit.Assert.*;

public class UnitConverterTest {

    @Test
    public void shouldNotBeQuestion() {
        UnitConverter converter = new UnitConverter();
        assertFalse(converter.isQuestion("glob is I"));
    }

    @Test
    public void shouldBeQuestion() {
        UnitConverter converter = new UnitConverter();
        assertTrue(converter.isQuestion("glob is I?"));
    }


}