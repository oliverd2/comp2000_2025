import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
  ArrayList<Polygon> polys = new ArrayList<Polygon>();
  Cell loc;

  public void paint(Graphics g) {
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
  }
}
