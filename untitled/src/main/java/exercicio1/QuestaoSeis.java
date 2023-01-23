package org.example;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Double A, B, C, areaTriangulo, areaCirculo, pi = 3.14159, areaTrapezio, areaQuadrado, areaRetangulo;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        areaTriangulo = C * A / 2;
        areaCirculo = pi * Math.pow(C, 2);
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.println("triangulo: " + areaTriangulo);
        System.out.println("Circulo: " + areaCirculo);
        System.out.println("Trapezio: " + areaTrapezio);
        System.out.println("Quadrado: " + areaQuadrado);
        System.out.println("Retangulo: " + areaRetangulo);

        scanner.close();
    }
}
