package interfaces;
//Circle class that implements interfaces instead of extending Shape
public class Circle1 implements Calculable, Describable {
    String color, name;
    double radius;
    //constructor
    public Circle1(String color, String name, double radius) {
        this.color = color;
        this.name = name;
        this.radius = radius;
    }

    // Implement Calculable
    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName(){
        return name;
    }

    // Implement Describable
    @Override
    public String description() {
        return "Circle: " + name + ", Color: " + color + ", Radius: " + radius;
    }
}