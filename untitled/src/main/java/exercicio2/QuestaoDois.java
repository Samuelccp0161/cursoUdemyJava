package exercicio2;

import java.util.Scanner;


public class QuestaoDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        numero = scanner.nextInt();

        if (numero % 2 == 0)
            System.out.println(numero + " é par");
        else
            System.out.println(numero + " é impar");

        scanner.close();

    }

    public static String paridade(int n) {
        return ""; // "PAR" OU "IMPAR"
    }
}
