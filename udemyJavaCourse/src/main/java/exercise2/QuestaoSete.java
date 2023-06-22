package exercise2;

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        cartesiano(x, y);
        scanner.close();
    }
    public static String cartesiano(double x, double y){
        if (x == 0 && y == 0){
           return "ORIGEM";
        } else if (x >= 0.01 && y >= 0.01) {
            return "Q1";
        } else if (x <= -0.01 && y >= 0.01) {
            return "Q2";
        } else if (x <= -0.01 && y <= -0.01) {
            return "Q3";
        } else if (x >= 0.01 && y <= -0.01){
            return "Q4";
        }
        return "";
    }
}
