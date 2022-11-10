package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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