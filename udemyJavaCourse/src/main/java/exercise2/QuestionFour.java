package exercise2;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------DIFFERENCE TIME-------------------");

        System.out.print("Type the start time: ");
        int startTime = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.print("Type the end time: ");
        int endTime = scanner.nextInt();

        System.out.println("---------------------------------------------");

        System.out.println("The time difference is: " + differenceTime(startTime, endTime));

        System.out.println("---------------------------------------------");

        scanner.close();
    }
    public static int differenceTime(int startTime, int endTime){
        int maximumValue = 24;
        int minimumValue = 0;
        int result = 0;

        if (startTime > endTime) {
            minimumValue = maximumValue - startTime;
            result = minimumValue + endTime;
        } else if (startTime == endTime) {
            result = maximumValue - minimumValue;
        } else {
            result = endTime - startTime;
        }
        return result;
    }
}
