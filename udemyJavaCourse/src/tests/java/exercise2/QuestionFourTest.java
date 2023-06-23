package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionFourTest {
    @Test
    public void testDifferenceTime(){
        assertEquals(10, QuestionFour.differenceTime(16,2));
        assertEquals(24, QuestionFour.differenceTime(0,0));
        assertEquals(14, QuestionFour.differenceTime(2, 16));
    }
}
