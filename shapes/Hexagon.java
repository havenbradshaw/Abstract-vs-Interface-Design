package shapes;

public class Hexagon extends Shape {
    double sideLength;

    public Hexagon(String color, String name, double sideLength) {
        super(color, name);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with side length " + sideLength);
    }

    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with side length " + sideLength;
    }

}
