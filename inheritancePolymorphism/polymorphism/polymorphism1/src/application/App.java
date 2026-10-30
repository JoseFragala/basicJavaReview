package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);    


        System.out.print("Enter the number of employees:");
        int n = sc.nextInt();

        List<Employee> employee = new ArrayList<>();

        for(int i = 0; i<n; i++){
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char response = sc.next().charAt(0);

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double vh = sc.nextDouble();
                 if(response == 'y'){
                System.out.print("Additional charge: ");
                double ad = sc.nextDouble();

                employee.add(new OutsourcedEmployee(name, hours, vh, ad));

                }else{
                employee.add(new Employee(name, hours, vh));
        }

    }
      System.out.println();

                System.out.println("PAYMENTS: ");
                for (Employee c : employee){
                    System.out.println(c.getName() + " - $" + String.format("%.2f", c.payment()));
                }

    }

}