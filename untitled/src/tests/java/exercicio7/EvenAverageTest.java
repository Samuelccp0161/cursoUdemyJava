package exercicio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenAverageTest {
    @Test
    public void testAverageEven() {
        int[] numbers = {8, 2, 11, 14, 13, 20};
        assertEquals(11, EvenAverage.average(numbers));
    }
    @Test
    public void testIsEven() {
        int[] numbers = {7, 9, 11};
        assertFalse(EvenAverage.isEven(numbers));

    }
}