package com.kotovdv.abstractfactory.range;

import com.kotovdv.abstractfactory.exception.LeftBorderIsGreaterThanRightBorderException;
import org.junit.Test;

/**
 * @author Dmitriy Kotov
 */
public class IntegerRangeTest {

    @Test(expected = LeftBorderIsGreaterThanRightBorderException.class)
    public void testInvalidRanges() throws Exception {
        IntegerRange.between(10, 0);
    }
}
