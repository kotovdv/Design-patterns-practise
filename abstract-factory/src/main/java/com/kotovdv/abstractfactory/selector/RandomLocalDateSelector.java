package com.kotovdv.abstractfactory.selector;

import com.kotovdv.abstractfactory.range.Range;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Dmitriy Kotov
 */
public class RandomLocalDateSelector implements Selector<LocalDate> {

    @Override
    public LocalDate select(Range<LocalDate> range) {
        LocalDate from = range.from();
        LocalDate to = range.to();
        long daysBetween = getDaysBetween(from, to);

        return from.plusDays(ThreadLocalRandom.current().nextLong(daysBetween));
    }

    private long getDaysBetween(LocalDate from, LocalDate to) {
        return ChronoUnit.DAYS.between(from, to);
    }
}
