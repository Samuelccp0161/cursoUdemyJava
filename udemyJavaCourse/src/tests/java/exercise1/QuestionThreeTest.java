package exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionThreeTest {
    @Test
    public void testDifference() {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;

        assertEquals(-26, QuestionThree.difference(a,b,c,d));
    }
}
