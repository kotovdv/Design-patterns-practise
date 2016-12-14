package com.kotovdv.abstractfactory;

import com.kotovdv.abstractfactory.selector.Selector;
import com.kotovdv.abstractfactory.factory.RandomValueFactory;
import com.kotovdv.abstractfactory.range.Range;

/**
 * @author Dmitriy Kotov
 */
public class RandomValueGenerator<T> {

    private final RandomValueFactory<T> randomValueFactory;

    public RandomValueGenerator(RandomValueFactory<T> randomValueFactory) {
        this.randomValueFactory = randomValueFactory;
    }

    public T pickRandomValue(T from, T to) {
        Range<T> range = randomValueFactory.createRange(from, to);
        Selector<T> selector = randomValueFactory.createSelector();

        return selector.select(range);
    }
}
