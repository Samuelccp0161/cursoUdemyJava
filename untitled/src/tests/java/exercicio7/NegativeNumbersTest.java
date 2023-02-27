package exercicio7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NegativeNumbersTest {
    @Test
    public void isNegative() {
        assertTrue(NegativeNumbers.isNegative(-8));
        assertFalse(NegativeNumbers.isNegative(8));
        assertFalse(NegativeNumbers.isNegative(0));
    }
}
