package vectors.exercise3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
        public static void main (String[] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner (System.in);

            System.out.print("Quantos numeros voce vai digitar? ");
            int n = sc.nextInt();
            while (n <= 0 || n > 10){
                System.out.println(" Invalid amount, try again: ");
                n = sc.nextInt();
            }

            int [] vect = new int[n];
            for (int i = 0; i < vect.length; i ++){
                System.out.print("Digite um numero: ");
                vect[i] = sc.nextInt();


            }

            System.out.println("NUMEROS NEGATIVOS: ");
            for (int i =0; i < vect.length; i++){
                if (vect[i] < 0){
                    System.out.println(vect[i]);
                }
            }
            



            
        }
    
}
