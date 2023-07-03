package exercise4;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------Weighted Average-------------------");

        System.out.print("Type the desired number: ");

        double number = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        for (int i = 0; i < number; i++){
            System.out.print("Type the value one desired: ");
            double x = scanner.nextDouble();

            System.out.println("---------------------------------------------");

            System.out.print("Type the value two desired: ");
            double y = scanner.nextDouble();

            System.out.println("---------------------------------------------");

            System.out.print("Type the value three desired: ");
            double z = scanner.nextDouble();

            System.out.println("---------------------------------------------");

            System.out.printf("weighted average: %.1f %n", weightedAverage(x,y,z));
            System.out.println("---------------------------------------------");

        }
        System.out.println("---------------------------------------------");
        scanner.close();
    }
    public static double weightedAverage(double x, double y, double z){
        return (2 * x + 3 * y + 5 * z) / (2 + 3 + 5);
    }
}
