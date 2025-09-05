package main;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<shapes.Shape> shapes = new ArrayList<>();
        // Create a Circle and Rectangle
        shapes.add(new shapes.Circle("Red", "Circle", 5.0));
        shapes.add(new shapes.Rectangle("Blue", "Rectangle", 4.0, 6.0));
        shapes.add(new shapes.Triangle("Green", "Triangle", 3.0, 4.0) {});

        // Call describe, getArea, and draw for each shape
        for (shapes.Shape shape : shapes) {
            shape.draw();
            System.out.println(shape.describe());
            System.out.println("Area: " + shape.getArea());
        }
    }
}

