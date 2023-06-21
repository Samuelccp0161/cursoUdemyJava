package exercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class DataPeople {
    enum Genero {F, M};
    Genero genero;
    double height;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Maior Idade-------------------");

        System.out.print("Quantos elementos vai ter o vetor: ");

        int n = scanner.nextInt();
        DataPeople[] dataPeople = new DataPeople[n];

        for (int i = 0; i < dataPeople.length; i++) {
            double height = scanner.nextDouble();
            String genero = scanner.next();
            DataPeople people = new DataPeople(height, genero);

        }

        System.out.println("---------------------------------------------");


//        for (int i = 0; i < n; i++) {
//            System.out.print("Digite a altura da " + (i + 1) + " pessoa: ");
//            altura[i] = scanner.nextDouble();
//
//            System.out.print("Digite o genero da " + (i + 1) + " pessoa: ");
//            genero[i] = scanner.next();
//        }

        System.out.println("----------------------ALTURA MAIS BAIXA-----------------------");

        DataPeople.shorterHeight(dataPeople);
//
//        double lowestPerson = altura[0];
//
//        for (int i = 0; i < altura.length; i++) {
//            if (altura[i] < lowestPerson){
//                lowestPerson = altura[i];
//            }
//        }
//        System.out.println(lowestPerson);

        System.out.println("----------------------ALTURA MAIS ALTA-----------------------");
        DataPeople.greaterHeight(dataPeople);
//        double tallerPerson = altura[0];
//
//        for (int i = 0; i < altura.length; i++) {
//            if (altura[i] > tallerPerson){
//                tallerPerson = altura[i];
//            }
//        }
//        System.out.println(tallerPerson);

        System.out.println("----------------------QUANTIDADE DE HOMENS-----------------------");
        DataPeople.amountMen(dataPeople);
//        String generoPerson = String.valueOf(Genero.M);
//
//        int amount = 0;
//        for (int i = 0; i < genero.length; i++) {
//            if (genero[i].equals(generoPerson)){
//                amount++;
//            }
//        }
//        System.out.println(amount);

        System.out.println("----------------------MEDIA DAS ALTURAS DAS MULHERES-----------------------");
        DataPeople.averageHeightWoman(dataPeople);
//        double sum = 0.0;
//        double media = 0.0;
//        int qtdMulheres = 0;
//
//        for (int i = 0; i < altura.length; i++) {
//            if (genero[i].equals(generoPerson)){
//                sum += altura[i];
//                qtdMulheres++;
//            }
//            media = sum / qtdMulheres;
//        }
//        System.out.println(media);

        scanner.close();
    }

    public DataPeople(double height, String genero) {
        this.height = height;
        this.genero = Genero.valueOf(genero);
    }

    public static double averageHeightWoman(DataPeople[] listPeople){
        double sum = 0.0;
        double media = 0.0;
        int qtdMulheres = 0;

        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].genero == Genero.F){
                sum += listPeople[i].height;
                qtdMulheres++;
            }
            media = sum / qtdMulheres;
        }
        return media;
    }
    public static double shorterHeight(DataPeople[] listPeople){
        double lowestPerson = listPeople[0].height;
        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].height < lowestPerson){
                lowestPerson = listPeople[i].height;
            }
        }
        return lowestPerson;
    }
    public static double greaterHeight(DataPeople[] listPeople){
        double tallerPerson = 0.0;
        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].height > listPeople[0].height){
                tallerPerson = listPeople[i].height;
            }
        }
        return tallerPerson;
    }
    public static int amountMen(DataPeople[] listPeople){
        int amount = 0;
        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].genero == Genero.M){
                amount++;
            }
        }
        return amount;
    }
}
