package exercise4;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionSixTest {
    @Test
    public void testCalculateDivisors() {
        int x = 6;
        assertEquals(List.of(1,2,3,6), QuestionSix.calculateDivisors(x));
    }
}
