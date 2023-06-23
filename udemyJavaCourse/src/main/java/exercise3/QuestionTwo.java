package exercise3;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Cartesian System-------------------");

        System.out.print("Type the value of X: ");
        int x = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the value of Y: ");
        int y = scanner.nextInt();

        System.out.println("---------------------------------------------");

        while (x != 0 && y != 0) {

            System.out.println("you are in the position: " + cartesianSystem(x, y));

            System.out.println("---------------------------------------------");

            System.out.print("Type the value of X again: ");
            x = scanner.nextInt();

            System.out.println("---------------------------------------------");

            System.out.print("Type the value of Y again: ");
            y = scanner.nextInt();

            System.out.println("---------------------------------------------");
        }
        scanner.close();
    }
    public static String cartesianSystem(int x, int y){

        if (x >= 0.01 && y >= 0.01) {
            return "first";
        } else if (x <= -0.01 && y >= 0.01) {
            return "second";
        } else if (x <= -0.01 && y <= -0.01) {
            return "third";
        } else if (x >= 0.01 && y <= -0.01){
            return "fourth";
        }else if (x == 0 && y == 0){
            return "";
        }
        return "";
    }

}
