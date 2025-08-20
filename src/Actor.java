import java.awt.Graphics;

public class Actor {
    // fields
    Cell position;

    // constructors
    public Actor(Cell inCell) {
        position = inCell;
    }

    // methods
    public void paint(Graphics g) {
        // Default implementation does nothing
        // Subclasses should override this method
    }    
}