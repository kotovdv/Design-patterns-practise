package com.kotovdv.abstractfactory.factory.impl;

import com.kotovdv.abstractfactory.factory.RangeBasedValueSelectorFactory;
import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.Selector;
import com.kotovdv.abstractfactory.selector.impl.RandomIntegerSelector;

import static com.kotovdv.abstractfactory.range.impl.IntegerRange.between;

/**
 * @author Dmitriy Kotov
 */
public class RandomIntegerSelectorFactory implements RangeBasedValueSelectorFactory<Integer> {

    @Override
    public Range<Integer> createRange(Integer from, Integer to) {
        return between(from, to);
    }

    @Override
    public Selector<Integer> createSelector() {
        return new RandomIntegerSelector();
    }
}
