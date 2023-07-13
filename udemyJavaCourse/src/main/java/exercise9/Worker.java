package exercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Worker {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        Worker worker = new Worker("", WorkerLevel.JUNIOR, 0.00 );

        worker.name = scanner.nextLine();
//        worker.level = scanner.nextInt();
        worker.baseSalary = scanner.nextDouble();

        worker.addContract(1);
        System.out.println();



        scanner.close();
    }
    String name;
    Level level;
    double baseSalary;

    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        level = level;
        this.baseSalary = baseSalary;
    }
    public void addContract(int quantityOfContract) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        HourContract hourContract = new HourContract(new Date(), 0,0);
        for (int i = 0; i < quantityOfContract; i++) {
            hourContract.hours = scanner.nextInt();
            hourContract.valuePerHour = scanner.nextDouble();
            String data = scanner.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("00/00/0000");
            Date date = format.parse(data);
        }
    }
}
