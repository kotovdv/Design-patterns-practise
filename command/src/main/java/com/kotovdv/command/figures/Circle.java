package com.kotovdv.command.figures;

/**
 * @author Dmitriy Kotov
 */
public class Circle {

    private final double x;
    private final double y;
    private final double r;
    private final double d;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.d = r * 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public double getD() {
        return d;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}