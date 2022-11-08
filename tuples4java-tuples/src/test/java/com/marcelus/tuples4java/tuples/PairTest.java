package com.marcelus.tuples4java.tuples;

import io.vavr.control.Either;
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


    @Test
    void nullArrayScenario(){
        // Given
        Integer[] array = null ;

        // When
        Either<EmptyTuple, Pair<Integer, Integer>> either = Pair.fromArray(array);


        // Then
        Assertions.assertTrue(either.isLeft());
    }

    @Test
    void differentSizeArrayScenarioScenario(){
        // Given
        String[] array = new String[]{"foo", "bar", "fizz", "buzz"} ;

        // When
        Either either = Pair.fromArray(array);


        // Then
        Assertions.assertTrue(either.isLeft());
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

}