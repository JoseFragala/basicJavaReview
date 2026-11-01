package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter account data: ");
    System.out.print("Number ");
    int number = sc.nextInt();
    System.out.print("Holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.print("Initial balance: ");
    double bal = sc.nextDouble();
    System.out.print("Withdraw limit: ");
    double wdl = sc.nextDouble();

    System.out.println();
    System.out.print("Enter amount for withdraw: ");
    double wd2 = sc.nextDouble();

    Account account = new Account(number, holder, bal, wdl);

    try{
    account.withdraw(wd2);

    System.out.printf("New balance: %.2f%n", account.getBalance());
    }

    catch (DomainException e){
        System.out.println("Withdraw error: " + e.getMessage());
    }

    catch (RuntimeException e ){
        System.out.println("Unexpected error");
    }
    sc.close();

    
    }
}
