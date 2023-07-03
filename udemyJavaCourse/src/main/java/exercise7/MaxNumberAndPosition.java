package exercise7;

import java.util.Scanner;

public class MaxNumberAndPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------WHAT IS THE BIGGEST NUMBER AND ITS POSITION ON THE LIST-------------------");

        System.out.print("Type quantity of numbers desired: ");

        int n = scanner.nextInt();
        double[] listNumbers = new double[n];

        System.out.println("----------------------------------");

        for (int i = 0; i < listNumbers.length; i++){
            System.out.println("Type a number: ");
            listNumbers[i] = scanner.nextDouble();
        }

        System.out.println("----------------------------------");

        int i = maxNumber(listNumbers);

        System.out.println("Highest value: " + listNumbers[i]);
        System.out.println("----------------------------------");
        System.out.println("Highest value position: " + i);
        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static int maxNumber(double[] numbers){
        double value = 0.0;
        int positionElement = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > value){
                value = numbers[i];
                positionElement = i;
            }
        }
        return positionElement;
    }
}
