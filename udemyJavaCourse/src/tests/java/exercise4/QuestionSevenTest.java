package exercise4;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionSevenTest {
    @Test
    public void testListSquareValue() {
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;
        int numberFive = 5;

        assertEquals(List.of(1, 1, 1), QuestionSeven.squareAndCube(numberOne));
        assertEquals(List.of(2, 4, 8), QuestionSeven.squareAndCube(numberTwo));
        assertEquals(List.of(3, 9, 27), QuestionSeven.squareAndCube(numberThree));
        assertEquals(List.of(4, 16, 64), QuestionSeven.squareAndCube(numberFour));
        assertEquals(List.of(5, 25, 125), QuestionSeven.squareAndCube(numberFive));
    }
}
