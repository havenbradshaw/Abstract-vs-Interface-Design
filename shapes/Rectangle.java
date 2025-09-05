package shapes;

public class Rectangle extends Shape implements interfaces.Calculable, interfaces.Describable {
    double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }

    @Override
    public String describe() {
        return "You see a " + color + " rectangle with width " + width + " and height " + height;
    }
    
}
