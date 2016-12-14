package com.kotovdv.abstractfactory.selector;

import com.kotovdv.abstractfactory.range.Range;

/**
 * @author Dmitriy Kotov
 */
public interface RandomValueSelector<T> {

    /**
     * Selects random value from given range from range.from() to range.to()
     *
     * @param range Given range of values
     * @return Random value from given range
     */
    T selectRandomValue(Range<T> range);

}
