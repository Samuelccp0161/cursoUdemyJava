package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------BANK 24 HOURS------------------------------");

        System.out.print("Enter account number: ");
        int numberAccount = scanner.nextInt();

        BankTransference bankTransference = new BankTransference(numberAccount);

        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();
        bankTransference.setName(name);


        System.out.print("Is there na initial deposit (y/n)? ");
        if (scanner.nextLine().equals("y")){

            System.out.print("Enter initial deposit value: ");
            double valorInitial = scanner.nextDouble();
            bankTransference.deposit(valorInitial);
        }

        System.out.println("-----------------------------------------------------------");

        System.out.println("Account number: " + bankTransference.getNumberAccount());
        System.out.println("Account holder: " + bankTransference.getName());
        System.out.printf("Initial deposit value: %.2f%n", bankTransference.getValue());

        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        bankTransference.deposit(deposit);

        System.out.printf("Updated account data:%n"
                + "Account number: " + bankTransference.getNumberAccount() + ", "
                + "Account holder: " + bankTransference.getName() + ", "
                + "Initial deposit value: %.2f%n", bankTransference.getValue());

        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        bankTransference.withdraw(withdraw);

        System.out.printf("Updated account data:%n"
                + "Account number: " + bankTransference.getNumberAccount() + ", "
                + "Account holder: " + bankTransference.getName() + ", "
                + "Initial deposit value: %.2f%n", bankTransference.getValue());

        System.out.println("-----------------------------------------------------------");


        scanner.close();
    }
}
