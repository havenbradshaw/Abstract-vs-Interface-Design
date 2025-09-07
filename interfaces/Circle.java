package interfaces;

// Circle class implementing multiple interfaces
public class Circle implements Calculable, Describable, Drawable {
    private double radius;
    private String color;
    private String name;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Unknown";
        this.name = "Circle";
    }

    // Overloaded constructor to set color and name
    public Circle(double radius, String color, String name) {
        this.radius = radius;
        this.color = color;
        this.name = name;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printDescription(String description) {
        System.out.println("Circle: This is a " + color + " " + name + ". " + description);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
}
