package estrutOpMath.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

    public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);

    double raio, area;
    double pi = 3.14159;

    System.out.println("Digite o valor do raio do circulo:");
    Locale.setDefault(Locale.US);
    raio = sc.nextDouble();

    area = pi * (Math.pow(raio, 2.0));

    System.out.printf("A = %.4f%n", area);



    sc.close();



    }


    
}
