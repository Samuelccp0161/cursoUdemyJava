package exercise4;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 1; i <= x; i += 2){
            System.out.println(i);;
        }

        scanner.close();
    }
    public static boolean isImpar(int numero){
        return numero % 2 != 0;
    }
}
