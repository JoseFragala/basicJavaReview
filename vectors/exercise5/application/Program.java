package vectors.exercise5.application;

import java.util.Locale;
import java.util.Scanner;
import vectors.exercise5.entities.Person;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?");
        int quant = sc.nextInt();

        Person[] pers = new Person[quant];

        for (int i = 0; i < pers.length; i++){
            System.out.println("Dados da " + (i + 1) +"a " + "pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura : " );
            double height = sc.nextDouble();

            pers[i] = new Person(name, age, height); 

        }

        System.out.println();
        double sum = 0.0;
        for (int i = 0; i < pers.length; i++){
             sum += pers[i].getHeight();

        }
        double avg = sum / pers.length;


        int menores = 0;
        
        System.out.printf("Altura média: %.2f%n", avg);
        for (int i = 0; i < pers.length; i++){
            if (pers[i].getAge() < 16){
                menores +=1;
                
            }
        }
          
        double percMenores = (double) menores /pers.length * 100;
        System.out.println("Pessoas com menos de 16 anos: " + percMenores + "%");
        for (int a = 0; a < pers.length; a++){
            if (pers[a].getAge() < 16){
               System.out.println(pers[a].getName());
                
            }

        }
    
    }
}