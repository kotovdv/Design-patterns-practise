package com.kotovdv.abstractfactory;

import com.kotovdv.abstractfactory.factory.RangeBasedValueSelectorFactory;
import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.Selector;

/**
 * @author Dmitriy Kotov
 */
public class Client<T> {

    private final RangeBasedValueSelectorFactory<T> rangeBasedValueSelectorFactory;

    public Client(RangeBasedValueSelectorFactory<T> rangeBasedValueSelectorFactory) {
        this.rangeBasedValueSelectorFactory = rangeBasedValueSelectorFactory;
    }

    public T pickValue(T from, T to) {
        Range<T> range = rangeBasedValueSelectorFactory.createRange(from, to);
        Selector<T> selector = rangeBasedValueSelectorFactory.createSelector();

        return selector.select(range);
    }
}
