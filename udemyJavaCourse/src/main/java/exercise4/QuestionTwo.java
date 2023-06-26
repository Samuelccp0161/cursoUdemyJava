package exercise4;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++){
            x[i] = scanner.nextInt();
        }
        System.out.println(in(x));
        System.out.println(out(x));

        scanner.close();
    }

    public static int in(int[] x){
        int in = 0;
        int out = 0;
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
