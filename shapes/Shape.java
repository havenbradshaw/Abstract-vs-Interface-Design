package shapes;

// Abstract Shape class
public abstract class Shape {
    String color;
    String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double getArea();
    public abstract void draw();
    public abstract String describe(); 

}