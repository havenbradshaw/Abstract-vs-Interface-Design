package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import shapes.Circle;
import shapes.Hexagon;
import shapes.Rectangle;
import shapes.Shape;

/**
 * Main class providing a console menu to create and display shapes.
 * Demonstrates use of abstract classes, interfaces, and polymorphism.
 */
public class Main {
    /** Scanner for user input */
    static Scanner scan = new Scanner(System.in);

    /** List to store all created shapes polymorphically */
    static List<Shape> shapes = new ArrayList<>();

    /**
     * Program entry point.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        getMenu();
    }

    /**
     * Displays a menu to the user to create shapes or display all created shapes.
     * Runs until the user chooses to exit.
     */
    public static void getMenu() {
        while (true) {
            System.out.println("\nWhich shape would you like to create?");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Hexagon");
            System.out.println("4. Display All Created Shapes");
            System.out.println("5. Exit");
            System.out.print("Enter your answer as the corresponding number: ");

            String order = scan.nextLine();

            switch (order) {
                case "1" -> createRectangle();
                case "2" -> createCircle();
                case "3" -> createHexagon();
                case "4" -> displayAllShapes();
                case "5" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * Prompts the user for rectangle properties, creates the rectangle,
     * adds it to the shapes list, and displays its details.
     */
    private static void createRectangle() {
        System.out.print("Enter color for Rectangle: ");
        String color = scan.nextLine();

        System.out.print("Enter width for Rectangle: ");
        double width = Double.parseDouble(scan.nextLine());

        System.out.print("Enter height for Rectangle: ");
        double height = Double.parseDouble(scan.nextLine());

        Rectangle rectangle = new Rectangle(color, width, height);
        shapes.add(rectangle);

        rectangle.draw();
        System.out.println(rectangle.describe());
        System.out.println("Area: " + rectangle.getArea());
    }

    /**
     * Prompts the user for circle properties, creates the circle,
     * adds it to the shapes list, and displays its details.
     */
    private static void createCircle() {
        System.out.print("Enter color for Circle: ");
        String color = scan.nextLine();

        System.out.print("Enter radius for Circle: ");
        double radius = Double.parseDouble(scan.nextLine());

        Circle circle = new Circle(color, radius);
        shapes.add(circle);

        circle.draw();
        System.out.println(circle.describe());
        System.out.println("Area: " + circle.getArea());
    }

    /**
     * Prompts the user for hexagon properties, creates the hexagon,
     * adds it to the shapes list, and displays its details.
     */
    private static void createHexagon() {
        System.out.print("Enter color for Hexagon: ");
        String color = scan.nextLine();

        System.out.print("Enter side length for Hexagon: ");
        double side = Double.parseDouble(scan.nextLine());

        Hexagon hexagon = new Hexagon(color, side);
        shapes.add(hexagon);

        hexagon.draw();
        System.out.println(hexagon.describe());
        System.out.println("Area: " + hexagon.getArea());
    }

    /**
     * Displays all created shapes polymorphically by calling their
     * draw, describe, and getArea methods.
     * If no shapes exist, notifies the user.
     */
    private static void displayAllShapes() {
        if (shapes.isEmpty()) {
            System.out.println("No shapes created yet.");
            return;
        }

        System.out.println("\n--- All Created Shapes ---");
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape.describe());
            System.out.println("Area: " + shape.getArea());
            System.out.println();
        }
    }
}
