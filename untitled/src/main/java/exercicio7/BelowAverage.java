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
        double[] belowAverageVector = new double[number];
        ArrayList<Double> fd = new ArrayList<>();
        for (int i = 0; i < vector.length; i++){
            if (media > vector[i]){
                belowAverageVector[i] = vector[i];
//                numbersMinorsAverage = vector[i];
//                belowAverageVector[i] = numbersMinorsAverage;
                System.out.println(Arrays.toString(belowAverageVector));
            }
        }
        System.out.println(number);

        System.out.println(media);
        System.out.println(Arrays.toString(vector));


        scanner.close();
    }
}
