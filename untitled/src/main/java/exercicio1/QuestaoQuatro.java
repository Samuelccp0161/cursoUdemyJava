package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int func = scanner.nextInt(), horasTrabs = scanner.nextInt();
        double salarioPorHora = scanner.nextDouble();

        System.out.println("numero " + func);
        System.out.println("salario " + salario(horasTrabs, salarioPorHora));

        scanner.close();
    }
    public static double salario(int horasTrabs, double salarioPorHora){
        double salarioTotal = salarioPorHora * horasTrabs;

        return salarioTotal;
    }



}
