package exercise4;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------FACTORIAL-------------------");

        System.out.print("Type the number: ");

        int n = scanner.nextInt();

        System.out.println("----------------------------------");

        System.out.println("The calculation do factorial is: " + factorial(n));

        System.out.println("----------------------------------");

        scanner.close();
    }

    public static int factorial(int n) {
        int fatorial = 1;

        for (int i = 0; i < n; i++){
            fatorial *= (n - i);
        }
        return fatorial;
    }
}
