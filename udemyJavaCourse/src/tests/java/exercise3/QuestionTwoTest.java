package exercise3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {
    @Test
    public void testCartesianSystem(){
        Assert.assertEquals("first", QuestionTwo.cartesianSystem(2, 2));
        Assert.assertEquals("fourth", QuestionTwo.cartesianSystem(3, -2));
        Assert.assertEquals("third", QuestionTwo.cartesianSystem(-8, -1));
        Assert.assertEquals("second", QuestionTwo.cartesianSystem(-7, 1));
        Assert.assertEquals("", QuestionTwo.cartesianSystem(0, 2));

    }
}
