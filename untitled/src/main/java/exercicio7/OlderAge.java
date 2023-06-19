package exercicio7;

import java.util.Scanner;

public class OlderAge {
    public static int maiorIdade;
    public static int posicaoMaior;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++){
            names[i] = scanner.next();
            ages[i] = scanner.nextInt();
        }

        maiorIdade = ages[0];
        posicaoMaior = 0;

        posicaoMaior = getPosicaomaior(ages);

        System.out.printf("PESSOA MAIS VELHA: %s\n", names[posicaoMaior]);

        scanner.close();
    }

    public static int getPosicaomaior(int[] ages) {
        for (int i = 1; i< ages.length; i++) {
            if (ages[i] > maiorIdade) {
                maiorIdade = ages[i];
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }
}
