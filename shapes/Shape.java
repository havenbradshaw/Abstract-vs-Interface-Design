package shapes;

public abstract class Shape {
    String color;
    String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract double getArea();
    public abstract void draw();
    public abstract String describe(); 

}