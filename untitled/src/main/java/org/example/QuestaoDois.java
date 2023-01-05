package org.example;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Double pi, raio, area;

        pi = 3.14159;
        raio = scanner.nextDouble();


        area = pi * Math.pow(raio, 2);

        System.out.println(area);

        scanner.close();
    }
}
