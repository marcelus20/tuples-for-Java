package com.marcelus.tuples4java.tuples;

import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class QuartetTest {

    @Test
    void testingWithFirstScenario(){
        // Given
        Quartet<String, Integer, String, Boolean> quartet = Quartet
                .of("John", 25, "75, fictional road", false);

        // When
        Quartet<String, Integer, String, Boolean> modifiedQuartet = quartet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road', false)", modifiedQuartet.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        Quartet<String, Integer, String, Boolean> quartet = Quartet.of("John", 25, "75, fictional road", false);

        // When
        Quartet<String, Integer, String, Boolean> modifiedQuartet = quartet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road', false)", modifiedQuartet.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        Quartet<String, Integer, String, Boolean> quartet = Quartet
                .of("John", 25, "75, fictional road", false);

        // When
        Quartet<String, Integer, String, Boolean> modifiedPair = quartet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road', false)", modifiedPair.toString());
    }

    @Test
    void testingWithFourthScenario(){
        // Given
        Quartet<String, Integer, String, Boolean> quartet = Quartet
                .of("John", 25, "75, fictional road", false);

        // When
        Quartet<String, Integer, String, Boolean> modifiedQuartet = quartet.withFourth(true);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', true)", modifiedQuartet.toString());
    }

    @Test
    void fromArrayHappyScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false, true};

        // When
        final Either<EmptyTuple, Quartet<Boolean, Boolean, Boolean, Boolean>> quartetEither = Quartet.fromArray(array);

        // Then
        assertEquals("(false, false, false, true)", quartetEither.get().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromArrayNullScenario(final Boolean[] array){
        // When
        final Either<EmptyTuple, Quartet<Boolean, Boolean, Boolean, Boolean>> quartetEither = Quartet.fromArray(array);

        // Then
        assertEquals("()", quartetEither.getLeft().toString());
    }

    @Test
    void fromArrayWrongSizeScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false};

        // When
        final Either<EmptyTuple, Quartet<Boolean, Boolean, Boolean, Boolean>> quartetEither = Quartet.fromArray(array);

        // Then
        assertEquals("()", quartetEither.getLeft().toString());
    }

    @Test
    void fromListHappyScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true);

        // When
        final Either<EmptyTuple, Quartet<Boolean, Boolean, Boolean, Boolean>> quartetEither = Quartet.fromList(array);

        // Then
        assertEquals("(false, false, false, true)", quartetEither.get().toString());
    }

    @Test
    void fromListWrongSizeScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true, null);

        // When
        final Either<EmptyTuple, Quartet<Boolean, Boolean, Boolean, Boolean>> quartetEither = Quartet.fromList(array);

        // Then
        assertEquals("()", quartetEither.getLeft().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromListNullScenario(final List<Boolean> array){
        // When
        final Either<EmptyTuple, Quartet<Boolean, Boolean, Boolean, Boolean>> quartetEither = Quartet.fromList(array);

        // Then
        assertEquals("()", quartetEither.getLeft().toString());
    }

    @Test
    void testingToList(){
        Assertions.assertEquals(4, Quartet.of(1, true, 5.3, 1L).toList().size());
    }

    @Test
    void testingToArray(){
        Assertions.assertArrayEquals(new Object[]{1, true, 3.5, 1L}, Quartet.of(1, true, 3.5, 1L).toArray());
    }

    @Test
    void checkingSize(){
        Assertions.assertEquals(4, Quartet.of(false, false, "prince", 10).size());
    }
}