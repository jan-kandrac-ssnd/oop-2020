package xyz.kandrac.practice10.exercise3;

import java.awt.*;

public class PacMan extends Point {

    private static final int radius = 20;

    public PacMan(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawOval((int)x - radius / 2, (int)y - radius / 2, radius, radius);
    }
}
