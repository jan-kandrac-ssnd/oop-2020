package xyz.kandrac.practice10.homework.lib;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Painter {

    private final JPanel panel;
    private final List<Shape> shapes = new ArrayList<>();

    public Painter() {
        JFrame frame = new JFrame();
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                shapes.forEach((c) -> c.draw((Graphics2D)g));
            }
        };
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        panel.repaint();
    }

    public List<Shape> getShapes() { return shapes; }

    public void removeShape(Shape shape) { shapes.remove(shape); panel.repaint(); }

    public void redraw() { panel.repaint(); }
}
