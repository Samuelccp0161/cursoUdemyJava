package exercicio2;

import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        impostoRenda(salario);

        scanner.close();
    }
    public static boolean impostoRenda(double salario){
        if (salario <= 2000.00){
            System.out.println("isento");
        } else if (salario <= 3000.00) {
            System.out.println((salario - 2000) * 0.08) ;
        } else if (salario <= 4500.00){
            System.out.println((salario - 3000) * 0.18 + 80);
        }else if (salario > 4500){
            System.out.printf("%.2f", (salario - 4500) * 0.28 + 80 + 270 );
        }
        return true;
    }
}
