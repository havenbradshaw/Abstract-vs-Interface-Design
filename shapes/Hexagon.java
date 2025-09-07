package shapes;

import interfaces.Calculable;
import interfaces.Describable;

/**
 * Represents a hexagon shape.
 * Implements Calculable and Describable interfaces.
 */
public class Hexagon extends Shape implements Calculable, Describable {
    /** The length of each side of the hexagon */
    double sideLength;

    /**
     * Constructs a Hexagon with the specified color and side length.
     * @param color the color of the hexagon
     * @param sideLength the length of each side of the hexagon
     */
    public Hexagon(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    /**
     * Calculates and returns the area of the hexagon.
     * @return the area of the hexagon
     */
    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }

    /**
     * Draws the hexagon by printing details to the console.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " hexagon with side length " + sideLength);
    }

    /**
     * Provides a description of the hexagon's properties.
     * @return a string describing the hexagon
     */
    @Override
    public String describe() {
        return "You see a " + color + " hexagon with side length " + sideLength;
    }
}
