package exercise7;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------EVEN AVERAGE-------------------");

        System.out.print("Type quantity de numbers in vector: ");

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Type a number: ");
            numbers[i] = scanner.nextInt();

        }
        if (n % 2 != 0){
            System.out.println("No even number");
        }else{

            System.out.println("Average even: " + average(numbers));

        }
        scanner.close();
    }
    public static int average(int[] vector){
        int sum = 0;
        int average = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            average = sum / vector.length;
        }
        return average;
    }
    public static boolean isEven(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0){
                return true;
            }

        }
        return false;
    }
}
