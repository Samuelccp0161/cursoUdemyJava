package exercise11;

public enum OrderStatus {
    PENDING_PAYMENT(0), PROCESSING(1), SHIPPED(2), DELIVERY(3);
    int valueOrder;

    OrderStatus(int valueOrder) {

    }
}
