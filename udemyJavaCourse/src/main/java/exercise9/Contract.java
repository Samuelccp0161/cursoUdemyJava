package exercise9;

import java.util.Date;

public class Contract {
    Date date;
    double valuePerHour;
    int hours;

    public Contract(Date date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    public double totalValue(){
        return valuePerHour * hours;
    }
}
