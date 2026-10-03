package vectors.exercise10.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for(int i =0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }


        double sumP = 0.0;
        int nP = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                sumP += vect[i];
                nP++;
            }
        }

        double avg = sumP / nP;

        if (sumP > 0){
            System.out.printf("MEDIA DOS PARES = %.2f%n", avg);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }
        

    }
}
