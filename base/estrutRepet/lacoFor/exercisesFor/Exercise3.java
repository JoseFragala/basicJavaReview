package estrutRepet.lacoFor.exercisesFor;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        double media = 0.0;

        for(int i = 0; i < n; i++){
            a = sc.nextDouble() * 2;
            b = sc.nextDouble() * 3;
            c = sc.nextDouble() * 5;

            media = (a + b + c)/10;

            System.out.printf("%.1f%n", media);
        }
    }
    
}
