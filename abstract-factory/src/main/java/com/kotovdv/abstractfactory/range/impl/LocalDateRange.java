package com.kotovdv.abstractfactory.range.impl;

import com.kotovdv.abstractfactory.exception.LeftBorderIsGreaterThanRightBorderException;
import com.kotovdv.abstractfactory.range.Range;

import java.time.LocalDate;

/**
 * @author Dmitriy Kotov
 */
public class LocalDateRange extends Range<LocalDate> {

    LocalDateRange(LocalDate from, LocalDate to) {
        super(from, to);
    }

    public static LocalDateRange between(LocalDate from, LocalDate to) {
        if (from.isAfter(to)) {
            throw new LeftBorderIsGreaterThanRightBorderException(from.toString(), to.toString());
        }

        return new LocalDateRange(from, to);
    }
}
