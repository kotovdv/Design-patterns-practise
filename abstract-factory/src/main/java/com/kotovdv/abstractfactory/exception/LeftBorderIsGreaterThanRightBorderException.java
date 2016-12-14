package com.kotovdv.abstractfactory.exception;

/**
 * @author Dmitriy Kotov
 */
public class LeftBorderIsGreaterThanRightBorderException extends RuntimeException {

    public LeftBorderIsGreaterThanRightBorderException(String leftBorder, String rightBorder) {
        super(String.format("Left border [%s] is greater than right border [%s]", leftBorder, rightBorder));
    }
}
