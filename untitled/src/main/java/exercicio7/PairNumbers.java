package exercicio7;

import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------NÚMEROS PARES--------------------");

        System.out.print("Quantos numeros voce vai digitar: ");

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();

        }
        pairMain(numbers);

        scanner.close();
    }
    public static int[] pairMain(int[] numbers){
        int quantity = 0;

        System.out.println("----------------------------------");
        System.out.println("NUMEROS PARES:");

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.print(" " + numbers[i] + " ");

                quantity += 1;
            }
        }
        System.out.println("\n----------------------------------");
        System.out.println("QUANTIDADE DE PARES = " + quantity);
        System.out.println("----------------------------------");
        return numbers;
    }
    public static boolean pair(int[] number){
        for (int i = 0; i < number.length; i++){
            if (number[i] % 2 == 0){
                System.out.println();
                return true;
            } else return false;
        }
        return true;
    }
}
