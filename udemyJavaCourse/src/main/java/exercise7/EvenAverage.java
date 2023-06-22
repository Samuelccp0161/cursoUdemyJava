package exercise7;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------ABAIXO DA MEDIA-------------------");

        System.out.print("Quantos elementos vai ter o vetor: ");

        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();

        }
        if (n % 2 != 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{

            System.out.println("MEDIA DOS PARES: " + average(numeros));

        }


        scanner.close();
    }
    public static int average(int[] vector){
        int sum = 0;
        int media = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            media = sum / vector.length;
        }
        return media;
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
