package exercise13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------PRODUCT-------------------");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Type quantity of products desired: ");
        List<Product> products = new ArrayList<>();
        int quantityProduct = scanner.nextInt();
        scanner.nextLine();

        System.out.println("----------------------------------");

        for (int i = 0; i < quantityProduct; i++) {
            System.out.print("Common, used or imported (c/u/i): ");

            String element = scanner.nextLine();

            System.out.println("----------------------------------");

            if (element.equals("c")){
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.println("----------------------------------");

                System.out.print("Price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("----------------------------------");

                Product product = new Product(name, price);
                products.add(product);

            } else if (element.equals("i")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.println("----------------------------------");

                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.println("----------------------------------");

                System.out.print("Customs fee: ");
                double custom = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("----------------------------------");

                Product productImported = new ImportedProduct(name, price, custom);
                products.add(productImported);
            } else if (element.equals("u")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.println("----------------------------------");

                System.out.print("Price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("----------------------------------");

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = scanner.nextLine();
                Date dateFormatted = dateFormat.parse(date);

                System.out.println("----------------------------------");
                Product productUsed = new UsedProduct(name, price, dateFormatted);
                products.add(productUsed);
            }
        }

        System.out.println("PRICE TAGS: ");
        for (int i = 0; i < quantityProduct; i++) {
            System.out.println(products.get(i).priceTag());
        }
        System.out.println("----------------------------------");

        scanner.close();
    }
}
