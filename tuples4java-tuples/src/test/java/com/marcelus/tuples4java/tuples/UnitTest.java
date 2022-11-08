package com.marcelus.tuples4java.tuples;


import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class UnitTest{

    @Test
    void unitSizeShouldAlwaysBe1(){
        // Given
        Unit<String> unit = Unit.of("Hello");

        // When
        Integer size = unit.size();

        // Then
        Assertions.assertEquals(1, size);
    }

    @Test
    void unitCanBeCreatedFromAnArrayOfSize1(){
        // Given
        Integer[] intArray = new Integer[]{1};

        // When
        Unit<Integer> unit = Unit.fromArray(intArray).get();

        // Then
        Assertions.assertEquals(1, unit.first());
    }

    @Test
    void unitFromArrayWillReturnFailWhenArraySizeIsDifferentFrom1(){
        // Given
        Integer[] intArray = new Integer[0];

        // When
        Either<EmptyTuple, Unit<Integer>> either = Unit.fromArray(intArray);

        // Then
        Assertions.assertTrue(either.isLeft());
    }

    @Test
    void unitFromArrayWillReturnEitherExceptionWhenArrayIsNull(){
        // Given
        Integer[] intArray = null;

        // When
        Either<EmptyTuple, Unit<Integer>> either = Unit.fromArray(intArray);

        // Then
        Assertions.assertTrue(either.isLeft());
    }

    @Test
    void unitFromListWillReturnEitherExceptionWhenListSizeIsDifferentFrom1(){
        // Given
        List<Boolean> list = Arrays.asList(true, true, false);

        // When
        Either<EmptyTuple, Unit<Boolean>> either = Unit.fromList(list);

        // Then
        Assertions.assertTrue(either.isLeft());
    }

    @Test
    void unitFromListWillReturnEitherExceptionWhenListIsNull(){
        // Given
        List<Integer> intList = null;

        // When
        Either<EmptyTuple, Unit<Integer>> either = Unit.fromList(intList);

        // Then
        Assertions.assertTrue(either.isLeft());
    }

    @Test
    void toStringShouldReturnValueWrappedBetweenParenthesis(){
        // Given
        String exceptedString = "(foo)" ;

        // When
        Unit<String> unit = Unit.of("foo");


        // Then
        Assertions.assertEquals(exceptedString, unit.toString());
    }

    @Test
    void testingWithFirstScenario(){
        // Given
        Unit<String> unit = Unit.of("foo"); ;

        // When
        Unit<String> modifiedUnit = unit.withFirst("bar");


        // Then
        Assertions.assertEquals("bar", modifiedUnit.first());
    }

}