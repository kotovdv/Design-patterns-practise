package com.kotovdv.abstractfactory.selector.impl;

import com.kotovdv.abstractfactory.range.Range;
import com.kotovdv.abstractfactory.selector.Selector;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Dmitriy Kotov
 */
public class RandomIntegerSelector implements Selector<Integer> {

    @Override
    public Integer select(Range<Integer> range) {
        return ThreadLocalRandom.current().nextInt(range.from(), range.to());
    }
}
