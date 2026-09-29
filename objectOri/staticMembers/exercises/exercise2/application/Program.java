package objectOri.staticMembers.exercises.exercise2.application;

import java.util.Locale;
import java.util.Scanner;

import objectOri.staticMembers.exercises.exercise2.util.CurrencyConverter;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

    System.out.print("What is the dollar price? ");
    CurrencyConverter.priceDollar = sc.nextDouble();

    System.out.print("How many dollars will be bought? ");
    CurrencyConverter.manyDollar = sc.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f%n ", CurrencyConverter.calc());

    }
}
