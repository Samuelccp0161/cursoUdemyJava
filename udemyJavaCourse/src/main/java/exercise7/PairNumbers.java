package exercise7;

import java.util.Arrays;
import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------NUMBERS EVEN--------------------");

        System.out.print("Type the quantity of numbers desired: ");

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("----------------------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Type a number: ");
            numbers[i] = scanner.nextInt();
            System.out.println("----------------------------------");
        }
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(numbersEven(numbers)));
        System.out.println("----------------------------------");

        scanner.close();
    }
    public static int[] numbersEven(int[] numbers){
        int quantity = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.print(" " + numbers[i] + " ");

                quantity += 1;
            }
        }
        return numbers;
    }
    public static boolean even(int[] number){
        for (int i = 0; i < number.length; i++){
            if (number[i] % 2 == 0){
                return true;
            } else return false;
        }
        return true;
    }
}
