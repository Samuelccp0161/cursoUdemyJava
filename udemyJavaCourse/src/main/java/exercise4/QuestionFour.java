package exercise4;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            double x = scanner.nextInt();
            double y = scanner.nextInt();

            if (y == 0){
                System.out.println("divisao impossivel");
            } else
                System.out.println( x / y);
        }
        scanner.close();
    }
}
