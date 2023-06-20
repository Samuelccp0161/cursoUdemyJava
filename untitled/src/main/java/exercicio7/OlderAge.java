package exercicio7;

import java.util.Scanner;

public class OlderAge {
    String name;
    int age;
    public OlderAge(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public static int maiorIdade;
    public static int posicaoMaior;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Maior Idade-------------------");

        System.out.print("Quantos elementos vai ter o vetor: ");

        int n;
        n = scanner.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];

        System.out.println("---------------------------------------------");

        for (int i = 0; i < n; i++){
            System.out.print("Digite o nome da " + (i + 1) + " pessoa: ");
            names[i] = scanner.next();

            System.out.print("Digite a idade da " + (i + 1) + " pessoa: ");
            ages[i] = scanner.nextInt();

            System.out.println("---------------------------------------------");
        }

        maiorIdade = ages[0];
        posicaoMaior = 0;

        for (int i=1; i<n; i++) {
            if (ages[i] > maiorIdade) {
                maiorIdade = ages[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", names[posicaoMaior]);

        scanner.close();
    }

    public static String getMaiorIdade(OlderAge[] persons) {
        int age = 0;
        String name = "";
        for (int i = 0; i < persons.length; i++){
            if (persons[i].age > age){
                age = persons[i].age;
                name = persons[i].name;
            }
        }
        return name;
    }
}
