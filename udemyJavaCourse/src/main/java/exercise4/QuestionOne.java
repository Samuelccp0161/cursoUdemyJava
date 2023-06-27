package exercise4;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------IS ODD-------------------");

        System.out.print("Type the desired number: ");

        int x = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("The number typed is odd: " + isOdd(x));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static boolean isOdd(int number){
        return number % 2 != 0;
    }
}
