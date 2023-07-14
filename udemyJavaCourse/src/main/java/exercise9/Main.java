package exercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------Worker-------------------");

        System.out.print("Type the name of worker: ");
        String name = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Type the level of worker: ");
        String level = scanner.nextLine();


     System.out.println("----------------------------------");

        System.out.print("Type the salary base of worker: ");
        double salaryBase = scanner.nextDouble();

        Worker worker = new Worker(name, LevelEnum.valueOf(level), salaryBase);

        System.out.println("----------------------------------");

        System.out.print("Type the quantity of contracts: ");
        int contracts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < contracts; i++){
            System.out.println("----------------------------------");
            System.out.println("Enter contract " + (i + 1) + "# data: ");

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.nextLine();

            Date dateFormatted = dateFormat.parse(date);

            System.out.print("Value per hour: ");
            double valuePerHours = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();
            scanner.nextLine();

            Contract contract = new Contract(dateFormatted, valuePerHours, hours);

            worker.addContract(contract);
        }

        System.out.println("----------------------------------------------------");

        System.out.print("Type the month desired: ");
        int month = scanner.nextInt();

        System.out.print("Type the year desired: ");
        int year = scanner.nextInt();

        System.out.println("----------------------------------");

        System.out.println("Enter month and year to calculate income (MM/YYYY): " + month + "/" + year);
        System.out.println("Name: " + name);
        System.out.println("Income for " + month + "/" + year + ": "  + worker.income(month, year));

        System.out.println("----------------------------------");
        scanner.close();
    }
}
