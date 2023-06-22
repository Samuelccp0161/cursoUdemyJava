package exercise5.questao1;

public class Retangulo {
    double width;
    double height;

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width * height;
    }
    public double perimetro(){
        return 2 * (width + height);
    }
    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }
}
