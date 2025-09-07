package shapes;

/**
 * Abstract class representing a geometric shape.
 * Contains shared attributes and abstract methods that subclasses must implement.
 */
public abstract class Shape {
    /** The color of the shape */
    String color;

    /**
     * Constructs a Shape with the specified color.
     * @param color the color of the shape
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * Calculates and returns the area of the shape.
     * @return the area of the shape
     */
    public abstract double getArea();

    /**
     * Draws the shape (prints a description to the console).
     */
    public abstract void draw();

    /**
     * Provides a description of the shape's properties.
     * @return a string describing the shape
     */
    public abstract String describe();
}
