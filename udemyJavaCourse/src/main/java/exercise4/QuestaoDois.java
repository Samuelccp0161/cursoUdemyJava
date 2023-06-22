package exercise4;

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20){
                System.out.println(in = in + 1);
//                int y = i
//                System.out.println(dentro);
//                if (x <= 10 || x > 20){
//                    int w = i + 1
//                }
//                System.out.println( i += 1);
//                System.out.println("Fora do intervalo");
            }else System.out.println(out = out +1);
//                System.out.println(i++);
        }

        //eu tenho que colocar o numero de entradas que eu quero.
        //eu tenho que repetir o numero de vezes da primeira entrada.
        //enquanto x != x repetir isso ate ser igual.
        //O que precisaria para fazer a contagem dos numeros fora do intervalo ?
        //Precisaria que 1 + x
        scanner.close();
    }
}
