package com.kotovdv.abstractfactory.range.impl;

import com.kotovdv.abstractfactory.exception.LeftBorderIsGreaterThanRightBorderException;
import com.kotovdv.abstractfactory.range.Range;

/**
 * @author Dmitriy Kotov
 */
public class IntegerRange extends Range<Integer> {

    IntegerRange(Integer from, Integer to) {
        super(from, to);
    }

    public static IntegerRange between(Integer from, Integer to) {
        if (from > to) {
            throw new LeftBorderIsGreaterThanRightBorderException(from.toString(), to.toString());
        }

        return new IntegerRange(from, to);
    }
}
