package com.marcelus.tuples4java.tuples;

import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TripletTest {


    @Test
    void testingWithFirstScenario(){
        // Given
        final Triplet<String, Integer, String> triplet = Triplet.of("John", 25, "75, fictional road");

        // When
        final Triplet<String, Integer, String> modifiedPair = triplet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road')", modifiedPair.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        final Triplet<String, Integer, String> triplet = Triplet.of("John", 25, "75, fictional road");

        // When
        final Triplet<String, Integer, String> modifiedPair = triplet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road')", modifiedPair.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        final Triplet<String, Integer, String> triplet = Triplet.of("John", 25, "75, fictional road"); ;

        // When
        final Triplet<String, Integer, String > modifiedPair = triplet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road')", modifiedPair.toString());
    }

    @Test
    void fromArrayHappyScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false};

        // When
        final Either<EmptyTuple, Triplet<Boolean, Boolean, Boolean>> tripletEither = Triplet.fromArray(array);

        // Then
        assertEquals("(false, false, false)", tripletEither.get().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromArrayNullScenario(Boolean[] array){
        // When
        final Either<EmptyTuple, Triplet<Boolean, Boolean, Boolean>> tripletEither = Triplet.fromArray(array);

        // Then
        assertEquals("()", tripletEither.getLeft().toString());
    }

    @Test
    void fromArrayWrongSizeScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false, false, true};

        // When
        final Either<EmptyTuple, Triplet<Boolean, Boolean, Boolean>> tripletEither = Triplet.fromArray(array);

        // Then
        assertEquals("()", tripletEither.getLeft().toString());
    }

    @Test
    void fromListHappyScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false);

        // When
        final Either<EmptyTuple, Triplet<Boolean, Boolean, Boolean>> tripletEither = Triplet.fromList(array);

        // Then
        assertEquals("(false, false, false)", tripletEither.get().toString());
    }

    @Test
    void fromListWrongSizeScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true);

        // When
        final Either<EmptyTuple, Triplet<Boolean, Boolean, Boolean>> tripletEither = Triplet.fromList(array);

        // Then
        assertEquals("()", tripletEither.getLeft().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromListNullScenario(List<Boolean> array){
        // When
        final Either<EmptyTuple, Triplet<Boolean, Boolean, Boolean>> tripletEither = Triplet.fromList(array);

        // Then
        assertEquals("()", tripletEither.getLeft().toString());
    }
}