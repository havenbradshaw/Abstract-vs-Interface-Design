package main;
import interfaces.Calculable;
import interfaces.Circle1;
import interfaces.Describable;
import interfaces.Hexagon1;
import interfaces.Rectangle1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<shapes.Shape> shapes = new ArrayList<>();
        shapes.add(new shapes.Circle("Red", "Circle", 5.0));
        shapes.add(new shapes.Rectangle("Blue", "Rectangle", 4.0, 6.0));
        shapes.add(new shapes.Hexagon("Green", "Hexagon",5.0));

        // Loop through shapes and call all Shape methods (Abstract class)
        for (shapes.Shape shape : shapes) {
            System.out.println(shape.describe());
            System.out.println("Area: " + shape.getArea());
            shape.draw();
            System.out.println();
        }

        // Polymorphism with interfaces
        ArrayList<Calculable> calculables = new ArrayList<>();
        ArrayList<Describable> describables = new ArrayList<>();

        calculables.add(new Circle1("Red", "Circle", 5.0));
        calculables.add(new Hexagon1("Green", "Hexagon", 5.0));
        calculables.add(new Rectangle1("Blue", "Rectangle", 4.0, 6.0));

        describables.add(new Circle1("Red", "Circle", 5.0));
        describables.add(new Hexagon1("Green", "Hexagon", 5.0));
        describables.add(new Rectangle1("Blue", "Rectangle", 4.0, 6.0));

        System.out.println("Polymorphic interface calls:");
        for (Calculable c : calculables) {
            System.out.println(c.getName() + " Area: " + c.calcArea());
        }
        for (Describable d : describables) {
            System.out.println(d.description());
        }
    }
}

