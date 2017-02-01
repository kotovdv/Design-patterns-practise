package com.kotovdv.command.drawing;

import com.kotovdv.command.figures.Rectangle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author Dmitriy Kotov
 */
public class DrawRedRectangleCommand implements DrawingCommand {

    private final Rectangle rectangle;
    private final GraphicsContext gc;

    public DrawRedRectangleCommand(Rectangle rectangle, GraphicsContext gc) {
        this.rectangle = rectangle;

        this.gc = gc;
    }

    @Override
    public void draw() {
        gc.setFill(Color.CRIMSON);
        gc.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getW(), rectangle.getH());
    }

    @Override
    public void erase() {
        gc.clearRect(rectangle.getX(), rectangle.getY(), rectangle.getW(), rectangle.getH());
    }
}