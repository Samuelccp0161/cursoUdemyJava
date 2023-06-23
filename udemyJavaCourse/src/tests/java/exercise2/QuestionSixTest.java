package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionSixTest {
    @Test
    public void testRage(){
        assertEquals("(25,50]", QuestionSix.ranges(25.01));
        assertEquals("([0,25]", QuestionSix.ranges(25.00));
        assertEquals("(75,100])", QuestionSix.ranges(100.00));
        assertEquals("value is out of range", QuestionSix.ranges(-25.02));
    }
}
