package org.example;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codPecaUm, quantPecaUm;
        int codPecaDois, quantPecaDois;
        Double valorPecaUm, valorPecaDois, valorDasPecas;

        codPecaUm = scanner.nextInt();
        quantPecaUm = scanner.nextInt();
        valorPecaUm = scanner.nextDouble();

        codPecaDois = scanner.nextInt();
        quantPecaDois = scanner.nextInt();
        valorPecaDois = scanner.nextDouble();

        valorDasPecas = (valorPecaUm * quantPecaUm) + (valorPecaDois * quantPecaDois);

        System.out.println(valorDasPecas);

        scanner.close();
    }
}
