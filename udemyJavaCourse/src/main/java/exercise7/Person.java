package exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    public String name;
    public int age;
    public double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args) {
        Person person = new Person("", 0, 0.0);
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------NAME, AGE, Height-------------------");

        System.out.print("Type the quantity of numbers desired: ");

        int numbers = scanner.nextInt();

        int result = 0;
        double sum = 0.0;
        double averageHeight = 0.0;

        for (int i = 0; i < numbers; i++){

            System.out.print("Name of " + (i + 1) + " people: ");
            person.name = scanner.next();

            System.out.print("Age of " + (i + 1)+ " people: ");
            person.age = scanner.nextInt();

            System.out.print("Height of " + (i + 1) + " people: ");
            person.height = scanner.nextDouble();

            sum += person.height;

            System.out.println("---------------------------------");

            if (person.age < 16){
                result += 1;
                nameList.add(person.name);
            }
        }
        System.out.print("Average height: ");
        System.out.println(sum / numbers);

        System.out.print("People under 16 years old: ");
        System.out.println((100 * result) / numbers +"%");

        System.out.print("name of people under 16: ");
        for (int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
        System.out.println("----------------------------------------------------------------------------");

        scanner.close();
    }
    public static double averageHeight(Person[] person){
        double sum = 0.0;
        double averageHeight = 0.0;

        for(int i = 0; i < person.length; i++){
            sum += person[i].height;
        }
        averageHeight = sum / person.length;

        return averageHeight;
    }
    public static int numberOfMinors(Person[] person){
        int result = 0;

        for (int i = 0; i < person.length; i++){
          if (person[i].age < 16){
            result += 1                                                                                                                                                                                                                    ;
          }
        }
        return result;
    }
    public static ArrayList<String> nameOfMinors(Person[] person){
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i < person.length; i++){
            if (person[i].age < 16) {
                nameList.add(person[i].name);
            }
        }
        return nameList;
    }
}
