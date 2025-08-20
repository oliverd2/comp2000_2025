import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
import java.lang.Math;

public class Cell {
    int x, y, size;
    Color col = java.awt.Color.BLACK;

    Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void paintCell(Graphics g, Point mousePos) { 
        boolean isHovered = mousePos.getX() > x && mousePos.getX() < x+size && mousePos.getY() > y && mousePos.getY() < y+size;
        if (isHovered) {
            g.setColor(java.awt.Color.RED);
            g.fillRect(x, y, size, size);
        }

        g.setColor(java.awt.Color.BLACK);
        g.drawRect(x, y, size, size);

    }
}
