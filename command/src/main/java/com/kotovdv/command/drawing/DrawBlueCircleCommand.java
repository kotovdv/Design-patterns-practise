package com.kotovdv.command.drawing;

import com.kotovdv.command.figures.Circle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author Dmitriy Kotov
 */
public class DrawBlueCircleCommand implements DrawingCommand {

    private final Circle circle;
    private final GraphicsContext gc;

    public DrawBlueCircleCommand(Circle circle, GraphicsContext gc) {
        this.circle = circle;
        this.gc = gc;
    }

    @Override
    public void draw() {
        gc.setFill(Color.BLUE);

        double d = circle.getD();
        gc.fillOval(circle.getX(), circle.getY(), d, d);
    }

    @Override
    public void erase() {
        double d = circle.getD();

        gc.clearRect(circle.getX(), circle.getY(), d, d);
    }
}