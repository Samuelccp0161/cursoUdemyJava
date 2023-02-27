package exercicio6;

import exercicio6.BankTransference;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class questaoUmTest {
    @Test
    public void depositTest() {
        BankTransference bankTransference = new BankTransference(0);
        bankTransference.deposit(200.00);
        assertEquals(200.00, bankTransference.value, 0.005);

    }

    @Test
    public void withdrawTest() {
        BankTransference bankTransference = new BankTransference(0);
        bankTransference.deposit(200.00);
        bankTransference.withdraw(198.00);
        assertEquals(-3, bankTransference.value, 0.005);
    }
}
