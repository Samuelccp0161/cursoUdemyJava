package exercise11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    Date moment;
    OrderStatus status;
    List<OrderItem> orderItems = new ArrayList<>();
    final Client client;
    public Order(Date moment, OrderStatus status, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }
    public void addItem(OrderItem item){
        orderItems.add(item);
    }
    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }
    public double total(){
        double total = 0.0;
        for (int i = 0; i < orderItems.size(); i++) {
            total += orderItems.get(i).product.price * orderItems.get(i).quantity;
        }
        return total;
    }
    public String dateFormatted() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return format.format(moment);
    }
    public String summary(){
        String moment = "Order moment: " + dateFormatted();
        String status = "Order status: " + this.status.toString();
        String client = "Client: " + this.client.toString();
        String itens = "Order items:";
        for (int i = 0; i < orderItems.size(); i++){
            itens += String.format("%n" + orderItems.get(i).toString());
        }
        String total = String.format("Total price: $%.2f", total());

        return String.join(String.format("%n"),
                moment,
                status,
                client,
                itens,
                total
        );
    }
}
