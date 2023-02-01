package exercicio4;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fatorial = 1;

        for (int i = 0; i < n; i++){
            fatorial *= (n - i);
        }
        System.out.println(fatorial);

        scanner.close();
    }
}
