package encapsulamento.exercise2.application;

import java.util.Locale;
import java.util.Scanner;
import encapsulamento.exercise2.entities.Customer;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        int acNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char answer = sc.next().charAt(0);

        Customer customer; 

        if (answer == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

             customer = new Customer(acNumber, name, initialDeposit);
        }
        else{
             customer = new Customer(acNumber, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(customer);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double money = sc.nextDouble();
        customer.deposit(money);
        System.out.println("Updated account data: ");
        System.out.println(customer);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        money = sc.nextDouble();
        customer.withdrawal(money);
        System.out.println("Updated account data: ");
        System.out.println(customer);





        sc.close();

    }
    
}
