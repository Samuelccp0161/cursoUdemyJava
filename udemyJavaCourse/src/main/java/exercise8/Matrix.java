package exercise8;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------MATRIX-------------------");

        System.out.print("Type the number of lines: ");
        int lines = scanner.nextInt();

        System.out.println("----------------------------------");

        System.out.print("Type the number of columns: ");
        int columns = scanner.nextInt();

        System.out.println("----------------------------------");

        System.out.println("Type the numbers desired for the matrix (" + lines + "x" + columns + "): ");
        int[][] array = new int[lines][columns];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.print("Type the number: ");
                addElements(array, scanner.nextInt());
            }
        }

        System.out.println("----------------------------------");

        System.out.print("What number your wanted: ");
        int index = scanner.nextInt();

        System.out.println("----------------------------------");

        System.out.println(position(array, index));

        System.out.println("----------------------------------");

        scanner.close();
    }

    public static String position(int[][] matrix, int index) {
        String position = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == index) {
                    if (!position.equals("")){
                        position += "\n";
                    }
                    position += "Position " + i + "," + j + ":\n";
                    if (j > 0) {
                        position += "Left: " + matrix[i][j - 1] + "\n";
                    }
                    if (i > 0) {
                        position += "Up: " + matrix[i-1][j] + "\n";
                    }
                    if (j < matrix[i].length-1) {
                        position += "Right: " + matrix[i][j+1] +"\n";
                    }
                    if (i < matrix.length-1) {
                        position += "Down: " + matrix[i+1][j];
                    }
                }
            }
        }

        return position;
    }
    public static void addElements(int[][] array, int x){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0){
                  array[i][j] = x;
                    return;
                }
            }
        }
    }
    public static int[][] getMatrix(int[][] array) {
    return array;
    }
}


