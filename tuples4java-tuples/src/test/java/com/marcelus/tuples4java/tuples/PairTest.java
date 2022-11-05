package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairTest {

    @Test
    void fromArrayShouldGeneratePairEvenIfElementsAreNotSameType(){
        // Given
        Object[] objects = new Object[]{"Foo", 12};

        //When
        Pair<Object, Object> pair = Pair.fromArray(objects).get();

        // Then
        Assertions.assertEquals(Pair.of("Foo", 12), pair);
    }


    @Test
    void toStringShouldReturnValueWrappedBetweenParenthesis(){
        // Given
        String exceptedString = "(foo, bar)" ;

        // When
        Pair<String, String> pair = Pair.of("foo", "bar");


        // Then
        Assertions.assertEquals(exceptedString, pair.toString());
    }

}