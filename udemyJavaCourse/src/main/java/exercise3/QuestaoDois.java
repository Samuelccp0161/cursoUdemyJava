package exercise3;

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();

        while (x != 0 && y != 0) {
            System.out.println(sistemaCartesiano(x, y));

            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        scanner.close();
    }
    public static String sistemaCartesiano(int x, int y){

        if (x >= 0.01 && y >= 0.01) {
            return "primeiro";
        } else if (x <= -0.01 && y >= 0.01) {
            return "segundo";
        } else if (x <= -0.01 && y <= -0.01) {
            return "terceiro";
        } else if (x >= 0.01 && y <= -0.01){
            return "quarto";
        }else if (x == 0 && y == 0){
            return "";
        }
        return "";
    }

}
