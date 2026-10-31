package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i<n; i++){
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Coloar (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (resp == 'r'){
                System.out.print("Width: ");
                double w = sc.nextDouble();
                System.out.print("Height: ");
                double h = sc.nextDouble();

            Shape shape = new Rectangle(color, w, h);

            list.add(shape);

            }else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

            Shape shape = new Circle(color, radius);

            list.add(shape);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape s : list){
            System.out.println(String.format("%.2f", s.area()));
            }

        sc.close();
        
}
}