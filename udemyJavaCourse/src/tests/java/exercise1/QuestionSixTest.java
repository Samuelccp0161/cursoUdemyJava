package exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionSixTest {
    @Test
    public void testAreasGeometricFigures(){
        double a = 3.0;
        double b = 4.0;
        double c = 5.2;

        assertEquals(7.80, QuestionSix.triangleArea(a, c), 0.002);
        assertEquals(84.94859360000001, QuestionSix.circleArea(c), 0.002);
        assertEquals(18.20, QuestionSix.trapezeArea(a, b, c), 0.002);
        assertEquals(16.00, QuestionSix.squareArea(b), 0.002);
        assertEquals(12.00, QuestionSix.rectangularArea(a, b), 0.002);
    }
}
