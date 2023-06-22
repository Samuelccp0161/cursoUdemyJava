package exercise7;

import java.util.*;

public class BelowAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------ABAIXO DA MEDIA-------------------");

        System.out.print("Quantos elementos vai ter o vetor: ");

        int n = scanner.nextInt();
        double[] vector = new double[n];


        for (int i = 0; i < vector.length; i++){
            System.out.println("Digite um numero: ");
            vector[i] = scanner.nextDouble();
        }

        System.out.println("----------------------------------");

        System.out.println("MEDIA DO VETOR = " + average(vector));

        System.out.println("----------------------------------");

        for (int i = 0; i < vector.length; i++) {
            if (average(vector) > vector[i]) {
                System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
                System.out.println(vector[i]);
            }
        }

        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static double average(double[] vector){
        double sum = 0.0;
        double media = 0.0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            media = sum / vector.length;
        }
        return media;
    }
    public static double[] belowAverage(double[] vector){
        int qtd = 0;

        for (int i = 0; i < vector.length; i++) {
            if (average(vector) > vector[i]) {
                qtd += 1;
            }
        }
        double[] elements = new double[qtd];
        int i = 0;
        for (double element : vector) {
            if (average(vector) > element){
                elements[i] = element;
                i++;
            }
        }

        return elements;
    }
}
