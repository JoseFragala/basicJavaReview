package estrutCondic.exercises;

import java.util.Scanner;

public class Exercice1 {

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int x;
        x = sc.nextInt();

        if (x >= 0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }
        

        sc.close();
    }
    
}
