package exercise5.questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrade studentGrade = new StudentGrade("", 0.0, 0.0, 0.0);

        studentGrade.name = scanner.nextLine();
        studentGrade.grade1 = scanner.nextDouble();
        studentGrade.grade2 = scanner.nextDouble();
        studentGrade.grade3 = scanner.nextDouble();

        System.out.println(studentGrade.grade());
        System.out.println(studentGrade.isApproved());
        scanner.close();
    }
}
