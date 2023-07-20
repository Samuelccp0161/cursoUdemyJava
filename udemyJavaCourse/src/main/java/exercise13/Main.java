package exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------PRODUCT-------------------");
        System.out.print("Type quantity of products desired: ");
        int quantityProduct = scanner.nextInt();

        scanner.close();
    }
}
