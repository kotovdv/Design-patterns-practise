package com.kotovdv.abstractfactory.range;

import com.kotovdv.abstractfactory.exception.LeftBorderIsGreaterThanRightBorderException;

import java.time.LocalDate;

/**
 * @author Dmitriy Kotov
 */
public class LocalDateRange extends Range<LocalDate> {

    public static LocalDateRange between(LocalDate from, LocalDate to) {
        if (from.isAfter(to)) {
            throw new LeftBorderIsGreaterThanRightBorderException(from.toString(), to.toString());
        }

        return new LocalDateRange(from, to);
    }

    LocalDateRange(LocalDate from, LocalDate to) {
        super(from, to);
    }
}
