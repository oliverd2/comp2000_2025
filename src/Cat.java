import java.awt.Color;
import java.awt.Graphics;

public class Cat extends Actor {
    public Cat(Cell inCell) {
        super(inCell);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE); // Example color for the cat
        g.fillOval(position.x, position.y, Cell.width, Cell.height);
    }
}
