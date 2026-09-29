package estrutCondic.exercises;

import java.util.Scanner;

public class Exercise5_1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
    int cod,quant;
    double cachorroQ = 4.00;
    double xSalada = 4.50;
    double xBacon = 5.00;
    double torrada = 2.00;
    double refri = 1.50;
    double total;

    cod = sc.nextInt();
    quant = sc.nextInt();

    switch(cod){
    case 1:    
        total = cachorroQ * quant;
        System.out.printf("Total = R$ %.2f", total);
        break;
    case 2:
        total = xSalada * quant;
        System.out.printf("Total = R$ %.2f", total);
        break;
    
   case 3:
        total = xBacon * quant;
        System.out.printf("Total = R$ %.2f", total);
        break;

   case 4:
        total = torrada * quant;
        System.out.printf("Total = R$ %.2f", total);
        break;
    
    case 5:
        total = refri * quant;
        System.out.printf("Total = R$ %.2f", total);
        break;
    
    default:
        System.out.println("Codigo não existe");
        break;
    }
    

    sc.close();
    


     
    }
    
}
