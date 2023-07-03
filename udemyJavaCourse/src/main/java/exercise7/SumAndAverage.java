package exercise7;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------NUMBERS NEGATIVE-------------------");

        System.out.print("Type the quantity of numbers desired: ");

        int numbers = scanner.nextInt();
        double sum = 0;
        double average = 0;

        double[] values = new double[numbers];

        System.out.println("----------------------------------");
        for (int i = 0; i < values.length; i++){
            System.out.println("What is the desired value: ");
            values[i] = scanner.nextDouble();
        }
        System.out.println("----------------------------------");

        sum = Arrays.stream(values).sum();
        average = sum / numbers;

        System.out.println("----------------------------------");
        System.out.println("Values: " + Arrays.toString(values));

        System.out.println("----------------------------------");
        System.out.println("Sum: " + sum);

        System.out.println("----------------------------------");
        System.out.println("Average: " + average);

        System.out.println("----------------------------------");

    }
    public static double sum(double[] n){
        double sum = 0.0;
        for (int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum;
    }

    public static double average(double[] listNumbers){
        double sum = sum(listNumbers);
        return sum / listNumbers.length;
    }

}
