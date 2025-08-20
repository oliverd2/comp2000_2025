import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      Grid newGrid = new Grid(10, 10, 20);


      @Override
      public void paint(Graphics g) {
        Point mousePos = getMousePosition();
        if (mousePos == null) {
          mousePos = new Point();
        }
        newGrid.paintGrid(g, mousePos);
      }
      
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
