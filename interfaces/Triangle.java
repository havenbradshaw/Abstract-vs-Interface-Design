package interfaces;

// Interface for triangle shape implementing Describable, Calculable, and Drawable
public class Triangle  implements Describable, Calculable, Drawable{
    private double base, height;
    private String color;
    private String name;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.color = "Unknown";
        this.name = "Triangle";
    }

    // Overloaded constructor to set color and name
    public Triangle(double base, double height, String color, String name) {
        this.base = base;
        this.height = height;
        this.color = color;
        this.name = name;
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
    public double getArea() {
        return 0.5 * base * height;
    }



    @Override
    public void printDescription(String description) {
        System.out.println("Triangle: This is a " + color + " " + name + ". " + description);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
