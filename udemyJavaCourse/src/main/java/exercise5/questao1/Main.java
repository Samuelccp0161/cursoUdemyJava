package exercise5.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(0.0, 0.0);

        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();


        System.out.println(rectangle.area());
        System.out.println(rectangle.diagonal());
        System.out.println(rectangle.perimeter());
         scanner.close();

    }
}
