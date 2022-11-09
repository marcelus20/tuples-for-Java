package com.marcelus.tuples4java.tuples;

import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SeptetTest {

    @Test
    void testingWithFirstScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSeptet = septet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road', false, 3.5, Blood Type A, a)", modifiedSeptet.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet.of("John", 25,
                "75, fictional road",false, 3.5, "Blood Type A", 'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSeptet = septet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road', false, 3.5, Blood Type A, a)", modifiedSeptet.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A", 'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSeptet = septet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road', false, 3.5, Blood Type A, a)", modifiedSeptet.toString());
    }

    @Test
    void testingWithFourthScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A", 'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSextet = septet.withFourth(true);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', true, 3.5, Blood Type A, a)", modifiedSextet.toString());
    }

    @Test
    void testingWithFifthScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A", 'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSeptet = septet.withFifth(4.8);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 4.8, Blood Type A, a)", modifiedSeptet.toString());
    }

    @Test
    void testingWithSixthScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A", 'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSeptet = septet.withSixth("Blood Type -O");


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 3.5, Blood Type -O, a)", modifiedSeptet.toString());
    }

    @Test
    void testingWithSeventhScenario(){
        // Given
        Septet<String, Integer, String, Boolean, Double, String, Character> septet = Septet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A", 'a');

        // When
        Septet<String, Integer, String, Boolean, Double, String, Character> modifiedSeptet = septet.withSeventh('b');


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 3.5, Blood Type A, b)", modifiedSeptet.toString());
    }

    @Test
    void fromArrayHappyScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false, true, true, false, null};

        // When
        final Either<EmptyTuple, Septet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean>> septetEither = Septet.fromArray(array);

        // Then
        assertEquals("(false, false, false, true, true, false, null)", septetEither.get().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromArrayNullScenario(final Boolean[] array){
        // When
        final Either<EmptyTuple, Septet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean>> septetEither = Septet.fromArray(array);

        // Then
        assertEquals("()", septetEither.getLeft().toString());
    }

    @Test
    void fromArrayWrongSizeScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false};

        // When
        final Either<EmptyTuple, Septet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean>> septetEither = Septet.fromArray(array);

        // Then
        assertEquals("()", septetEither.getLeft().toString());
    }

    @Test
    void fromListHappyScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true, true, null);

        // When
        final Either<EmptyTuple, Septet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean>> septetEither = Septet.fromList(array);

        // Then
        assertEquals("(false, false, false, true, true, true, null)", septetEither.get().toString());
    }

    @Test
    void fromListWrongSizeScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false);

        // When
        final Either<EmptyTuple, Septet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean>> septetEither = Septet.fromList(array);

        // Then
        assertEquals("()", septetEither.getLeft().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromListNullScenario(final List<Boolean> array){
        // When
        final Either<EmptyTuple, Septet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean>> septetEither = Septet.fromList(array);

        // Then
        assertEquals("()", septetEither.getLeft().toString());
    }
}