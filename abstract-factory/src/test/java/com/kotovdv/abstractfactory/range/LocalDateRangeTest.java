package com.kotovdv.abstractfactory.range;

import com.kotovdv.abstractfactory.exception.LeftBorderIsGreaterThanRightBorderException;
import com.kotovdv.abstractfactory.range.impl.LocalDateRange;
import org.junit.Test;

import java.time.LocalDate;

/**
 * @author Dmitriy Kotov
 */
public class LocalDateRangeTest {

    @Test(expected = LeftBorderIsGreaterThanRightBorderException.class)
    public void testInvalidRange() {
        LocalDate now = LocalDate.now();
        LocalDateRange.between(now, now.minusDays(1));
    }
}