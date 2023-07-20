package exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------EMPLOYEE-------------------");

        List<Employee> employees = new ArrayList<>();

        System.out.print("Type the number of employees: ");
        int numberEmployees = scanner.nextInt();
        scanner.nextLine();

        System.out.println("----------------------------------");
        for (int i = 0; i < numberEmployees; i++){

            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n): ");
            String x = scanner.nextLine();
            System.out.println("----------------------------------");
            if (x.equals("n")){
                System.out.print("Type the name of employee: ");
                String name = scanner.nextLine();
                System.out.println("----------------------------------");

                System.out.print("Type quantity of hours worked: ");
                int hours = scanner.nextInt();

                System.out.println("----------------------------------");
                System.out.print("Type the value per hours: ");
                double valuePerHours = scanner.nextDouble();

                System.out.println("----------------------------------");

                Employee employee = new Employee(name, hours, valuePerHours);
                employees.add(employee);
                scanner.nextLine();

            } else if (x.equals("y")) {

                System.out.print("Type the name of employee: ");
                String name = scanner.nextLine();

                System.out.println("----------------------------------");

                System.out.print("Type quantity of hours worked: ");
                int hours = scanner.nextInt();

                System.out.println("----------------------------------");

                System.out.print("Type the value per hours: ");
                double valuePerHours = scanner.nextDouble();

                System.out.println("----------------------------------");

                System.out.print("Type additional charge: ");
                double addCharge = scanner.nextDouble();

                System.out.println("----------------------------------");

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHours, addCharge);
                employees.add(employee);
                scanner.nextLine();
            }

        }
        for (int i = 0; i < numberEmployees; i++){
            System.out.println("PAYMENTS: ");
            System.out.println(employees.get(i).name + " - " + employees.get(i).payment());
            System.out.println("----------------------------------");
        }

        scanner.close();
    }
}
