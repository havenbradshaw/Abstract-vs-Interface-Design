package interfaces;


// Interface for rectangle shape implementing Drawable, Describable, and Calculable
public class Rectangle implements Drawable, Describable, Calculable {
    private double width, height;
    private String color;
    private String name;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "Unknown";
        this.name = "Rectangle";
    }

    // Overloaded constructor to set color and name
    public Rectangle(double width, double height, String color, String name) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }


    @Override
    public double getArea() {
        return width * height;
    }



    @Override
    public void printDescription(String description) {
        System.out.println("Rectangle: This is a " + color + " " + name + ". " + description);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    }
    

