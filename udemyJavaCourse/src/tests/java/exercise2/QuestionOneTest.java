package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionOneTest {
    @Test
    public void testPositiveOrNegative(){
        int numberNegative = -12;
        int numberPositive = 12;

        assertEquals(-12, QuestionOne.positiveOrNegative(numberNegative));
        assertEquals(12, QuestionOne.positiveOrNegative(numberPositive));
    }
}
