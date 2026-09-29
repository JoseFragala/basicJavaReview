package estrutOpMath.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

    int numFunc;
    double horasTrab, valorHora, salary;

    numFunc = sc.nextInt();
    Locale.setDefault(Locale.US);
    horasTrab = sc.nextDouble();
    valorHora = sc.nextDouble();

    salary = horasTrab * valorHora;

    System.out.println("Number = " + numFunc);
    System.out.printf("Salary = %.2f%n", salary);

    sc.close();
    }
    
}
