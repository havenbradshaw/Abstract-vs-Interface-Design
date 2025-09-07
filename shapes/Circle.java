package shapes;

// Circle class extending Shape
public class Circle extends Shape {
    double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with radius " + radius);
    }

    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with radius " + radius;
    }
    
}
