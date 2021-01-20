package xyz.kandrac.practice10.exercise3;

import java.awt.*;

public class Pellet extends Point {

    private static final int radius = 10;

    public Pellet(double x, double y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawOval((int)x - radius / 2, (int)y - radius / 2, radius, radius);
    }
}
