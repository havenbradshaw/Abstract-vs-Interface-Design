package shapes;

public class Hexagon extends Shape implements interfaces.Calculable, interfaces.Describable {
    double sideLength;

    public Hexagon(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " hexagon with side length " + sideLength);
    }

    @Override
    public String describe() {
        return "You see a " + color + " hexagon with side length " + sideLength;
    }

}
