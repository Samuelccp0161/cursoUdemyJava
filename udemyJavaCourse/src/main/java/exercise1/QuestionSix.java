package exercise1;

import java.util.Locale;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------AREA OF GEOMETRIC FIGURES-------------------");

        double a, b, c;

        System.out.print("Type the value of a: ");
        a = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.print("Type the value of b: ");
        b = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.print("Type the value of c: ");
        c = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.printf("Triangle: %.3f\n", triangleArea(a ,c));
        System.out.println("---------------------------------------------");
        System.out.printf("Circle: %.3f\n", circleArea(c));
        System.out.println("---------------------------------------------");
        System.out.printf("Trapeze: %.3f\n", trapezeArea(a, b, c));
        System.out.println("---------------------------------------------");
        System.out.printf("Square: %.3f\n", squareArea(b));
        System.out.println("---------------------------------------------");
        System.out.printf("Rectangular: %.3f\n", rectangularArea(a ,b));
        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static double triangleArea(double a, double c){
        return c * a / 2;
    }
    public static double circleArea(double c){
        double pi = 3.14159;
        return pi * Math.pow(c, 2);
    }
    public static double trapezeArea(double a, double b, double c){
        return (a + b) * c /2;
    }
    public static double squareArea(double b){
        return Math.pow(b, 2);
    }
    public static double rectangularArea(double a, double b){
        return a * b;
    }
}
