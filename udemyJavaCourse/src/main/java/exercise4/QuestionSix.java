package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------CALCULATE DIVISORS-------------------");

        System.out.print("Type the desired number: ");

        int number = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("Type the number what your desired to calculate the divisor: " + calculateDivisors(number));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static List<Integer> calculateDivisors(int n) {
        List<Integer> values = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                values.add(i);
            }

        }
        return values;
    }
}
