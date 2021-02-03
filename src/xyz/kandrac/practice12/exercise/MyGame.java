package xyz.kandrac.practice12.exercise;

import xyz.kandrac.practice12.exercise.lib.SimpleGame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MyGame extends SimpleGame {

    int mouseX = 0;
    int mouseY = 0;
    int keyX = 60;
    int keyY = 60;

    int ballX = 0;
    int ballY = 0;
    int ballDx = 5;
    int ballDy = 5;

    @Override
    public void update(Graphics2D graphics2D) {
        ballX += ballDx;
        ballY += ballDy;
        if (ballY >= 500) { ballDy = -5; }
        if (ballX >= 400) { ballDx = -5; }
        if (ballY <= 0) { ballDy = 5; }
        if (ballX <= 0) { ballDx = 5; }
        graphics2D.fillOval(ballX, ballY, 20, 20);
        graphics2D.fillOval(mouseX - 10, mouseY - 10, 20, 20);
        graphics2D.fillRect(keyX, keyY, 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> keyX -= 50;
            case KeyEvent.VK_UP -> keyY -= 50;
            case KeyEvent.VK_RIGHT -> keyX += 50;
            case KeyEvent.VK_DOWN -> keyY += 50;
        }
    }
}
