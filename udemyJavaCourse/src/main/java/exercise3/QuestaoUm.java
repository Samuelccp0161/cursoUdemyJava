package exercise3;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.next();
        while (!senha.equals("2002")){
            System.out.println("Senha Invalida");
            senha = scanner.next();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
    public static boolean vereficarSenha(String senha) {
        if (senha.equals("2002"))
            return true;
        else
            return false;
    }


}
