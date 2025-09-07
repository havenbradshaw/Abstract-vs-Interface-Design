package interfaces;

// Interface for drawable shapes
public interface Drawable {
    default void draw() {
        System.out.println("Drawing shape");
    }
}
