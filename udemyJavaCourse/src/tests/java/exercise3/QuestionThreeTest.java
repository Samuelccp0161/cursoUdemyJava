package exercise3;

import org.junit.Test;

import static exercise3.QuestionThree.fuelBill;
import static org.junit.Assert.assertEquals;

public class QuestionThreeTest {
    @Test
    public void testFuelBill() {
        assertEquals("", fuelBill(8));
        assertEquals("alcohol:", fuelBill(1));
        assertEquals("", fuelBill(7));
        assertEquals("gasoline:", fuelBill(2));
        assertEquals("thank you!!", fuelBill(4));
        assertEquals("diesel:", fuelBill(3));
    }
}
