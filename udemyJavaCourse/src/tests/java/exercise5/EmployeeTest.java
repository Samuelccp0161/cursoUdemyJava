package exercise5;

import exercise5.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {
    Employee employee = new Employee("Joao Silva", 6000.00, 1000.00);

    @Test
    public void testGetNextSalary() {
        assertEquals(5000.00, employee.nextSalary(), 0.005);
    }

    @Test
    public void testGetIncreaseSalary() {
        employee.increaseSalary(10); // ASSIM QUE SE USA UM VOID.
        assertEquals(5600.00, employee.nextSalary(), 0.005);
    }
}
