package exercicio7;

import java.util.*;

public class BelowAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int number = 0;
        double numbersMinorsAverage = 0.0;
        double sum = 0.0;
        double media = 0.0;
        double[] vector = new double[n];
        double[] belowAverageVector = new double[number];


        for (int i = 0; i < vector.length; i++){
            vector[i] = scanner.nextDouble();
        }

        for (int i = 0; i < vector.length; i++){
            sum += vector[i];
            media = sum / vector.length;
        }
        for (int i = 0; i < vector.length; i++){
            if (media > vector[i]){
                number += 1;
            }
        }

        System.out.println(number);

        System.out.println(media);
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(belowAverageVector));


        scanner.close();
    }
}
