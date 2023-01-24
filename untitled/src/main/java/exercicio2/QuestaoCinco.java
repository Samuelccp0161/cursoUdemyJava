package exercicio2;

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cod;
        int quantidade;

        cod = scanner.nextInt();
        quantidade = scanner.nextInt();

        if (cod == 1){
            Double valor = 4.00;
            System.out.println(quantidade * valor);
        }if (cod == 2){
            Double valor = 4.50;
            System.out.println(quantidade * valor);
        }if (cod == 3){
            Double valor = 5.00;
            System.out.println(quantidade * valor);
        }if (cod == 4){
            Double valor = 2.00;
            System.out.println(quantidade * valor);
        }if(cod == 5){
            Double valor = 1.50;
            System.out.println(quantidade * valor);
        }else
            System.out.println("Por favor Digite um codigo valido");

        scanner.close();
    }
}
