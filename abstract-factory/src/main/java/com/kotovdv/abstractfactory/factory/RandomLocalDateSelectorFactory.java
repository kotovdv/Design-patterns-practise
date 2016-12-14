package com.kotovdv.abstractfactory.factory;

import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.RandomLocalDateSelector;
import com.kotovdv.abstractfactory.selector.Selector;

import java.time.LocalDate;

import static com.kotovdv.abstractfactory.range.LocalDateRange.between;

/**
 * @author Dmitriy Kotov
 */
public class RandomLocalDateSelectorFactory implements RangeBasedValueSelectorFactory<LocalDate> {

    @Override
    public Range<LocalDate> createRange(LocalDate from, LocalDate to) {
        return between(from, to);
    }

    @Override
    public Selector<LocalDate> createSelector() {
        return new RandomLocalDateSelector();
    }
}
