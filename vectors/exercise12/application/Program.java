package vectors.exercise12.application;

import java.util.Locale;
import java.util.Scanner;

import vectors.exercise12.entities.Student;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

    System.out.print("Quantos alunos serao digitados? ");
    int n = sc.nextInt();

    Student[] st = new Student[n];
    

    for (int i = 0; i < st.length; i++){
        System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno");
        sc.nextLine();
        String name = sc.nextLine();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        st[i] = new Student(name, n1, n2);
    }

    System.out.println("Alunos aprovados: ");
    for (int i = 0; i < st.length; i++){
        if ((st[i].getN1() + st[i].getN2()) / 2 >= 6.0){
            System.out.println(st[i].getName());
        }
    }



    }
    
}
