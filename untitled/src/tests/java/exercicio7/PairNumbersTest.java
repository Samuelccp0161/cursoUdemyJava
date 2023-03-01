package exercicio7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PairNumbersTest {
    @Test
    public void PairTest() {
        int[] pair = {8, 2, 14, 20};
        assertTrue(PairNumbers.pair(pair));
    }
}
