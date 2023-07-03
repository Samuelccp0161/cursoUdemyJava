package exercise7;

import java.util.*;

public class BelowAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------BELOW AVERAGE-------------------");

        System.out.print("Type the numbers of elements in vector: ");

        int n = scanner.nextInt();
        double[] vector = new double[n];


        for (int i = 0; i < vector.length; i++){
            System.out.println("Type a number: ");
            vector[i] = scanner.nextDouble();
        }

        System.out.println("----------------------------------");

        System.out.println("Average vector: " + average(vector));

        System.out.println("----------------------------------");

        for (int i = 0; i < vector.length; i++) {
            if (average(vector) > vector[i]) {
                System.out.println("Elements below average: ");
                System.out.println(vector[i]);
            }
        }

        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static double average(double[] vector){
        double sum = 0.0;
        double average = 0.0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            average = sum / vector.length;
        }
        return average;
    }
    public static double[] belowAverage(double[] vector){
        int quantity = 0;

        for (int i = 0; i < vector.length; i++) {
            if (average(vector) > vector[i]) {
                quantity += 1;
            }
        }
        double[] elements = new double[quantity];
        int i = 0;
        for (double element : vector) {
            if (average(vector) > element){
                elements[i] = element;
                i++;
            }
        }

        return elements;
    }
}
