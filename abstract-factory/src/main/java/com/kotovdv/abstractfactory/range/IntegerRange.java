package com.kotovdv.abstractfactory.range;

import com.kotovdv.abstractfactory.exception.LeftBorderIsGreaterThanRightBorderException;

/**
 * @author Dmitriy Kotov
 */
public class IntegerRange extends Range<Integer> {

    public static IntegerRange between(Integer from, Integer to) {
        if (from > to) {
            throw new LeftBorderIsGreaterThanRightBorderException(from.toString(), to.toString());
        }

        return new IntegerRange(from, to);
    }

    IntegerRange(Integer from, Integer to) {
        super(from, to);
    }
}
