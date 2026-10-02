package vectors.exercise8.applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        System.out.println("Digite o valor do vetor A:");
        for (int i = 0; i < vect.length; i++){
        vect[i] = sc.nextInt();
        }

        int[] vect2 = new int[n];
        System.out.println("Digite o valor do vetor B:");
        for (int i = 0; i < vect2.length; i++){
        vect2[i] = sc.nextInt();
        }


        int[] vectR = new int [n];
        System.out.println("VETOR RESULTANTE");

        for (int i = 0; i < vectR.length; i++){
            vectR[i] = vect[i] + vect2[i];
            System.out.println(vectR[i]);
        }





    }
    
}
