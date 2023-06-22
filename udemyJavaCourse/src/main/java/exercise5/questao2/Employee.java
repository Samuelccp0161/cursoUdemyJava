package exercise5.questao2;

public class Employee {
    String name;
    double grossSalary;
    double tax;
    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    public double nextSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary = (grossSalary + (grossSalary * percentage) / 100);
    }
}
