package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantPecaUm = scanner.nextInt(), quantPecaDois = scanner.nextInt();
        double valorPecaUm = scanner.nextDouble(), valorPecaDois = scanner.nextDouble();

        System.out.println(valorPecas(quantPecaUm, quantPecaDois,valorPecaUm, valorPecaDois));

        scanner.close();
    }
    public static double valorPecas(int qtdPecaUm, int qtdPecaDois, double valorPecaUm, double valorPecaDois){
        double valorTotalPecas = (valorPecaUm * qtdPecaUm) + (valorPecaDois * qtdPecaDois);
        return valorTotalPecas;
    }
}
