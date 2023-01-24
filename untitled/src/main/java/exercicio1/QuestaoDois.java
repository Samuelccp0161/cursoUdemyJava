package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        System.out.println(areaCirculo(raio));

        scanner.close();
    }
    public static double areaCirculo(double raio){
        double pi = 3.14159;

        return pi * Math.pow(raio, 2);
    }
}

