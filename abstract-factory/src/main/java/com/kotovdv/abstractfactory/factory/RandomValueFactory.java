package com.kotovdv.abstractfactory.factory;

import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.Selector;

/**
 * @author Dmitriy Kotov
 */
public interface RandomValueFactory<T> {

    /**
     * @param from leftBorder
     * @param to   rightBorder
     * @return Range object, representing set of data between left and right border
     */
    Range<T> createRange(T from, T to);

    /**
     * @return selector, which represents strategy how to select value across given range
     */
    Selector<T> createSelector();
}
