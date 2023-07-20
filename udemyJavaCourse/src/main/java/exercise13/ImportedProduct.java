package exercise13;

public class ImportedProduct extends Product{
    double customsFee;
    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
        return String.format("%s $ %.2f (Customs fee: $ %.2f)" , name , price + customsFee, customsFee);
    }
    public double totalPrice(){
        return price + customsFee;
    }

}
