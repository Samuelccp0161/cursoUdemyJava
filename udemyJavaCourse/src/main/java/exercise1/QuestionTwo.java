package exercise1;

import java.util.Locale;
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------CIRCLE AREA-------------------");

        System.out.print("Type the radius: ");

        double radius = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.println("the area of the circle is: " + circleArea(radius));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static double circleArea(double radius){
        double pi = 3.14159;

        return pi * Math.pow(radius, 2);
    }
}

