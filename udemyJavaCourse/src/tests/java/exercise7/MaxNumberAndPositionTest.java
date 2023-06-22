package exercise7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxNumberAndPositionTest {
    @Test
    public void maxNumberAndPositionTest() {
        double[] value = {8.0, 4.0, 10.0, 14.0, 13.0, 7.0};
        assertEquals(3, MaxNumberAndPosition.maxNumber(value),0.005);
    }
}
