package exercise7;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------NUMBERS NEGATIVE-------------------");

        System.out.print("Type the name of student: ");

        String name = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Type the note one of student: ");

        double noteOne = scanner.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Type the note two of student: ");

        double noteTwo = scanner.nextDouble();

        System.out.println("----------------------------------");

        Student student = new Student(name, noteOne, noteTwo);
        Student[] students = new Student[]{student};

        System.out.println("approved student: " + Arrays.toString(listApproved(students)));

        System.out.println("----------------------------------");

        scanner.close();
    }

    String name;
    double noteOne;
    double noteTwo;

    public Student(String name, double noteOne, double noteTwo) {
        this.name = name;
        this.noteOne = noteOne;
        this.noteTwo = noteTwo;
    }
    public static String[] listApproved(Student[] students){
        int tamanho = 0;
        String[] listStudentsApproved;
        for (Student value : students) {
            if ((value.noteOne + value.noteTwo) / 2 >= 6) {
                tamanho++;
            }
        }

        listStudentsApproved = new String[tamanho];
        int i = 0;
        for (Student student : students) {
            if ((student.noteOne + student.noteTwo) / 2 >= 6) {
                listStudentsApproved[i++] = student.name;
            }
        }
        return listStudentsApproved;
    }



}
