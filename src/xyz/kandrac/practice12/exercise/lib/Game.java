package xyz.kandrac.practice12.exercise.lib;

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class Game {

    private final Painter painter = new Painter(this::update);
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final Runnable gameLoop = painter::redraw;
    private ScheduledFuture<?> schedule;

    public void play() {
        schedule = scheduler.scheduleAtFixedRate(gameLoop, 0, 16, TimeUnit.MILLISECONDS);
    }

    public void pause() {
        schedule.cancel(true);
        schedule = null;
    }

    protected void setMouseListener(MouseMotionListener listener) {
        painter.setMouseListener(listener);
    }

    protected void setKeyListener(KeyListener listener) {
        painter.setKeyListener(listener);
    }

    protected abstract void update(Graphics2D graphics2D);

}
