package estrutCondic.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double x = sc.nextDouble();
        double imposto;


    	if (x <= 2000.0) {
			imposto = 0.0;
		}
		else if (x <= 3000.0) {
			imposto = (x - 2000.0) * 0.08;
		}
		else if (x <= 4500.0) {
			imposto = (x - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (x - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}

        sc.close();
    }
    
}
