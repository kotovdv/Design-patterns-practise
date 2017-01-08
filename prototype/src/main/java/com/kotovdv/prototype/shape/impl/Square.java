package com.kotovdv.prototype.shape.impl;

import com.kotovdv.prototype.exception.CopyFailedException;
import com.kotovdv.prototype.shape.Shape;
import com.kotovdv.prototype.shape.color.ShapeColor;

/**
 * @author Dmitriy Kotov
 */
public class Square implements Shape<Square>, Cloneable {

    private double side;
    private ShapeColor color;

    public Square(double side, ShapeColor color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public ShapeColor getColor() {
        return color;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color=" + color +
                '}';
    }

    @Override
    public Square copy() {
        try {
            return (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CopyFailedException(e);
        }
    }
}