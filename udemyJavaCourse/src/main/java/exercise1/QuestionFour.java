package exercise1;

import java.util.Locale;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------EMPLOYEE AND SALARY-------------------");

        System.out.print("Type employee code: ");
        int employeeCode = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type worked hours: ");
        int workedHours = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type amount received per hours: ");
        double amountReceivedPerHour = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.println("Employee code: " + employeeCode);
        System.out.printf("Salary: U$ %.2f\n", salary(workedHours, amountReceivedPerHour));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static double salary(int workedHours, double amountReceivedPerHour){
        double totalSalary = amountReceivedPerHour * workedHours;

        return totalSalary;
    }



}
