package exercise1;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------Difference-------------------");

        int a, b, c, d;

        System.out.print("Type the value of a: ");
        a = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the value of b: ");
        b = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the value of c: ");
        c = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the value of d: ");
        d = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("Difference: " + difference(a,b,c,d));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static int difference(int a, int b, int c, int d){
        return a * b - c * d;
    }

}
