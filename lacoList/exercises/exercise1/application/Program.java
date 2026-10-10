package lacoList.exercises.exercise1.application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import lacoList.exercises.exercise1.entities.Employe;

public class Program {
    public static void main (String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("How many employess will be registred? " );
        int n = sc.nextInt();

        Employe emplo;
        List<Employe> emp = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Employoee #" + (i + 1)+":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();
        
            emplo = new Employe(id, name, salary);
            emp.add(emplo);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();

        Employe employee = Employe.getById(emp, id);


        


        

        if (employee != null){
            System.out.println("Enter the percentage: ");
            Double perc = sc.nextDouble();
            employee.increaseSalary(perc);

        } else {
            System.out.println("Employee not found!");


        
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employe x : emp){
            System.out.println(x);
        }

    }
}