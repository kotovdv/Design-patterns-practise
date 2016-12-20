package com.kotovdv.prototype;

import com.kotovdv.prototype.shape.Shape;
import com.kotovdv.prototype.shape.factory.ShapesTemplatesFactory;
import com.kotovdv.prototype.shape.impl.Circle;
import com.kotovdv.prototype.shape.impl.Rectangle;
import com.kotovdv.prototype.shape.impl.Square;

import java.util.Arrays;
import java.util.List;

import static com.kotovdv.prototype.shape.color.ShapeColor.*;

/**
 * @author Dmitriy Kotov
 */
public class ShapeEditorClient {

    private final ShapesTemplatesFactory shapesTemplatesFactory;

    public ShapeEditorClient(ShapesTemplatesFactory shapesTemplatesFactory) {
        this.shapesTemplatesFactory = shapesTemplatesFactory;
    }

    /**
     * Let' say we want to create
     * 1) big red circle
     * 2) medium green square
     * 3) small blue rectangles
     */
    public void doSomething() {
        Circle bigRedCircle = createBigRedCircle();
        Square mediumGreenSquare = createMediumGreenSquare();
        Rectangle smallBlueRectangle = createSmallBlueRectangle();

        List<Shape> shapes = Arrays.asList(bigRedCircle, mediumGreenSquare, smallBlueRectangle);

        processShapes(shapes);
    }

    private void processShapes(List<Shape> shapes) {
        //Do something meaningful over here
        System.out.println(shapes);
    }

    private Circle createBigRedCircle() {
        Circle circle = shapesTemplatesFactory.buildCircle();
        circle.setColor(RED);
        circle.setRadius(20.0d);

        return circle;
    }

    private Square createMediumGreenSquare() {
        Square square = shapesTemplatesFactory.buildSquare();
        square.setSide(10D);
        square.setColor(GREEN);

        return square;
    }

    private Rectangle createSmallBlueRectangle() {
        Rectangle rectangle = shapesTemplatesFactory.buildRectangle();
        rectangle.setHeight(1.0D);
        rectangle.setWidth(1.0D);
        rectangle.setColor(BLUE);

        return rectangle;
    }
}