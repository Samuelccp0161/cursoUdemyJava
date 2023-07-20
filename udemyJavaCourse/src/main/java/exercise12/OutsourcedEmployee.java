package exercise12;

public class OutsourcedEmployee extends Employee{
    double charge;
    public OutsourcedEmployee(){
        super();

    }
    public OutsourcedEmployee(String name, int hours, double valuePerHour, double charge) {
        super(name, hours, valuePerHour);
        this.charge = charge;
    }
    @Override
    public double payment(){
        return hours * valuePerHour + charge + (charge * 0.1);
    }

}
