package shapes;

import interfaces.Calculable;
import interfaces.Describable;

public abstract class Triangle extends Shape implements Describable, Calculable {
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
