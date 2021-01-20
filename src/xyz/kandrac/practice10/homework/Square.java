package xyz.kandrac.practice10.homework;

import xyz.kandrac.practice10.homework.lib.Shape;

import java.awt.*;

public class Square extends Shape {

    @Override
    public void draw(Graphics2D g) {
        g.drawRect(10, 10, 100, 100);
    }
}
