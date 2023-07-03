package exercise5;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------EMPLOYEE AND SALARY-------------------");

        Employee employee = new Employee("", 0.0, 0.0);

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Which percentage to increase salary: ");
        double percentage = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.printf("Employee: " + employee.name + ", R$%.2f\n", employee.nextSalary());
        System.out.println("----------------------------------");

        employee.increaseSalary(percentage);
        System.out.printf("Updated data: " + employee.name + ", R$ %.2f\n", employee.nextSalary());

        System.out.println("----------------------------------");
        scanner.close();
    }
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
