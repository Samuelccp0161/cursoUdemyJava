package exercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int numberPair = scanner.nextInt();

            if (numberPair % 2 == 0){
                System.out.println(n);
            }else
                return;
        }


        scanner.close();
    }
    public static boolean pair(int[] number){
        for (int i = 0; i < number.length; i++){
            if (number[i] % 2 == 0){
                System.out.println();
                return true;
            } else return false;
        }
        return true;
    }
}
