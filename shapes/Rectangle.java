package shapes;

public class Rectangle extends Shape {
    double width, height;

    public Rectangle(String color, String name, double width, double height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with width " + width + " and height " + height);
    }

    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with width " + width + " and height " + height;
    }
    
}
