package exercicio2;

import java.util.Date;
import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int horasInicial;
        int valorMaxima = 24;
        int valorMinimo = 0;
        int horasFinal;
        int resultado;

        horasInicial = scanner.nextInt();
        horasFinal = scanner.nextInt();

        if (horasInicial > horasFinal) {
            valorMinimo = valorMaxima - horasInicial;
            resultado = valorMinimo + horasFinal;
            System.out.println(resultado);
        } else if (horasInicial == horasFinal) {
            System.out.println(valorMaxima - valorMinimo);
        } else
            System.out.println(horasFinal - horasInicial);

        scanner.close();
    }
}
