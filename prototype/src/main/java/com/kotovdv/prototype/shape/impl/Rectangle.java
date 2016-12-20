package com.kotovdv.prototype.shape.impl;

import com.kotovdv.prototype.exception.CloneFailedException;
import com.kotovdv.prototype.shape.Shape;
import com.kotovdv.prototype.shape.color.ShapeColor;

/**
 * @author Dmitriy Kotov
 */
public class Rectangle implements Shape<Rectangle>, Cloneable {

    private double width;
    private double height;
    private ShapeColor color;

    public Rectangle(double width, double height, ShapeColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ShapeColor getColor() {
        return color;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }

    @Override
    public Rectangle copy() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneFailedException(e);
        }
    }
}