package main;
import java.util.ArrayList;
import java.util.Scanner;

// Main class to test shapes
public class Main {
    public static void main(String[] args) {
        // Create lists for abstract class and interface implementations
        ArrayList<shapes.Shape> abstractList = new ArrayList<>();
        ArrayList<interfaces.Drawable> interfaceList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Prompt user for choice
        System.out.print("Please enter 1 to test interfaces or 2 to test abstract classes: ");
        int choice = scanner.nextInt();

        // Create a Circle, Rectangle, and Triangle using interfaces
        interfaceList.add(new interfaces.Circle(5.0));
        interfaceList.add(new interfaces.Rectangle(4.0, 6.0));
        interfaceList.add(new interfaces.Triangle(3.0, 4.0));

        // Create a Circle and Rectangle and triangle using abstract classes
        abstractList.add(new shapes.Circle("Red", "Circle", 5.0));
        abstractList.add(new shapes.Rectangle("Blue", "Rectangle", 4.0, 6.0));
        abstractList.add(new shapes.Triangle("Green", "Triangle", 3.0, 4.0) {});

        // Call describe, getArea, and draw for each shape
        if (choice == 1) {
            for (interfaces.Drawable shape : interfaceList) {
                shape.draw();
                if (shape instanceof interfaces.Describable) {
                    ((interfaces.Describable) shape).setColor("SomeColor");
                    ((interfaces.Describable) shape).printDescription("This is a describable shape.");
                }
                if (shape instanceof interfaces.Drawable) {
                    ((interfaces.Drawable) shape).draw();
                }
                if (shape instanceof interfaces.Calculable) {
                    System.out.println("Area: " + ((interfaces.Calculable) shape).getArea());
                }
            }
        } else if (choice == 2) {
        for (shapes.Shape shape : abstractList) {
            shape.draw();
            System.out.println(shape.describe());
            System.out.println("Area: " + shape.getArea());
        }
        }
        scanner.close();
        }   
    }

