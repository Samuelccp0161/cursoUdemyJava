package exercise1;

import java.util.Locale;
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------PIECES, QUANTITY AND VALUES-------------------");

        System.out.print("Code first Piece: ");
        int codeFirstPiece = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Code second Piece: ");
        int codeSecondPiece = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Quantity first Piece: ");
        int quantityFirstPieces = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Quantity second Piece: ");
        int quantitySecondPieces = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Value first Piece: ");
        double valueFirstPieces = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.print("Value second Piece: ");
        double valueSecondPieces = scanner.nextDouble();

        System.out.println("---------------------------------------------");

        System.out.printf( "Amount to pay: %.2f\n", valuePieces(quantityFirstPieces, quantitySecondPieces,valueFirstPieces, valueSecondPieces));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static double valuePieces(int numberPiecesOne, int numberPiecesTwo, double valuePiecesOne, double valuePiecesTwo){
        return (valuePiecesOne * numberPiecesOne) + (valuePiecesTwo * numberPiecesTwo);
    }
}
