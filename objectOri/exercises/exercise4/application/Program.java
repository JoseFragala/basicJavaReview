package objectOri.exercises.exercise4.application;

import java.util.Locale;
import java.util.Scanner;

import objectOri.exercises.exercise4.entities.Student;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.tri1 = sc.nextDouble();
        student.tri2 = sc.nextDouble();
        student.tri3 = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE = " + student.fGrade());
        
        if (student.fGrade() >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("Missing " + student.missing() + " POINTS");
        }
    }
}
