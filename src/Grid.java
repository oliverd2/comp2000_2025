import java.awt.Graphics;
import java.awt.Point;

public class Grid {
    int x, y;
    int rows = 20;
    Cell[][] cells;
    int cellSize = 35;

    Grid(int x, int y, int rows) {
        this.x = x;
        this.y = y;
        this.rows = rows;

        this.cells = makeCells();
    }

    Cell[][] makeCells() {
        Cell[][] cells = new Cell[this.rows][this.rows];
        for (int i = 0; i < this.rows; i++) {
            for (int k = 0; k < this.rows; k++) {
                cells[i][k] = new Cell(i*35+x, k*35+y, this.cellSize);
            }
        }
        return cells;
    }

    public void paintGrid(Graphics g, Point mousePos) {
        for (int i = 0; i < this.rows; i++) {
            for (int k = 0; k < this.rows; k++) {
                this.cells[i][k].paintCell(g, mousePos);
            }
        }
    }
}