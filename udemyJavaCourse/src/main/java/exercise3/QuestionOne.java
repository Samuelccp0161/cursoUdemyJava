package exercise3;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------PASSWORD CHECKER-------------------");

        System.out.print("Type your password: ");

        System.out.println("---------------------------------------------");

        String password = scanner.next();
        while (!password.equals("2002")){
            System.out.println("Invalid password");

            System.out.println("---------------------------------------------");

            password = scanner.next();
        }
        System.out.println("---------------------------------------------");

        System.out.println("Allowed access");

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static boolean passwordChecker(String password) {
        if (password.equals("2002"))
            return true;
        else
            return false;
    }


}
