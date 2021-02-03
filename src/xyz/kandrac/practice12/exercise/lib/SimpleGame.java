package xyz.kandrac.practice12.exercise.lib;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public abstract class SimpleGame extends Game implements MouseMotionListener, KeyListener {

    private boolean keyHold = false;

    public SimpleGame() {
        setMouseListener(this);
        setKeyListener(this);
    }

    public boolean isKeyHold() { return keyHold; }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyHold = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyHold = false;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
