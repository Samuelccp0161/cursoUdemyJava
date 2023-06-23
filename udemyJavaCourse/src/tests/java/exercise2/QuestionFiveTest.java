package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionFiveTest {
    @Test
    public void testAmountOfSnack(){
        assertEquals(10, QuestionFive.lunchValue(3, 2), 0.005);
        assertEquals(13.50, QuestionFive.lunchValue(2, 3), 0.005);
    }
}
