package org.marcelus.tuples.cardinaltuples;


import org.junit.Test;
import org.marcelus.tuples.cardinaltuples.TupleOf4;

import static org.junit.Assert.assertEquals;

public class TupleOf4Test {

    @Test
    public void tupleOf4ShouldReturnTheCorrectToStringOfItsAttributes(){
        //given
        String name = "john";
        String surename = "doe";
        int age = 8;
        String sex = "male";
        //when
        TupleOf4<String> tupleOf4 = TupleOf4.tupleOf4(name, surename, age, sex);
        //then
        assertEquals(tupleOf4.toString(), "(john, doe, 8, male)");
    }
}