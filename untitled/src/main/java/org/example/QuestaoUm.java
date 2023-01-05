package org.example;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, soma;

        x = scanner.nextInt();
        y = scanner.nextInt();

        soma = x + y;

        System.out.println(soma);

        scanner.close();
    }
}