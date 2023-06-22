package exercise7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BelowAverageTest {
    @Test
    public void AverageTest() {
        double[] vector = {10.0, 15.5, 13.2, 9.8};
        assertEquals(12.125, BelowAverage.average(vector), 0.50);
    }

    @Test
    public void BelowAverageTest() {
        double[] vector = {10.0, 15.5, 13.2, 9.8};
        assertArrayEquals(new double[]{10.0, 9.8}, BelowAverage.belowAverage(vector), 0.005);
    }
}