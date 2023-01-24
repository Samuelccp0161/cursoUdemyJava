package exercicio2;

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();


        scanner.close();
    }
    public static boolean cartesiano(double x, double y){
        if (x == 0 && y == 0){
            System.out.println("ORIGEM");
        } else if (x >= 0.01 && y >= 0.01) {
            System.out.println("Q1");
        } else if (x <= -0.01 && y >= 0.01) {
            System.out.println("Q2");
        } else if (x <= -0.01 && y <= -0.01) {
            System.out.println("Q3");
        } else if (x >= 0.01 && y <= -0.01){
            System.out.println("Q4");
        }
        return true;
    }
}
