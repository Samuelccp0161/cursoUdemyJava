package exercicio2;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        if (numero2 % numero1 == 0)
            System.out.println("são múltiplos");
        else if (numero1 % numero2 == 0)
            System.out.println("são múltiplos");
        else System.out.println("não são múltiplos");

        scanner.close();
    }
}
