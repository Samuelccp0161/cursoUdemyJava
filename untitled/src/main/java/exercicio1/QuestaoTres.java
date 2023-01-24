package exercicio1;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        System.out.println(diferenca(A,B,C,D));

        scanner.close();
    }
    public static int diferenca(int a, int b, int c, int d){
        int diferenca = a * b - c * d;
        return diferenca;
    }

}
