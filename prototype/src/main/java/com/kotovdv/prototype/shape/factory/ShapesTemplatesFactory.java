package com.kotovdv.prototype.shape.factory;

import com.kotovdv.prototype.exception.TemplateIsNotRegisteredException;
import com.kotovdv.prototype.shape.impl.Circle;
import com.kotovdv.prototype.shape.impl.Rectangle;
import com.kotovdv.prototype.shape.impl.Square;

/**
 * @author Dmitriy Kotov
 */
public class ShapesTemplatesFactory {

    private final Square squareTemplate;
    private final Rectangle rectangleTemplate;
    private final Circle circleTemplate;


    public ShapesTemplatesFactory(Square squareTemplate, Rectangle rectangleTemplate, Circle circleTemplate) {
        this.squareTemplate = squareTemplate;
        this.rectangleTemplate = rectangleTemplate;
        this.circleTemplate = circleTemplate;
    }

    /**
     * @return Square template
     * @throws TemplateIsNotRegisteredException if template was not specified during factory creation
     */
    public Square buildSquare() {
        if (squareTemplate == null) {
            throw new TemplateIsNotRegisteredException();
        }

        return squareTemplate.copy();
    }

    /**
     * @return Rectangle template
     * @throws TemplateIsNotRegisteredException if template was not specified during factory creation
     */
    public Rectangle buildRectangle() {
        if (rectangleTemplate == null) {
            throw new TemplateIsNotRegisteredException();
        }

        return rectangleTemplate.copy();
    }

    /**
     * @return Circle template
     * @throws TemplateIsNotRegisteredException if template was not specified during factory creation
     */
    public Circle buildCircle() {
        if (circleTemplate == null) {
            throw new TemplateIsNotRegisteredException();
        }

        return circleTemplate.copy();
    }

}