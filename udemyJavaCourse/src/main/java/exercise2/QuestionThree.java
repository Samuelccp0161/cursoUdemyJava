package exercise2;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------MULTIPLES-------------------");

        System.out.print("Type the desired number: ");
        int numberOne = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the desired number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("the multiples of these numbers are: " + multiples(numberOne, numberTwo));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static boolean multiples(int numberOne, int numberTwo){
        if (numberTwo % numberOne == 0)
            System.out.println("number are multiples");
        else if (numberOne % numberTwo == 0)
            System.out.println("number are multiples");
        else System.out.println("number are not multiples");

        return numberTwo % numberOne == 0 || numberOne % numberTwo == 0;
    }
}
