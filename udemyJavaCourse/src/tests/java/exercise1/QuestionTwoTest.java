package exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class QuestionTwoTest {
    @Test
    public void testCircleArea(){
        double radius = 2.00;

        assertEquals(12.56636, QuestionTwo.circleArea(radius), 0.005);
    }
}
