package estrutRepet.lacoWhile.exercisesWhile;

import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

    int produto = 0;
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
            
    while (produto != 4){
        switch(produto){

            case 1:
                alcool += 1;
                break;
            case 2:
                gasolina +=1;
                break;
            case 3:
                diesel +=1;
                break;
            default:
                break;
            
        }
        produto = sc.nextInt();
    }
    System.out.println("MUITO OBRIGADO");
    System.out.printf("Alcool: " + alcool + "%n");
    System.out.printf("Gasolina: " + gasolina + "%n");
    System.out.printf("Diesel: " + diesel + "%n");


    sc.close();
    }
    
}
