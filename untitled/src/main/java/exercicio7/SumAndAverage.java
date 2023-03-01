package exercicio7;

import java.util.Arrays;

public class SumAndAverage {
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
