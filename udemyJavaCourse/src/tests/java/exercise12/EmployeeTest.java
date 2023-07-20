package exercise12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testEmployeePayment() {
        Employee employee1 = new Employee("Alex", 50, 20.00);
        Employee employee2 = new Employee("Maria", 60, 20.00);

        assertEquals(1000.00, employee1.payment(), 0.005);
        assertEquals(1200.00, employee2.payment(), 0.005);
    }
    @Test
    public void testOutsourcedEmployeePayment() {
        Employee employee = new OutsourcedEmployee("Bob", 100, 15.00, 200.00);

        assertEquals(1720.00, employee.payment(), 0.005);
    }
}
