import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
  // fields
  int x;
  int y;
  static int height = 35;
  static int width = 35;

  // constructors
  public Cell(int inX, int inY) {
    super(inX, inY, width, height);
    x = inX;
    y = inY;
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(Color.WHITE);
    }
    g.fillRect(x, y, width, height);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, width, height);
  }

  public boolean contains(Point p) {
    if(p != null) {
    return super.contains(p.getX(), p.getY());
    } else {
      return false;
    }
  }
}
