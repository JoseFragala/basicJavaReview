package estrutCondic.exercises;

import java.util.Scanner;

public class Exercise5 {

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

    if (cod == 1){
        total = cachorroQ * quant;
        System.out.printf("Total = R$ %.2f", total);
    }
    else if (cod == 2){
        total = xSalada * quant;
        System.out.printf("Total = R$ %.2f", total);
    }
    else if (cod == 3){
        total = xBacon * quant;
        System.out.printf("Total = R$ %.2f", total);
    }
    else if (cod == 4){
        total = torrada * quant;
        System.out.printf("Total = R$ %.2f", total);
    }
    else if (cod == 5){
        total = refri * quant;
        System.out.printf("Total = R$ %.2f", total);
    }
    else{
        System.out.println("Codigo não existe");
    }

    sc.close();
    


     
    }
    
}
