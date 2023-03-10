package exercicio2;

import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        impostoRenda(salario);

        scanner.close();
    }
    public static String impostoRenda(double salario){
        if (salario <= 2000.00){
            return "Isento";
        } else if (salario <= 3000.00) {
            return (salario - 2000) * 0.08 + "" ;
            //8% de (salario - 2000).
        } else if (salario <= 4500.00){
            return (salario - 3000) * 0.18 + 80 + "";
            //18% de (salario - 3000) + 80 (valor da primeira taxa).
        }else if (salario > 4500){
            return (salario - 4500) * 0.28 + 80 + 270 + "";
            //28% de (salario - 4500) + 80 (valor da primeira taxa), 270 (valor da segunda taxa).
        }
        return "";
    }
}
