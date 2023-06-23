package exercise2;

import java.util.Locale;
import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------INCOME TAX-------------------");

        System.out.print("Type the your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.println("Value of income tax: " + incomeTax(salary));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static String incomeTax(double salary){
        if (salary <= 2000.00){
            return "Tax exempt";
        } else if (salary <= 3000.00) {
            return (salary - 2000) * 0.08 + "" ;
            //8% de (salary - 2000).
        } else if (salary <= 4500.00){
            return (salary - 3000) * 0.18 + 80 + "";
            //18% de (salary - 3000) + 80 (first rate amount).
        }else if (salary > 4500){
            return (salary - 4500) * 0.28 + 80 + 270 + "";
            //28% de (salary - 4500) + 80 (first rate amount), 270 (second rate amount).
        }
        return "";
    }
}
