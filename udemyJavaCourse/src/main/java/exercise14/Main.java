package exercise14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------TAX PAYER-------------------");

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayer = scanner.nextInt();
        scanner.nextLine();

        System.out.println("----------------------------------");
        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 0; i < numberOfTaxPayer; i++) {
            System.out.print("Individual or Company (i / c): ");

            String element = scanner.nextLine();

            System.out.println("----------------------------------");

            if (element.equals("i")){
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.println("----------------------------------");

                System.out.print("Annual income: ");
                double annualIncome = scanner.nextDouble();

                System.out.println("----------------------------------");

                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                scanner.nextLine();
                
                System.out.println("----------------------------------");

                Individual individual = new Individual(name, annualIncome, healthExpenditures);
                taxPayers.add(individual);

            } else if (element.equals("c")) {
                System.out.print("Name company: ");
                String name = scanner.nextLine();

                System.out.println("----------------------------------");

                System.out.print("Annual income company: ");
                double annualIncome = scanner.nextDouble();

                System.out.println("----------------------------------");

                System.out.print("Number of employees in company: ");
                int numberOfEmployees = scanner.nextInt();
                scanner.nextLine();

                System.out.println("----------------------------------");

                Company company = new Company(name, annualIncome, numberOfEmployees);
                taxPayers.add(company);
            }
        }
        double sum = 0.00;

        System.out.println("TAXES PAID: ");

        for (int i = 0; i < numberOfTaxPayer; i++) {
            System.out.printf("%s: $ %.2f%n", taxPayers.get(i).name, taxPayers.get(i).tax());
            sum += taxPayers.get(i).tax();
        }

        System.out.println("----------------------------------");

        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        System.out.println("----------------------------------");

        scanner.close();
    }
}
