package exercise2;

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cod = scanner.nextInt();
        int quantidade = scanner.nextInt();



        scanner.close();
    }
    public static double lancheValor(int cod, int quantidade){
        double valorLanche = 0;
        double resultado = 0;
        double valor = 0;

        if (cod == 1){
            valor = 4.00;
        }else if (cod == 2){
            valor = 4.50;
        }else if (cod == 3){
            valor = 5.00;
        }else if (cod == 4){
            valor = 2.00;
        }else if(cod == 5){
            valor = 1.50;
        }else
            System.out.println("Por favor Digite um codigo valido");

        return valor * quantidade;
    }
}
