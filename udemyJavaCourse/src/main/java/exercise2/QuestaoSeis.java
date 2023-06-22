package exercise2;

import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        intervalos(valor);

        scanner.close();
    }
    public static String intervalos(double valor){
        if (valor < 0.00 || valor > 100){
            return "Fora do intervalo";
        } else if (valor <= 25.00) {
            return "([0,25]";
        } else if (valor <= 50.00) {
            return "(25,50]";
        } else if (valor <= 75.00) {
            return "(50,75]";
        } else if (valor <= 100.00) {
            return "(75,100])";
        }
        return "";
    }
}
