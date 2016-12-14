package com.kotovdv.abstractfactory.selector;

import com.kotovdv.abstractfactory.range.Range;

/**
 * @author Dmitriy Kotov
 */
public interface Selector<T> {

    /**
     * Selects value from given range
     *
     * @param range Given range of values
     * @return Random value from given range
     */
    T select(Range<T> range);

}
