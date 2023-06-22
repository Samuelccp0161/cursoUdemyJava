package exercise1;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------SUM-------------------");

        System.out.print("Enter one number: ");
        int x = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Enter other number: ");
        int y = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("sum = " + sum(x,y));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static int sum(int x, int y){
        return x + y;
    }
}