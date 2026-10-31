package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tex payers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i = 0; i<n; i++){
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c) ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double ani = sc.nextDouble();

            if (resp == 'i'){
                System.out.print("Heath expenditures: ");
                double he = sc.nextDouble();

            list.add(new Individual(name, ani, he));
            }else{
                System.out.print("Number of employee: ");
                int ne = sc.nextInt();

            list.add(new Company(name, ani, ne));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double totalTax = 0.0;

        for (TaxPayer tp : list){
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
            totalTax += tp.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f%n", totalTax);

        

        
    }
}
