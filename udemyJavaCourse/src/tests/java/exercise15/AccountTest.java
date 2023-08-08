package exercise15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {
    @Test
    public void testDeposit() {
        Account account = new Account(8021, "Bob Brown", 500.00, 300.00);
        account.deposit(100.00);
        assertEquals(600.00, account.balance, 0.005);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account(8021, "Bob Brown", 500.00, 300.00);
        account.withdraw(100.00);
        assertEquals(400.00, account.balance, 0.005);
    }

    @Test
    public void testWithdrawOutOfLimit(){
        Account account = new Account(8021, "Bob Brown", 500.00, 300.00);
        try {
            account.withdraw(800.00);
            fail("Should have thrown an exception!!!");
        }catch (WithdrawException e){
            assertEquals("The amount exceeds withdraw limit", e.getMessage());
            assertEquals(500.00, account.balance, 0.005);
        }
    }

    @Test
    public void testWithdrawOutOfBalance(){
        Account account = new Account(8021, "Bob Brown", 200.00, 300.00);
        try {
            account.withdraw(250.00);
            fail("Should have thrown an exception!!!");
        }catch (WithdrawException e){
            assertEquals("Not enough balance", e.getMessage());
            assertEquals(200.00, account.balance, 0.005);
        }
    }

}
