package com.kotovdv.abstractfactory.factory;

import com.kotovdv.abstractfactory.selector.Selector;
import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.RandomIntegerSelector;

import static com.kotovdv.abstractfactory.range.IntegerRange.between;

/**
 * @author Dmitriy Kotov
 */
public class IntegerRandomValueFactory implements RandomValueFactory<Integer> {

    @Override
    public Range<Integer> createRange(Integer from, Integer to) {
        return between(from, to);
    }

    @Override
    public Selector<Integer> createSelector() {
        return new RandomIntegerSelector();
    }
}
