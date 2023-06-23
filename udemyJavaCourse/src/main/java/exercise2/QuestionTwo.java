package exercise2;

import java.util.Scanner;


public class QuestionTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------EVEN NUMBER-------------------");

        System.out.print("Type the desired number: ");
        int number = scanner.nextInt();

        System.out.println("---------------------------------------------");

        even(number);

        System.out.println("---------------------------------------------");

        scanner.close();

    }

    public static int even(int number) {
        if (number % 2 == 0)
            System.out.println(number + " This number is even");
        else
            System.out.println(number + " This number is odd");
        return number;
    }
}
