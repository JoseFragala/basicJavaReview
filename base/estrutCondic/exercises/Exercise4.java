package estrutCondic.exercises;

import java.util.Scanner;

public class Exercise4 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        int HrIn, HrFn;

        HrIn = sc.nextInt();
        HrFn = sc.nextInt();

        int duracao;

        if (HrIn < HrFn){
            duracao = HrFn - HrIn;
        }
        else {
            duracao = 24 - HrIn + HrFn;
        }

        System.out.println(" o jogo durou " + duracao + "Horas(s)");

        sc.close();

    }
    
}
