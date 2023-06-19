package exercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------NUMEROS NEGATIVOS-------------------");

        System.out.print("Quantos números voce vai digitar: ");

        int n = scanner.nextInt();
        double soma = 0;
        double media = 0;

        double[] valores = new double[n];

        System.out.println("----------------------------------");
        for (int i = 0; i < valores.length; i++){
            System.out.println("Qual o valor desejado: ");
            valores[i] = scanner.nextDouble();
        }
        System.out.println("----------------------------------");

        soma = Arrays.stream(valores).sum();
        media = soma / n;

        System.out.println("VALORES: " + Arrays.toString(valores));
        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + media);


    }
    public static double sum(double[] n){
        double sum = 0.0;
        for (int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum;
    }

    public static double average(double[] listNumbers){
        double sum = sum(listNumbers);
        return sum / listNumbers.length;
    }

}
