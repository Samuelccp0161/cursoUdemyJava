package exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFiveTest {
    @Test
    public void testFactorial() {
        int x = 4;
        int y = 0;
        assertEquals(24, QuestionFive.factorial(x));
        assertEquals(1, QuestionFive.factorial(y));
    }
}
