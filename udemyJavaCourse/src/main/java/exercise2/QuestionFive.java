package exercise2;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------VALUE SNACK OF VALUE-------------------");

        System.out.print("Type the code of your snack: ");
        int code = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the amount of snack: ");
        int quantity = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.printf("the total value of your snack is: R$ %.2f\n", lunchValue(code, quantity));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static double lunchValue(int code, int quantity){
        double value = 0;

        if (code == 1){
            value = 4.00;
        }else if (code == 2){
            value = 4.50;
        }else if (code == 3){
            value = 5.00;
        }else if (code == 4){
            value = 2.00;
        }else if(code == 5){
            value = 1.50;
        }else
            System.out.println("Please enter a valid code");

        return value * quantity;
    }
}
