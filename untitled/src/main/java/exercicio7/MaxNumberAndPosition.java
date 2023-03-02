package exercicio7;

import java.util.Scanner;

public class MaxNumberAndPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------QUAL O NÚMERO MAIOR E SUA POSIÇÃO NA LISTA-------------------");

        System.out.print("Quantos numeros voce vai digitar: ");

        int n = scanner.nextInt();
        double[] listNumbers = new double[n];

        System.out.println("----------------------------------");

        for (int i = 0; i < listNumbers.length; i++){
            System.out.println("Digite um numero: ");
            listNumbers[i] = scanner.nextInt();
        }

        System.out.println("----------------------------------");

        int i = maxNumber(listNumbers);

        System.out.println("MAIOR VALOR: " + listNumbers[i]);
        System.out.println("----------------------------------");
        System.out.println("POSIÇÃO DO MAIOR VALOR: " + i);
        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static int maxNumber(double[] numbers){
        double valueInitial = 0.0;
        int positionElement = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > valueInitial){
                valueInitial = numbers[i];
                positionElement = i;
            }
        }
        return positionElement;
    }
}
