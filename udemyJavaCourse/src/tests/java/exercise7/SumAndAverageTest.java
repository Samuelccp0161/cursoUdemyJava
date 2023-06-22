package exercise7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumAndAverageTest {
    @Test
    public void sumTest() {
        double[] numbers = {8, 4, 10, 14};
        assertEquals(36, SumAndAverage.sum(numbers), 0.005);
    }

    @Test
    public void averageTest() {
        double[] number = {8, 4, 10, 14};
        assertEquals(9, SumAndAverage.average(number),0.005);
    }
}
