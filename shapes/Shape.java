package shapes;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract void draw();
    public abstract String describe(); 

}