package shapes;

import interfaces.Calculable;
import interfaces.Describable;

/**
 * Represents a rectangle shape.
 * Implements Calculable and Describable interfaces.
 */
public class Rectangle extends Shape implements Calculable, Describable {
    /** The width of the rectangle */
    double width;

    /** The height of the rectangle */
    double height;

    /**
     * Constructs a Rectangle with the specified color, width, and height.
     * @param color the color of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates and returns the area of the rectangle.
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Draws the rectangle by printing details to the console.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }

    /**
     * Provides a description of the rectangle's properties.
     * @return a string describing the rectangle
     */
    @Override
    public String describe() {
        return "You see a " + color + " rectangle with width " + width + " and height " + height;
    }
}
