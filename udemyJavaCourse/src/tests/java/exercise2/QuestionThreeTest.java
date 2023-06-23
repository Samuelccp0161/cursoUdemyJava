package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionThreeTest {
    @Test
    public void testMultiples(){
        int numberOne = 2;
        int numberTwo = 3;
        int numberThree = 24;

        assertTrue(QuestionThree.multiples(numberOne, numberThree));
        assertFalse(QuestionThree.multiples(numberOne, numberTwo));
        assertTrue(QuestionThree.multiples(numberThree, numberTwo));
    }
}
