package com.kotovdv.abstractfactory.factory;

import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.RandomLocalDateSelector;
import com.kotovdv.abstractfactory.selector.RandomValueSelector;

import java.time.LocalDate;

import static com.kotovdv.abstractfactory.range.LocalDateRange.between;

/**
 * @author Dmitriy Kotov
 */
public class LocalDateRandomValueFactory implements RandomValueFactory<LocalDate> {

    @Override
    public Range<LocalDate> createRange(LocalDate from, LocalDate to) {
        return between(from, to);
    }

    @Override
    public RandomValueSelector<LocalDate> createSelector() {
        return new RandomLocalDateSelector();
    }
}
