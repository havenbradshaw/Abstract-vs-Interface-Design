package main;

public class Main {
    public static void main(String[] args) {
        // Create a Circle and Rectangle
    shapes.Shape circle = new shapes.Circle("Red", "Circle", 5.0);
    shapes.Shape rectangle = new shapes.Rectangle("Blue", "Rectangle", 4.0, 6.0);

        // Call describe, getArea, and draw for each shape
        circle.draw();
        System.out.println(circle.describe());
        System.out.println("Area: " + circle.getArea());

        rectangle.draw();
        System.out.println(rectangle.describe());
        System.out.println("Area: " + rectangle.getArea());
    }
}

