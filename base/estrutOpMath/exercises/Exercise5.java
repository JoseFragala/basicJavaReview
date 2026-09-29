package estrutOpMath.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
    int codigoP1,numP1, codigoP2, numP2;
    double valorUnitP1, valorUnitP2, subtotal;

    codigoP1 = sc.nextInt();
    numP1 = sc.nextInt();
    valorUnitP1 = sc.nextDouble();
    codigoP2 = sc.nextInt();
    numP2 = sc.nextInt();
    valorUnitP2 = sc.nextDouble();

    subtotal = (valorUnitP1 * numP1)+ (valorUnitP2 * numP2);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", subtotal);

    sc.close();

        

    }
    
}
