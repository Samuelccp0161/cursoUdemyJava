package exercise7;

import java.util.Scanner;

public class OlderAge {
    String name;
    int age;
    public OlderAge(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public static int olderAge;
    public static int higherPosition;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------OLDER AGE-------------------");

        System.out.print("Type the quantity of numbers in vector: ");

        int numbers = scanner.nextInt();
        String[] names = new String[numbers];
        int[] ages = new int[numbers];

        System.out.println("---------------------------------------------");

        for (int i = 0; i < numbers; i++){
            System.out.print("Type the name of " + (i + 1) + " people: ");
            names[i] = scanner.next();

            System.out.print("Type the age of " + (i + 1) + " people: ");
            ages[i] = scanner.nextInt();

            System.out.println("---------------------------------------------");
        }

        olderAge = ages[0];
        higherPosition = 0;

        for (int i=1; i<numbers; i++) {
            if (ages[i] > olderAge) {
                olderAge = ages[i];
                higherPosition = i;
            }
        }

        System.out.printf("older people: %s\n", names[higherPosition]);

        scanner.close();
    }

    public static String getOlderPeople(OlderAge[] persons) {
        int age = 0;
        String name = "";
        for (int i = 0; i < persons.length; i++){
            if (persons[i].age > age){
                age = persons[i].age;
                name = persons[i].name;
            }
        }
        return name;
    }
}
