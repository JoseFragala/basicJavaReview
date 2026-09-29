package estrutCondic.exercises;

import java.util.Scanner;

public class Exercise6 {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

    String interval1 = "(0,25]";
    String interval2 = "(25,50]";
    String interval3 = "(50,75]";
    String interval4 = "(75,100]";

    double n;

    n = sc.nextDouble();

    if (n >= 0 && n <=25){
        System.out.println("Intervalor: " + interval1);
    }
    else if (n > 25 && n <= 50){
        System.out.println("Intervalor: " + interval2);
    }
    else if (n > 50 && n <=75){
        System.out.println("Intervalor: " + interval3);
    }
    else if (n > 75 && n <=100){
        System.out.println("Intervalor: " + interval4);
    }
    else{
        System.out.println("Fora do intervalo");
    }

    sc.close();
    


        
    }
    
}
