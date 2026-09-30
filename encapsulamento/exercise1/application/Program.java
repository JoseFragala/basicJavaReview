package encapsulamento.exercise1.application;

import java.util.Locale;
import java.util.Scanner;

import encapsulamento.exercise1.entities.Product;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(850.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enten the number of product to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enten the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();

    }
}