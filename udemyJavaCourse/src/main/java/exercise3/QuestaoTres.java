package exercise3;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdGasolina = 0;
        int qtdAlcool = 0;
        int qtdDiesel = 0;
        int x = scanner.nextInt();

        while (x != 4){
            System.out.println(combustivelCont(x));
            if (x == 1){
                System.out.println((qtdAlcool += 1));;
            } else if (x == 2) {
                System.out.println((qtdGasolina += 1));;
            } else if (x == 3) {
                System.out.println((qtdDiesel += 1));;
            }
            x = scanner.nextInt();
        }
        scanner.close();
    }
    public static String combustivelCont(int x){
        if (x == 1){
            return "Alcool:";
        } else if (x == 2) {
            return "Gasolina:";
        }else if (x == 3){
            return "Diesel:";
        } else if (x == 4) {
            return "Muito Obrigado";
        }
        return "";
    }
}
