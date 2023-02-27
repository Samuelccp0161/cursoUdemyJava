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

    public static double average(double[] n){
        double sum = 0.0;
        double media= 0.0;

        for (int i = 0; i < n.length; i++){
            sum += n[i];
            media = sum / n[1];

        }
    return media;
    }

}
