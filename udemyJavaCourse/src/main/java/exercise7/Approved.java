package exercise7;

import java.util.Scanner;

public class Approved {

    String name;
    double noteOne;
    double noteTwo;

    public Approved(String name, double noteOne, double noteTwo) {
        this.name = name;
        this.noteOne = noteOne;
        this.noteTwo = noteTwo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        scanner.close();
    }
    public static String[] listApproved(Approved[] students){
        int tamanho = 1;
        String[] listStudentsApproved;
        for (int i = 0; i < students.length; i++) {
            if ((students[i].noteOne + students[i].noteTwo) / 2 >= 6){
                tamanho++;
            }
        }

        listStudentsApproved = new String[tamanho];
        for (int i = 0; i < tamanho; i++){
            if ((students[i].noteOne + students[i].noteTwo) / 2 >= 6){
                listStudentsApproved[i] = students[i].name;
            }
        }
        return listStudentsApproved;
    }



}
