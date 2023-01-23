package exercicio2;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        number = scanner.nextInt();
        if (number < 0){
            System.out.println(number + " negativo");
        }else if (number > 0)
            System.out.println(number + " positivo");
        else
            System.out.println(number + " neutro");

        scanner.close();
    }
}
