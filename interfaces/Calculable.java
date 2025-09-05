package interfaces;

public interface Calculable {
    default void printArea(double area) {
        System.out.println("The area is: " + area);
    }
}
