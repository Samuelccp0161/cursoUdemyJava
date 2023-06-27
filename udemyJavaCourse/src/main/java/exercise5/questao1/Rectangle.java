package exercise5.questao1;

import exercise6.Main;

import java.util.Scanner;

public class Rectangle {
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
