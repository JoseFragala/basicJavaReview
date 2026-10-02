package vectors.exercise6.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];


        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        int qPares = 0;
        for (int i =0; i < vect.length; i++){
            if (vect[i] % 2 ==0){
                qPares++;
                System.out.print(vect[i] + " ");
            
            }
        }


        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qPares);

        
    }
    
}
