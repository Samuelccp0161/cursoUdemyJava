package exercise15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------");

        System.out.print("Type the account of number: ");
        int numberAccount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Type the name of account holder: ");
        String nameHolder = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Type the initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Type the withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Type amount for withdraw: ");
        double amount = scanner.nextDouble();

        System.out.println("----------------------------------");

        Account account = new Account(numberAccount, nameHolder, initialBalance, withdrawLimit);

        try {
            account.withdraw(amount);
        }catch (WithdrawException e){
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------");

        scanner.close();
    }
}
