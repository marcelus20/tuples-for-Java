package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairTest {


    @Test
    void toStringShouldReturnValueWrappedBetweenParenthesis(){
        // Given
        String exceptedString = "(foo, bar)" ;

        // When
        Pair<String, String> pair = Pair.of("foo", "bar");


        // Then
        Assertions.assertEquals(exceptedString, pair.toString());
    }

    @Test
    void testingWithFirstScenario(){
        // Given
        Pair<String, Integer> pair = Pair.of("John", 25); ;

        // When
        Pair<String, Integer> modifiedPair = pair.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25)", modifiedPair.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        Pair<String, Integer> pair = Pair.of("John", 25); ;

        // When
        Pair<String, Integer> modifiedPair = pair.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26)", modifiedPair.toString());
    }

    @Test
    void checkingSize(){
        Assertions.assertEquals(2, Pair.of(false, false).size());
    }

}