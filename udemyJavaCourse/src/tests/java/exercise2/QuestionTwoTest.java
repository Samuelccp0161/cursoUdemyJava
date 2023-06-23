package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {
    @Test
    public void testEven(){
        int even = 2;
        int odd = 3;

        assertEquals(2, QuestionTwo.even(even));
        assertEquals(3, QuestionTwo.even(odd));
    }
}
