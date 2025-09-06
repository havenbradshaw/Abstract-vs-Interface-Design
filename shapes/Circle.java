package shapes;

//Circle class that fulfills all abstract Shape methods
public class Circle extends Shape {
    double radius;
    //constructor 
    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }
    //calculates the area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    //"Draws" the shape
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with radius " + radius);
    }
    //describe
    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with radius " + radius;
    }
    
}
