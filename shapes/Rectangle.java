package shapes;

//Rectangle class that fulfills all abstract Shape methods
public class Rectangle extends Shape{
    double width, height;
    //constructor
    public Rectangle(String color, String name, double width, double height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }
    //calculates the area
    @Override
    public double getArea() {
        return width * height;
    }
    //"Draws" the shape
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with width " + width + " and height " + height);
    }
    //describe
    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with 4 sides with width " + width + " and height " + height;
    }
    
    
}
