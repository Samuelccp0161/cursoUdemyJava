package exercise13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    Date date;

    public UsedProduct(String name, double price, Date date) {
        super(name, price);
        this.date = date;
    }

    private String formatDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }
    @Override
    public String priceTag(){
        return String.format("%s (used) $ %.2f (Manufactured date: %s)", name , price, formatDate());
    }
}
