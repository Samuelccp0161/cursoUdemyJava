package exercise6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTransferenceTest {
    @Test
    public void testDeposit() {
        BankTransference bankTransference = new BankTransference(0);
        bankTransference.deposit(200.00);
        assertEquals(200.00, bankTransference.value, 0.005);

    }

    @Test
    public void testWithdraw() {
        BankTransference bankTransference = new BankTransference(0);
        bankTransference.deposit(200.00);
        bankTransference.withdraw(198.00);
        assertEquals(-3, bankTransference.value, 0.005);
    }
}
