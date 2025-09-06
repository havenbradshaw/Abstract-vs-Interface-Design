package shapes;

//Hexagon class that fulfills all abstract Shape methods
public class Hexagon extends Shape{
    double sideLength;
    //constructor
    public Hexagon(String color, String name, double sideLength) {
        super(color, name);
        this.sideLength = sideLength;
    }
    //calculates the area
    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
    }
    //"Draws" the shape
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name + " with side length " + sideLength);
    }
    //describe
    @Override
    public String describe() {
        return "You see a " + color + " " + name + " with 6 sides with side length " + sideLength;
    }
    

}
