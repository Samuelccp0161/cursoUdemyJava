package exercise11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------ORDER CLIENT-------------------");


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dateActual = new Date();

        System.out.print("Type the your name: ");
        String name = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Type the your email: ");
        String email = scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.print("Type the your birth date: ");
        String date = scanner.nextLine();
        Date dateFormatted = simpleDateFormat.parse(date);

        System.out.println("----------------------------------");

        Client client = new Client(name,email,dateFormatted);

        System.out.print("Type the process status: ");
        String status = scanner.nextLine();

        Order order = new Order(dateActual,  OrderStatus.valueOf(status), client);

        System.out.println("----------------------------------");

        System.out.print("How many items you desire: ");
        int quantityProduct = scanner.nextInt();
        scanner.nextLine();

        System.out.println("----------------------------------");

        for (int i = 0; i < quantityProduct; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");

            System.out.print("Type the name of product: ");
            String productName = scanner.nextLine();

            System.out.println("----------------------------------");

            System.out.print("Type the price of product: ");
            double price = scanner.nextDouble();

            System.out.println("----------------------------------");

            System.out.print("Type the quantity of product: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.println("----------------------------------");
            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity, product);

            order.addItem(orderItem);
        }

        System.out.println(order.summary());

        System.out.println("----------------------------------");

        scanner.close();
    }
}
