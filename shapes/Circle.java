package shapes;

public class Circle extends Shape implements interfaces.Calculable, interfaces.Describable {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }

    @Override
    public String describe() {
        return "You see a " + color + " circle with radius " + radius;
    }
    
}
