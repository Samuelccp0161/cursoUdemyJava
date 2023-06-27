package exercise2;

import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------CARTESIAN PLANE-------------------");

        System.out.print("Type the desired value for X: ");
        double x = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.print("Type the desired value for Y: ");
        double y = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.println("Your meeting point is located: " + cartesianPlane(x, y));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static String cartesianPlane(double x, double y){
        if (x == 0 && y == 0){
           return "ORIGIN";
        } else if (x >= 0.01 && y >= 0.01) {
            return "Q1";
        } else if (x <= -0.01 && y >= 0.01) {
            return "Q2";
        } else if (x <= -0.01 && y <= -0.01) {
            return "Q3";
        } else if (x >= 0.01 && y <= -0.01){
            return "Q4";
        }
        return "";
    }
}
