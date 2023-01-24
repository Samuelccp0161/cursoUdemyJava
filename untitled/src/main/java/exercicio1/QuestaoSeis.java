package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.println("triangulo: " + areaTriangulo(a ,c));
        System.out.println("Circulo: " + areaCirculo(c));
        System.out.println("Trapezio: " + areaTrapezio(a, b, c));
        System.out.println("Quadrado: " + areaQuadrado(b));
        System.out.println("Retangulo: " + areaRetangulo(a ,b));

        scanner.close();
    }
    public static double areaTriangulo(double a, double c){
        return c * a / 2;
    }
    public static double areaCirculo(double c){
        double pi = 3.14159;
        return pi * Math.pow(c, 2);
    }
    public static double areaTrapezio(double a, double b, double c){
        return (a + b) * c /2;
    }
    public static double areaQuadrado(double b){
        return Math.pow(b, 2);
    }
    public static double areaRetangulo(double a, double b){
        return a * b;
    }
}
