package exercicio2;

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double x;
        Double y;

        x = scanner.nextDouble();
        y = scanner.nextDouble();

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
        scanner.close();
    }
}
