package exercise2;

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------RANGE-------------------");

        System.out.print("Type the value: ");
        double value = scanner.nextDouble();

        System.out.println("----------------------------------------");

        System.out.println("this value is in the range: " + ranges(value));

        System.out.println("----------------------------------------");

        scanner.close();
    }
    public static String ranges(double value){
        if (value < 0.00 || value > 100){
            return "value is out of range";
        } else if (value <= 25.00) {
            return "([0,25]";
        } else if (value <= 50.00) {
            return "(25,50]";
        } else if (value <= 75.00) {
            return "(50,75]";
        } else if (value <= 100.00) {
            return "(75,100])";
        }
        return "";
    }
}
