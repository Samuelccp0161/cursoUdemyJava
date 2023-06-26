package exercise4;

import java.util.Scanner;

public class QuestionFive {
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
