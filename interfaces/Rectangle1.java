package interfaces;

//Rectangle class that implements interfaces instead of extending Shape
public class Rectangle1 implements Calculable, Describable {
    String color, name;
    double width, height;
    
    //constructor
    public Rectangle1(String color, String name, double width, double height) {
        this.color = color;
        this.name = name;
        this.width = width;
        this.height = height;
    }

    // Implement Calculable
    @Override
    public double calcArea() {
        return width * height;
    }
    
    @Override
    public String getName(){
        return name;
    }

    // Implement Describable
    @Override
    public String description() {
        return "Rectangle: " + name + ", Color: " + color + ", Width: " + width + ", Height: " + height;
    }
}