package estrutRepet.lacoFor.exercisesFor;

import java.util.Scanner;

public class Exercise7 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i);
            int quad = (int) Math.pow(i,2);
            System.out.print(quad);
            int cub = (int) Math.pow(i,3);
            System.out.println(cub);
        }

        sc.close();
        
    }
    
}
