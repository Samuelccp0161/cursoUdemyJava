package exercise3;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityGasoline = 0;
        int quantityAlcohol = 0;
        int quantityDiesel = 0;

        System.out.print("Type the quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("---------------------------------------------");


        while (quantity != 4){
            System.out.println(fuelBill(quantity));
            if (quantity == 1){
                System.out.println((quantityAlcohol += 1));

                System.out.println("---------------------------------------------");
            } else if (quantity == 2) {
                System.out.println((quantityGasoline += 1));

                System.out.println("---------------------------------------------");
            } else if (quantity == 3) {
                System.out.println((quantityDiesel += 1));

                System.out.println("---------------------------------------------");
            }
            quantity = scanner.nextInt();
        }
        scanner.close();
    }
    public static String fuelBill(int x){
        if (x == 1){
            return "alcohol:";
        } else if (x == 2) {
            return "gasoline:";
        }else if (x == 3){
            return "diesel:";
        } else if (x == 4) {
            return "thank you!!";
        }
        return "";
    }
}
