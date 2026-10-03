package vectors.exercicio11.application;

import java.util.Locale;
import java.util.Scanner;

import vectors.exercicio11.entities.People;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();

        People[] peop = new People[n];
        for(int i = 0; i < peop.length; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            peop[i] = new People(name, age);
        }

        People maisV = peop[0];
        for(int i = 0; i < peop.length; i++){
            if(peop[i].getAge() > maisV.getAge()){
                maisV = peop[i];
            }

        }
        System.out.println("PESSOA MAIS VELHA: " + maisV.getName());

        
    }
    
}
