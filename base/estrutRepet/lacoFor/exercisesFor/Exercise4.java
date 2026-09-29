package estrutRepet.lacoFor.exercisesFor;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double result = 0.0;

        for (int i = 0; i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y == 0){
                System.out.println("divisao impossivel");
            }
            else{
                result = (double) x / y;
                System.out.printf("%.1f%n", result);
            }

        }

        sc.close();
    }
    
}
