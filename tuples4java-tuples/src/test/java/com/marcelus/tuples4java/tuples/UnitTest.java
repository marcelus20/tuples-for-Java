package com.marcelus.tuples4java.tuples;


import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;


public class UnitTest{

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
        Assertions.assertEquals(intArray[0], unit.first());
    }

    @Test
    void unitFromArrayWillReturnEitherExceptionWhenArraySizeIsDifferentFrom1(){
        // Given
        Integer[] intArray = new Integer[0];

        // When
        Either<Exception, Unit<Integer>> either = Unit.fromArray(intArray);

        // Then
        Assertions.assertTrue(either.getLeft() instanceof InvalidParameterException);
    }

    @Test
    void unitFromArrayWillReturnEitherExceptionWhenArrayIsNull(){
        // Given
        Integer[] intArray = null;

        // When
        Either<Exception, Unit<Integer>> either = Unit.fromArray(intArray);

        // Then
        Assertions.assertTrue(either.getLeft() instanceof InvalidParameterException);
    }

    @Test
    void unitFromListWillReturnEitherExceptionWhenListSizeIsDifferentFrom1(){
        // Given
        List<Boolean> list = Arrays.asList(true, true, false);

        // When
        Either<Exception, Unit<Boolean>> either = Unit.fromList(list);

        // Then
        Assertions.assertTrue(either.getLeft() instanceof InvalidParameterException);
    }

    @Test
    void unitFromListWillReturnEitherExceptionWhenListIsNull(){
        // Given
        List<Integer> intArray = null;

        // When
        Either<Exception, Unit<Integer>> either = Unit.fromList(intArray);

        // Then
        Assertions.assertTrue(either.getLeft() instanceof InvalidParameterException);
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

}