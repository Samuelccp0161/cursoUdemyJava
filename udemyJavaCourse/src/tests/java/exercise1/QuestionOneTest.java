package exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionOneTest {
    @Test
    public void testSum(){
        int x = 10;
        int y = 30;

        assertEquals(40, QuestionOne.sum(x,y));
    }
}
