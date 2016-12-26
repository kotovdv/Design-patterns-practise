package com.kotovdv.abstractfactory.factory;

import com.kotovdv.abstractfactory.Client;
import com.kotovdv.abstractfactory.factory.impl.RandomLocalDateSelectorFactory;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dmitriy Kotov
 */
public class RandomLocalDateSelectorFactoryTest {

    @Test
    public void testGeneration() throws Exception {
        RandomLocalDateSelectorFactory factory = new RandomLocalDateSelectorFactory();
        Client<LocalDate> client = new Client<>(factory);

        LocalDate to = LocalDate.now();
        LocalDate from = to.minusDays(10);
        LocalDate pickedValue = client.pickValue(from, to);

        assertThat(pickedValue).isAfterOrEqualTo(from).isBeforeOrEqualTo(to);
    }
}