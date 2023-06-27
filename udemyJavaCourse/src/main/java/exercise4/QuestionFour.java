package exercise4;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------DIVISION-------------------");

        System.out.print("Type the number of desired of divisions: ");

        int n = scanner.nextInt();

        System.out.println("----------------------------------");

        for (int i = 0; i < n; i++){
            System.out.print("Type the number of desired of quotient: ");

            double x = scanner.nextInt();

            System.out.println("----------------------------------");

            System.out.print("Type the number of desired of divisor: ");

            double y = scanner.nextInt();

            System.out.println("----------------------------------");

            System.out.println("division result: " + division(x, y));

            System.out.println("----------------------------------");
        }

        scanner.close();
    }
    public static double division(double x, double y){
        double result = x / y;
        if (y == 0){
            return x / y;
        }
        else
            return result;
    }
}
