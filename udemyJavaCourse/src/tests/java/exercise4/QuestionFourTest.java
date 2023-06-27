package exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFourTest {
    @Test
    public void testImpossibleDivision() {
        double x = 3.0;
        double y = -2.0;
        double x1 = -8.0;
        double y1 = 0.0;

        assertEquals(-1.5, QuestionFour.division(x,y),0.05);
        assertEquals(Double.NEGATIVE_INFINITY, QuestionFour.division(x1,y1),0.05);
    }
}
