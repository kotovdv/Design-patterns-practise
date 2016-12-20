package com.kotovdv.prototype.shape.impl;

import com.kotovdv.prototype.exception.CloneFailedException;
import com.kotovdv.prototype.shape.Shape;
import com.kotovdv.prototype.shape.color.ShapeColor;

/**
 * @author Dmitriy Kotov
 */
public class Circle implements Shape<Circle>, Cloneable {

    private double radius;
    private ShapeColor color;

    public Circle(double radius, ShapeColor color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public ShapeColor getColor() {
        return color;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                '}';
    }

    @Override
    public Circle copy() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneFailedException(e);
        }
    }
}
