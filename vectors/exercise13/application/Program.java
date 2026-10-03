package vectors.exercise13.application;

import java.util.Locale;
import java.util.Scanner;

import vectors.exercise13.entities.People;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        People[] peo = new People[n];

        for (int i = 0; i < peo.length; i++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            sc.nextLine();
            char gen = sc.nextLine().charAt(0);

            peo[i] = new People(height, gen);
        }

        double menor = peo[0].getHeight();

        for (int i = 0; i < peo.length; i++){
            if (peo[i].getHeight() < menor){
                menor = peo[i].getHeight();

            }
        }
        System.out.printf("Menor altura = %.2f%n", menor);


        double maior = peo[0].getHeight();

        for (int i = 0; i < peo.length; i++){
            if (peo[i].getHeight() > maior){
                maior = peo[i].getHeight();

            }
        }

        System.out.printf("Maior altura = %.2f%n", maior);


       double sumF = 0.0;
       int qF = 0;
       for (int i = 0; i < peo.length; i++){
        if (peo[i].getGen() == 'F'){
            sumF += peo[i].getHeight();
            qF++;
        }
       }

       double avg = sumF / qF;
       System.out.printf("Media das alturas das mulheres = %.2f%n", avg);

       
       int qM = 0;
       for (int i = 0; i < peo.length; i++){
        if (peo[i].getGen() == 'M'){
            qM++;
        }
       }

       System.out.println("Numero de homens = " + qM );

    }
    
}
