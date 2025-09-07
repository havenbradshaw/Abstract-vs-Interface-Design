package shapes;

// Triangle class extending Shape
public abstract class Triangle extends Shape {
    double base, height;

    public Triangle(String color, String name, double base, double height) {
        super(color, name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with base " + base + " and height " + height);
    }

    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with base " + base + " and height " + height;
    }
    
}
