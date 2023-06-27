package exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionThreeTest {
    @Test
    public void testWeightedAverage() {
        double x = 6.5;
        double y = 4.3;
        double z = 6.2;

        assertEquals(5.7, QuestionThree.weightedAverage(x,y,z), 0.05);
    }
}
