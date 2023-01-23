package org.example;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int func, horasTrabs;
        Double salarioPorHora, salarioTotal;

        func = scanner.nextInt();
        horasTrabs = scanner.nextInt();
        salarioPorHora = scanner.nextDouble();

        salarioTotal = salarioPorHora * horasTrabs;

        System.out.println("numero " + func);
        System.out.println("salario " + salarioTotal);

        scanner.close();
    }



}
