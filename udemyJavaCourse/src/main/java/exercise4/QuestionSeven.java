package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------NUMBER, SQUARE AND CUBE-------------------");

        System.out.print("Type the desired number: ");

        int number = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("The number, square and cube are: " + squareAndCube(number));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static List<Integer> squareAndCube(int x){
        List<Integer> results = new ArrayList<>();
            results.add(x);
            results.add(x*x);
            results.add(x*x*x);
        return results;
    }
}
