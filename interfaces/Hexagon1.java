package interfaces;

public class Hexagon1 implements Calculable, Describable {
    String color, name;
    double side;

    public Hexagon1(String color, String name, double side) {
        this.color = color;
        this.name = name;
        this.side = side;
    }

    // Implement Calculable
    @Override
    public double calcArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

    // Implement Describable
    @Override
    public String description() {
        return "Hexagon: " + name + ", Color: " + color + ", Side: " + side;
    }
}