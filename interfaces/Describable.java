package interfaces;

// Interface for describable shapes
public interface Describable {
    default void setColor(String color) {
        System.out.println("Setting color to: " + color);
    }
    default void printDescription(String description) {
        System.out.println(description);
    }
}
