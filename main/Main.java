package main;

import java.util.Scanner;
import shapes.Circle;
import shapes.Hexagon;
import shapes.Rectangle;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        getMenu();
    }

    public static void getMenu() {
        while (true) {
            System.out.println("\nWhich shape would you like to create?");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Hexagon");
            System.out.println("4. Exit");
            System.out.print("Enter your answer as the corresponding number: ");

            String order = scan.nextLine();

            switch (order) {
                case "1" -> createRectangle();
                case "2" -> createCircle();
                case "3" -> createHexagon();
                case "4" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void createRectangle() {
        System.out.print("Enter color for Rectangle: ");
        String color = scan.nextLine();

        System.out.print("Enter width for Rectangle: ");
        double length = Double.parseDouble(scan.nextLine());

        System.out.print("Enter height for Rectangle: ");
        double height = Double.parseDouble(scan.nextLine());

        Rectangle rectangle = new Rectangle(color, length, height);

        rectangle.draw();
        System.out.println(rectangle.describe());
        System.out.println("Area: " + rectangle.getArea());
    }

    private static void createCircle() {
        System.out.print("Enter color for Circle: ");
        String color = scan.nextLine();

        System.out.print("Enter radius for Circle: ");
        double radius = Double.parseDouble(scan.nextLine());

        Circle circle = new Circle(color, radius);

        circle.draw();
        System.out.println(circle.describe());
        System.out.println("Area: " + circle.getArea());
    }

    private static void createHexagon() {
        System.out.print("Enter color for Hexagon: ");
        String color = scan.nextLine();

        System.out.print("Enter side length for Hexagon: ");
        double side = Double.parseDouble(scan.nextLine());

        Hexagon hexagon = new Hexagon(color, side);

        hexagon.draw();
        System.out.println(hexagon.describe());
        System.out.println("Area: " + hexagon.getArea());
    }
}
