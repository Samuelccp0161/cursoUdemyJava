package exercicio2;

import java.util.Scanner;


public class QuestaoDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        numero = scanner.nextInt();

        paridade(numero);

        scanner.close();

    }

    public static int paridade(int numero) {
        if (numero % 2 == 0)
            System.out.println(numero + " é par");
        else
            System.out.println(numero + " é impar");
        return numero;
    }
}
