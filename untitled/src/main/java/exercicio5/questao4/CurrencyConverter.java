package exercicio5.questao4;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollar = scanner.nextDouble();
        double purchaseQuantityDollars = scanner.nextDouble();

        System.out.println("What is the dollar price?" + dollar);
        System.out.println("How many dollars will be bought?" + purchaseQuantityDollars);
        System.out.println("Amount to be paid in reais =" + converterToReal(dollar, purchaseQuantityDollars) );
        scanner.close();
    }

    public static double converterToReal(double dollar, double purchaseQuantityDollars){
        return (dollar + (dollar * 0.06)) * purchaseQuantityDollars;
    }

}
