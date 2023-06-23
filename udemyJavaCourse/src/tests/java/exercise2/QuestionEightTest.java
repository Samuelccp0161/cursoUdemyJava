package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuestionEightTest {
    @Test
    public void testIncomeTax(){
        assertEquals("80.36", QuestionEight.incomeTax(3002.00));
        assertEquals("Tax exempt", QuestionEight.incomeTax(1701.12));
        assertEquals("355.6", QuestionEight.incomeTax(4520.00));
    }
}
