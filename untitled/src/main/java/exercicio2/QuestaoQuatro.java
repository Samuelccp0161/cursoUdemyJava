package exercicio2;

import java.util.Date;
import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int horasInicial = scanner.nextInt();
        int horasFinal = scanner.nextInt();

        diferencaHoras(horasInicial, horasFinal);

        scanner.close();
    }
    public static boolean diferencaHoras(int horasInicial, int horasFinal){
        int valorMaxima = 24;
        int valorMinimo = 0;
        int resultado;

        if (horasInicial > horasFinal) {
            valorMinimo = valorMaxima - horasInicial;
            resultado = valorMinimo + horasFinal;
            System.out.println(resultado);
        } else if (horasInicial == horasFinal) {
            System.out.println(valorMaxima - valorMinimo);
        } else
            System.out.println(horasFinal - horasInicial);
        return true;
    }
}
