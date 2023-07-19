package exercise11;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderItemTest {
    @Test
    public void testSubTotal() {
        Product product1 = new Product("Doritos", 5.00);
        OrderItem orderItem = new OrderItem(3, product1);
        assertEquals(15.00, orderItem.subTotal(), 0.005);
    }
}