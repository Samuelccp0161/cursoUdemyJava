package exercise8;

import java.util.Arrays;
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

        int[][] matrix = new int[lines][columns];

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println(Arrays.deepToString(matrix));
        }

        System.out.println("----------------------------------");

        System.out.print("What number your wanted: ");
        int index = scanner.nextInt();

        System.out.println("----------------------------------");

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                if (matrix[i][j] == index) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    else if (i > 0) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    else if (j < matrix[i].length-1) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    else if (i < matrix.length-1) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }
        System.out.println("----------------------------------");
        scanner.close();
    }

}


