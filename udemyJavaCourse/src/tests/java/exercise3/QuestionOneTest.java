package exercise3;

import org.junit.Test;

import static exercise3.QuestionOne.*;
import static org.junit.Assert.*;

public class QuestionOneTest {
    @Test
    public void testPassword(){
        assertFalse(passwordChecker("2200"));
        assertFalse(passwordChecker("1020"));
        assertFalse(passwordChecker("2022"));
        assertTrue(passwordChecker("2002"));
    }
}
