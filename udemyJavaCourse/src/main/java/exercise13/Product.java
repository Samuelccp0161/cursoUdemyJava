package exercise13;

public class Product {
    String name;
    double price = 0.00;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String priceTag(){
        return String.format("%s $ %.2f" , name , price);

    }
}
