package exercise7;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------NUMBERS NEGATIVE-------------------");

        System.out.print("Type the quantity of numbers desired: ");

        int n = scanner.nextInt();

        int[] vector = readNumbers(n, scanner);

        System.out.println("----------------------------------");

        System.out.println("Numbers negative: ");

        numbersNegative(vector);

        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static int[] readNumbers(int n, Scanner scanner){
        int[] vector = new int[n];
        for (int i = 0; i < n; i++){
            vector[i] = scanner.nextInt();
        }
        return vector;
    }
    public static void numbersNegative(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0)
                 System.out.println(vector[i]);
        }
    }

    public static boolean isNegative(int i) {
        return i < 0;
    }
}
