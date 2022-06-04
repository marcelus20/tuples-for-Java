package org.marcelus.tuple;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TupleOf3Test{

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