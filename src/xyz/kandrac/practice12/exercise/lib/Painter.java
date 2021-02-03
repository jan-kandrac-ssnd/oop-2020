package xyz.kandrac.practice12.exercise.lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;
import java.util.Arrays;

public class Painter {

    private final JPanel panel;

    public Painter(OnPaint onPaint) {
        JFrame frame = new JFrame();
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                onPaint.paint((Graphics2D) g);
            }
        };
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void redraw() {
        panel.repaint();
    }

    public void setMouseListener(MouseMotionListener listener) {
        Arrays.stream(panel.getMouseMotionListeners()).forEach(panel::removeMouseMotionListener);
        panel.addMouseMotionListener(listener);
    }

    public void setKeyListener(KeyListener listener) {
        Arrays.stream(panel.getKeyListeners()).forEach(panel::removeKeyListener);
        panel.addKeyListener(listener);
        panel.setFocusable(true);
        panel.requestFocusInWindow();
    }

    public interface OnPaint {
        void paint(Graphics2D graphics);
    }
}
