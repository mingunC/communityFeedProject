package org.cmgg919.common.domain;

import com.cmgg919.common.domain.PositiveIntegerCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveIntegerCounterTest {

    @Test
    void givenCreated_whenIncrease_thenCountIsOne() {
        //given
        PositiveIntegerCounter counter = new PositiveIntegerCounter();
        //when
        counter.increase();
        //then
        assertEquals(1,counter.getCount());
    }

    @Test
    void givenCreatedAndIncreased_whenDecrease_thenCountIsZero() {
        //given
        PositiveIntegerCounter counter = new PositiveIntegerCounter();
        //when
        counter.decrease();
        //then
        assertEquals(0,counter.getCount());
    }

    @Test
    void givenCreated_whenDecrease_thenCountIsZero() {
        //given
        PositiveIntegerCounter counter = new PositiveIntegerCounter();
        //when
        counter.decrease();
        //then
        assertEquals(0,counter.getCount());
    }
}
