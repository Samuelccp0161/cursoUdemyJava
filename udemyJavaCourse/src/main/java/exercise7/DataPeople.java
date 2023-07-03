package exercise7;

import java.util.Scanner;

public class DataPeople {
    enum Gender {F, M};
    Gender gender;
    double height;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------OLDER AGE-------------------");

        System.out.print("How many elements will your vector have: ");

        int n = scanner.nextInt();
        DataPeople[] dataPeople = new DataPeople[n];

        for (int i = 0; i < dataPeople.length; i++) {
            System.out.println("---------------------------------------------");
            System.out.print("Enter the height of " + (i + 1) + " person: ");
            double height = scanner.nextDouble();
            System.out.print("Enter the gender of " + (i + 1) + " person: ");
            String gender = scanner.next();

            DataPeople people = new DataPeople(height, gender);
            dataPeople[i] = people;

            System.out.println("---------------------------------------------");
        }

        System.out.println("----------------------SHORTER HEIGHT-----------------------");

        System.out.printf("Shorter height: %.2f\n", DataPeople.shorterHeight(dataPeople));

        System.out.println("----------------------GREATER HEIGHT-----------------------");

        System.out.printf("Greater height: %.2f\n", DataPeople.greaterHeight(dataPeople));

        System.out.println("----------------------QUANTITY OF MEN-----------------------");

        System.out.println("Amount of men: " + DataPeople.amountMen(dataPeople));

        System.out.println("----------------------AVERAGE HEIGHT OF WOMEN-----------------------");

        System.out.printf("Average height of women: %.2f\n", DataPeople.averageHeightWoman(dataPeople));

        System.out.println("---------------------------------------------------------------------");

        scanner.close();
    }

    public DataPeople(double height, String gender) {
        this.height = height;
        this.gender = Gender.valueOf(gender);
    }

    public static double averageHeightWoman(DataPeople[] listPeople){
        double sum = 0.0;
        double average = 0.0;
        int quantityWoman = 0;

        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].gender == Gender.F){
                sum += listPeople[i].height;
                quantityWoman++;
            }
            average = sum / quantityWoman;
        }
        return average;
    }
    public static double shorterHeight(DataPeople[] listPeople){
        double lowestPerson = listPeople[0].height;
        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].height < lowestPerson){
                lowestPerson = listPeople[i].height;
            }
        }
        return lowestPerson;
    }
    public static double greaterHeight(DataPeople[] listPeople){
        double tallerPerson = listPeople[0].height;
        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].height > tallerPerson){
                tallerPerson = listPeople[i].height;
            }
        }
        return tallerPerson;
    }
    public static int amountMen(DataPeople[] listPeople){
        int amount = 0;
        for (int i = 0; i < listPeople.length; i++) {
            if (listPeople[i].gender == Gender.M){
                amount++;
            }
        }
        return amount;
    }
}
