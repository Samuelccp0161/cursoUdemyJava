package exercise5.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("", 0.0, 0.0);

        employee.name = scanner.nextLine();
        employee.grossSalary = scanner.nextDouble();
        employee.tax = scanner.nextDouble();
        double percentage = scanner.nextDouble();


        System.out.println(employee.nextSalary());
        employee.increaseSalary(percentage);
        System.out.println(employee.nextSalary());
        scanner.close();
    }
}
