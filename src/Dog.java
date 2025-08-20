import java.awt.Color;
import java.awt.Graphics;

public class Dog extends Actor {
    public Dog(Cell inCell) {
        super(inCell);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW); // Example color for the dog
        g.fillOval(position.x, position.y, Cell.width, Cell.height);
    }
}
