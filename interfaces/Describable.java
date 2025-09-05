package interfaces;

public interface Describable {
    default void printDescription(String description) {
        System.out.println(description);
    }
}
