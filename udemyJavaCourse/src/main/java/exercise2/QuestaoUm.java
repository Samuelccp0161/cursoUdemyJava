package exercise2;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        PositivoOuNegativo(number);

        scanner.close();
    }
    public static int PositivoOuNegativo(int number){

        if (number < 0){
            System.out.println(number + " negativo");
        }else if (number > 0)
            System.out.println(number + " positivo");
        else
            System.out.println(number + " neutro");
        return number;
    }
}
