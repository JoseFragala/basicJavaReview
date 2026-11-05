package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class App {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle( 3.0, 2.0));
        myShapes.add(new Circle( 2.0));

        List<Circle> circle = new ArrayList<>();
        circle.add(new Circle(2.0));
        circle.add(new Circle(4.0));

        System.out.println("Total area shape list: " + totalArea(myShapes));
        System.out.println("Total area circle list: "+ totalArea(circle));

    }
    public static double totalArea(List<? extends Shape> list){
            double sum = 0.0;
            for (Shape s : list){
                sum += s.area();
            }
            return sum;
        }
}