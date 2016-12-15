package com.kotovdv.abstractfactory.factory;

import com.kotovdv.abstractfactory.RangeBasedValueSelectorClient;
import com.kotovdv.abstractfactory.factory.impl.RandomIntegerSelectorFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dmitriy Kotov
 */
public class RandomIntegerSelectorFactoryTest {

    @Test
    public void testGeneration() {
        RandomIntegerSelectorFactory factory = new RandomIntegerSelectorFactory();
        RangeBasedValueSelectorClient<Integer> client = new RangeBasedValueSelectorClient<>(factory);

        int from = 10;
        int to = 100;
        Integer pickedValue = client.pickValue(from, to);

        assertThat(pickedValue).isBetween(from, to);
    }
}