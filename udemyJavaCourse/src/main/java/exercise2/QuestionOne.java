package exercise2;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------POSITIVE OR NEGATIVE-------------------");

        System.out.print("Type the desired number: ");
        int number = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("The number that you typed is: " + positiveOrNegative(number));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static int positiveOrNegative(int number){

        if (number < 0){
            System.out.println(number + " negative");
        }else if (number > 0)
            System.out.println(number + " positive");
        else
            System.out.println(number + " neutral");
        return number;
    }
}
