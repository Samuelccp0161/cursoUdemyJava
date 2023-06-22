package exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFourTest {
    @Test
    public void testCalculationSalary(){
        int workedHours = 100;
        double amountReceivedPerHours = 5.50;

        assertEquals(550.00, QuestionFour.salary(workedHours, amountReceivedPerHours), 0.002);
    }
}
