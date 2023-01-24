package exercicio1;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(soma(x,y));

        scanner.close();
    }
    public static int soma(int x, int y){
        return x + y;
    }
}