package exercise5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------STUDENT IS APPROVED-------------------");

        StudentGrade studentGrade = new StudentGrade("", 0.0, 0.0, 0.0);

        System.out.print("Name: ");
        studentGrade.name = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Grade one: ");
        studentGrade.grade1 = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Grade two: ");
        studentGrade.grade2 = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Grade three: ");
        studentGrade.grade3 = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.printf("Final grade the student: %.2f\n", studentGrade.grade());

        System.out.println("----------------------------------");

        System.out.println("The student passed: " + studentGrade.isApproved());

        System.out.println("----------------------------------");

        System.out.printf("Number of points left to pass: %.2f\n", studentGrade.differenceValue());

        System.out.println("----------------------------------");

        scanner.close();
    }
    double grade1;
    double grade2;
    double grade3;
    String name;
    double resultGrade;
    public StudentGrade(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public double grade(){
        resultGrade = grade1 + grade2 + grade3;
        return resultGrade;
    }
    public boolean isApproved(){
        resultGrade = grade1 + grade2 + grade3;
        return resultGrade > 60;
    }
    public double differenceValue(){
        double missing = (grade1 + grade2 + grade3) - 60;
        return Math.abs(missing);
    }
}
