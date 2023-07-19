package exercise11;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OrderTest {
    @Test
    public void testOrder() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("alex", "alex@gmail.com", simpleDateFormat.parse("15/03/1985"));

        Order order = new Order(simpleDateFormat.parse("17/07/2023 08:48:55"), OrderStatus.PROCESSING, client);
        Product product = new Product("Doritos", 5.00);
        OrderItem orderItem1 = new OrderItem(2, product);

        order.addItem(orderItem1);

        assertEquals(orderItem1, order.orderItems.get(0));
    }

    @Test
    public void testMultipleOrder() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("alex", "alex@gmail.com", simpleDateFormat.parse("15/03/1985"));


        Order order = new Order(simpleDateFormat.parse("17/07/2023"), OrderStatus.PROCESSING, client);

        Product product1 = new Product("Doritos", 5.00);
        Product product2 = new Product("Macarrao", 15.00);
        Product product3 = new Product("Feijao", 25.00);

        OrderItem orderItem1 = new OrderItem(1, product1);
        OrderItem orderItem2 = new OrderItem(2, product2);
        OrderItem orderItem3 = new OrderItem(3, product3);

        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);


        assertEquals(3, order.orderItems.size());
    }

    @Test
    public void testRemoveItemOrder() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("alex", "alex@gmail.com", simpleDateFormat.parse("15/03/1985"));

        Order order = new Order(simpleDateFormat.parse("17/07/2023 08:48:55"), OrderStatus.PROCESSING, client);

        Product product1 = new Product("Doritos", 5.00);
        Product product2 = new Product("Macarrao", 15.00);
        Product product3 = new Product("Feijao", 25.00);

        OrderItem orderItem1 = new OrderItem(1, product1);
        OrderItem orderItem2 = new OrderItem(2, product2);
        OrderItem orderItem3 = new OrderItem(3, product3);

        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);

        order.removeItem(orderItem2);

        assertEquals(2, order.orderItems.size());
    }

    @Test
    public void testTotalValueItem() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("alex", "alex@gmail.com", simpleDateFormat.parse("15/03/1985"));

        Order order = new Order(simpleDateFormat.parse("17/07/2023 08:48:55"), OrderStatus.PROCESSING, client);

        Product product1 = new Product("Doritos", 5.00);
        Product product2 = new Product("Doritos", 15.00);
        OrderItem orderItem1 = new OrderItem(2, product1);
        OrderItem orderItem2 = new OrderItem(2, product2);

        order.addItem(orderItem1);
        order.addItem(orderItem2);


        assertEquals(40.00, order.total(), 0.005);
    }

    @Test
    public void testSummary() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Client client = new Client("alex", "alex@gmail.com", simpleDateFormat.parse("15/03/1985 08:48:55"));

        Order order = new Order(simpleDateFormat.parse("17/07/2023 08:48:55"), OrderStatus.PROCESSING, client);

        Product doritos = new Product("Doritos", 5.00);
        Product tv = new Product("TV", 1000.00);

        OrderItem orderTv = new OrderItem(1, tv);
        OrderItem orderDoritos = new OrderItem(2, doritos);

        order.addItem(orderTv);
        order.addItem(orderDoritos);

        String expectedSummary = String.join(String.format("%n"),
                "Order moment: 17/07/2023 08:48:55",
                "Order status: PROCESSING",
                "Client: alex (15/03/1985) - alex@gmail.com",
                "Order items:",
                "TV; $1000,00; Quantity: 1; Subtotal: $1000,00",
                "Doritos; $5,00; Quantity: 2; Subtotal: $10,00",
                "Total price: $1010,00"
        );

        assertEquals(expectedSummary, order.summary());
    }
}
