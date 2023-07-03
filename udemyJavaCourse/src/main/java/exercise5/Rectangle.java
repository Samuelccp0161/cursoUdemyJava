package exercise5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------AREA, PERIMETER ANDA DIAGONAL OF RECTANGLE-------------------");

        Rectangle rectangle = new Rectangle(0.0, 0.0);

        System.out.print("Width: ");
        rectangle.width = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Height: ");
        rectangle.height = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.printf("AREA OF RECTANGLE: %.2f\n", rectangle.area());
        System.out.println("----------------------------------");

        System.out.printf("DIAGONAL OF RECTANGLE: %.2f\n", rectangle.diagonal());
        System.out.println("----------------------------------");

        System.out.printf("PERIMETER OF RECTANGLE: %.2f\n", rectangle.perimeter());
        System.out.println("----------------------------------");

        scanner.close();
    }
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);
    }
    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }
}
