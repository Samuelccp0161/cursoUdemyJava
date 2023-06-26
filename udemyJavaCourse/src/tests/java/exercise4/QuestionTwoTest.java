package exercise4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {
    @Test
    public void testInOrOut() {
        int[] numbers = {14, 123, 10, -25, 32};

        assertEquals(2, QuestionTwo.in(numbers));
        assertEquals(3, QuestionTwo.out(numbers));
    }
}
