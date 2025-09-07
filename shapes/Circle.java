package shapes;

import interfaces.Calculable;
import interfaces.Describable;

/**
 * Represents a circle shape.
 * Implements Calculable and Describable interfaces.
 */
public class Circle extends Shape implements Calculable, Describable {
    /** The radius of the circle */
    double radius;

    /**
     * Constructs a Circle with the specified color and radius.
     * @param color the color of the circle
     * @param radius the radius of the circle
     */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the circle.
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Draws the circle by printing details to the console.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }

    /**
     * Provides a description of the circle's properties.
     * @return a string describing the circle
     */
    @Override
    public String describe() {
        return "You see a " + color + " circle with radius " + radius;
    }
}
