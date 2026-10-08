package vectors.exercise14.application;

import java.util.Locale;
import java.util.Scanner;

import vectors.exercise14.entitie.Rent;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] ren = new Rent[10];

        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();


        for(int i = 1; i<=n; i++){
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            ren[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++){
            if (ren[i] != null){
                System.out.println(i + ": " + ren[i]);
            }
        }







        sc.close();
    }
    
}
