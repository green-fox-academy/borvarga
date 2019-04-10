import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MaterialReview {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(new Color(7,126,37));
        graphics.drawLine(0, 0, 500, 500);
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(200, 200, 300, 300);

        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 5;

        graphics.setColor(Color.blue);
        graphics.fillPolygon(xpoints, ypoints, npoints);
        graphics.setColor(Color.red);
        graphics.drawString("Hello, World!", 200, 600 );



        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]



    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 650;

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