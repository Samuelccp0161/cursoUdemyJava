package exercise2;

import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int horasInicial = scanner.nextInt();
        int horasFinal = scanner.nextInt();

        diferencaHoras(horasInicial, horasFinal);

        scanner.close();
    }
    public static int diferencaHoras(int horasInicial, int horasFinal){
        int valorMaximo = 24;
        int valorMinimo = 0;
        int resultado = 0;

        if (horasInicial > horasFinal) {
            valorMinimo = valorMaximo - horasInicial;
            resultado = valorMinimo + horasFinal;
        } else if (horasInicial == horasFinal) {
            resultado = valorMaximo - valorMinimo;
        } else {
            resultado = horasFinal - horasInicial;
        }
        return resultado;
    }
}
