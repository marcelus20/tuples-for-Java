package org.marcelus.tuples.dynamictuples;


import org.junit.Test;
import org.marcelus.tuples.dynamictuples.exceptions.IndexOutBoundInTupleException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TupleTest {

    @Test
    public void TupleShouldGetInstanceOfStringIfStringWasPassedInTheArgument() throws IndexOutBoundInTupleException {
        //given
        String name = "Jane";
        String surename = "Doe";
        int age = 20;
        //when
        Tuple tuple = new Tuple(name, surename, age);
        //then
        assertTrue(tuple.get(0) instanceof String);
    }

    @Test
    public void TupleShouldReturnTheCorrectToString(){
        //given
        String name = "Jane";
        String surename = "Doe";
        int age = 20;
        //when
        Tuple tuple = new Tuple(name, surename, age);
        //then
        assertEquals("(Jane, Doe, 20)", tuple.toString());
    }

    @Test(expected = IndexOutBoundInTupleException.class)
    public void TupleShouldThrowAnExceptionWhenIndexIsOutOfBounds() throws IndexOutBoundInTupleException {
        //given
        String name = "Jane";
        String surename = "Doe";
        int age = 20;
        //when
        Tuple tuple = new Tuple(name, surename, age);
        //then
        tuple.get(100);
    }
}