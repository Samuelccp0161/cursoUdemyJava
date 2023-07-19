package exercise11;

public class OrderItem {
    int quantity;
    Product product;

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
    public double subTotal() {
        return quantity * product.price;
    }

    @Override
    public String toString(){
        return String.format("%s; $%.2f; Quantity: %d; Subtotal: $%.2f", product.name, product.price, quantity, subTotal());
    }
}
