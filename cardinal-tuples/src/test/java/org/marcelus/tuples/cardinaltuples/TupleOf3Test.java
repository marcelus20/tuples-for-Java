package org.marcelus.tuples.cardinaltuples;

import org.junit.Test;
import org.marcelus.tuples.cardinaltuples.TupleOf3;

import static org.junit.Assert.assertEquals;

public class TupleOf3Test {

    @Test
    public void tupleOf3ShouldInstantiateCorrectly(){
        //Given
        String _1 = "Hello";
        int _2 = 5;
        boolean _3 = false;
        // When
        TupleOf3 tupleOf3 = TupleOf3.tupleOf3(_1, _2, _3);
        // Then
        assertEquals(tupleOf3._1, "Hello");
    }

}