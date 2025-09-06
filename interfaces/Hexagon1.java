package interfaces;
//Hexagon class that implements interfaces instead of extending Shape
public class Hexagon1 implements Calculable, Describable {
    String color, name;
    double side;
    //constructor
    public Hexagon1(String color, String name, double side) {
        this.color = color;
        this.name = name;
        this.side = side;
    }

    // Implement Calculable
    @Override
    public double calcArea() {
        return (3 * Math.sqrt(3) / 2) * side * side;
    }
    
    @Override
    public String getName(){
        return name;
    }

    // Implement Describable
    @Override
    public String description() {
        return "Hexagon: " + name + ", Color: " + color + ", Side: " + side;
    }
}