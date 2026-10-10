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
        List<Employe> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Employoee #" + (i + 1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.print("Id already exist, try again:  ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();
        
            emplo = new Employe(id, name, salary);
            list.add(emplo);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();

        Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        //Integer pos = position(list, id);
        if (emp == null){
            System.out.println("This id does not exist");

        }else{
            System.out.print("Enter the percentage: ");
            double percet = sc.nextDouble();
            emp.increaseSalary(percet);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employe x : list){
            System.out.println(x);
        }

    sc.close();

    }
    public static Integer position(List<Employe> list, int id){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employe> list, int id){
        Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}