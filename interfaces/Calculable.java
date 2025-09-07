package interfaces;

// Interface for calculable shapes
public interface Calculable {
    double getArea();

    default void printArea(double area) {
        System.out.println("The area is: " + getArea());
    }
}
