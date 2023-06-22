package exercise7;

import java.util.Arrays;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------SOMA DE VETORES-------------------------------");

        System.out.print("Quantos números na lista você vai digitar: ");

        int numbers = scanner.nextInt();

        int[] vectorA = new int[numbers];
        int[] vectorB = new int[numbers];

        System.out.println("----------------Digite os valores do vetor A------------------");

        for (int i = 0; i < vectorA.length; i++){
            System.out.print("Digite um valor para o vetor A: ");
            vectorA[i] = scanner.nextInt();
        }
        System.out.println("----------------Digite os valores do vetor B------------------");

        for (int i = 0; i < vectorB.length; i++){
            System.out.print("Digite um valor para o vetor B: ");
            vectorB[i] = scanner.nextInt();
        }

        System.out.println("-----------------Array A-----------------");

        System.out.println(Arrays.toString(vectorA));

        System.out.println("-----------------Array B-----------------");

        System.out.println(Arrays.toString(vectorB));

        System.out.println("-----------------Arrays A + B-----------------");

        sumOfVectors(vectorA, vectorB);
        System.out.println(Arrays.toString(sumOfVectors(vectorA, vectorB)));

        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static int[] sumOfVectors(int[] vectorA, int[] vectorB){
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }
}
