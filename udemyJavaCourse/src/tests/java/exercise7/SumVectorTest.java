package exercise7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumVectorTest {
    @Test
    public void sumArrayTest() {
        int[] vectorA = {8, 2, 11, 14, 13, 20};
        int[] vectorB = {5, 10, 3, 1, 10, 7};
        int[] vectorC = {13, 12, 14, 15, 23, 27};

        assertEquals(Arrays.toString(vectorC), Arrays.toString(SumVector.sumOfVectors(vectorA,vectorB)));
    }
}
