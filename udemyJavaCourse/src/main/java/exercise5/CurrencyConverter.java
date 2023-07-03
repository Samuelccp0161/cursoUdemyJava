package exercise5;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------DOLLAR QUOTATION-------------------");

        System.out.print("What is the dollar price: ");
        double dollar = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("How many dollars will be bought: ");
        double purchaseQuantityDollars = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.printf("Amount to be paid in real: %.2f\n", converterToReal(dollar, purchaseQuantityDollars));

        System.out.println("----------------------------------");

        scanner.close();
    }

    public static double converterToReal(double dollar, double purchaseQuantityDollars){
        return (dollar + (dollar * 0.06)) * purchaseQuantityDollars;
    }

}
