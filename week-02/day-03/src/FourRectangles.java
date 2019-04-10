import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawRect(0,0,100,100);
        graphics.setColor(Color.yellow);
        graphics.drawRect(75,75,50,50);
        graphics.setColor(Color.green);
        graphics.drawRect(50,50,100,100);
        graphics.setColor(Color.blue);
        graphics.drawRect(100,100,100,100);
        // draw four different size and color rectangles.
        // avoid code duplication.


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}