package exercicio7;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PairNumbersTest {
    @Test
    public void PairTest() {
        int[] pair = {4, 2, 14, 20};
        assertTrue(PairNumbers.pair(pair));
    }
}
