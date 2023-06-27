package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionSevenTest {
    @Test
    public void testCartesianPlane(){
        assertEquals("Q4", QuestionSeven.cartesianPlane(4.5,-2.2));
        assertEquals("Q1", QuestionSeven.cartesianPlane(0.1,0.1));
        assertEquals("ORIGIN", QuestionSeven.cartesianPlane(0.0,0.0));
    }
}
