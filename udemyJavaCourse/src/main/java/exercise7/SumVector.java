package exercise7;

import java.util.Arrays;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------SUM OF VECTORS-------------------------------");

        System.out.print("How many numbers in the list will you type: ");

        int numbers = scanner.nextInt();

        int[] vectorA = new int[numbers];
        int[] vectorB = new int[numbers];

        System.out.println("----------------Type the values of vector A------------------");

        for (int i = 0; i < vectorA.length; i++){
            System.out.print("Type the values of vector A: ");
            vectorA[i] = scanner.nextInt();
        }
        System.out.println("----------------Type the values of vector B------------------");

        for (int i = 0; i < vectorB.length; i++){
            System.out.print("Type the values of vector B: ");
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
