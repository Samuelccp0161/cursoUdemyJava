package exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionOneTest {
    @Test
    public void testIsOdd(){
        assertTrue(QuestionOne.isOdd(7));
        assertFalse(QuestionOne.isOdd(8));
    }
}
