package estrutOpMath.exercises;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int A,B,C,D, diferença;

    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();

    diferença = (A*B) - (C*D);   
    System.out.println("Diferença = " + diferença);
        
    }
    
}
