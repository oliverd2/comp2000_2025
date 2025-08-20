import java.awt.Color;
import java.awt.Graphics;

public class Bird extends Actor {
    public Bird(Cell inCell) {
        super(inCell);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN); // Example color for the bird
        g.fillOval(position.x, position.y, Cell.width, Cell.height);
    }
    
}
