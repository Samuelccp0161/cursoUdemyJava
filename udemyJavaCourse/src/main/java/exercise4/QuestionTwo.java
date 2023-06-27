package exercise4;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------Weighted Average-------------------");

        System.out.print("Type the desired number: ");

        int n = scanner.nextInt();

        System.out.println("---------------------------------------------");

        int[] x = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Type a number: ");
            x[i] = scanner.nextInt();
            System.out.println("---------------------------------------------");

        }
        System.out.println("quantity within range: " + in(x));
        System.out.println("quantity out of range: " + out(x));

        System.out.println("---------------------------------------------");

        scanner.close();
    }

    public static int in(int[] x){
        int in = 0;
        for (int number : x){
            if (number >= 10 && number <= 20) {
                in += 1;
            }
        }

        return in;
    }
    public static int out(int[] x){
        int out = 0;
        for (int number : x){
            if (number < 10 || number > 20)
                out += 1;
        }

        return out;
    }

}
