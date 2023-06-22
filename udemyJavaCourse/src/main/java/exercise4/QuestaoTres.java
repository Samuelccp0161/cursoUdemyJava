package exercise4;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        for (int i = 0; i < n; i++){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();

            double total = (2 * x + 3 * y + 5 * z) / (2 + 3 + 5);
            System.out.printf("media ponderada: %.1f %n", total);
        }
        scanner.close();
    }
}
