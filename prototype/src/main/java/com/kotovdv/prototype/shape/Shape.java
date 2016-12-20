package com.kotovdv.prototype.shape;

/**
 * @author Dmitriy Kotov
 */
public interface Shape<T extends Shape> {

    /**
     * @return copy of shape object
     */
    T copy();
}
