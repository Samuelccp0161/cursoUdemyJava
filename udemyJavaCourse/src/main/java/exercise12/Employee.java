package exercise12;

public class Employee {
    String name;
    int hours;
    double valuePerHour;
    public Employee(){
    }
    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    public double payment(){
        return hours * valuePerHour;
    }
}
