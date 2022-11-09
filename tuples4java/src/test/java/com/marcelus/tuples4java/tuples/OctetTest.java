package com.marcelus.tuples4java.tuples;

import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class OctetTest {

    @Test
    void testingWithFirstScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a', new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road', false, 3.5, Blood Type A, a, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet.of("John", 25,
                "75, fictional road",false, 3.5, "Blood Type A", 'a', new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road', false, 3.5, Blood Type A, a, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a', new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road', false, 3.5, Blood Type A, a, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithFourthScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a', new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withFourth(true);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', true, 3.5, Blood Type A, a, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithFifthScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A", 'a',
                        new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withFifth(4.8);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 4.8, Blood Type A, a, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithSixthScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a', new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withSixth("Blood Type -O");


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 3.5, Blood Type -O, a, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithSeventhScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a', new ArrayList<>());

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withSeventh('b');


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 3.5, Blood Type A, b, [])", modifiedOctet.toString());
    }

    @Test
    void testingWithEighthScenario(){
        // Given
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> octet = Octet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A",
                        'a', new ArrayList<>());

        final List<Integer> newList = new ArrayList<>();
        newList.add(15);

        // When
        final Octet<String, Integer, String, Boolean, Double, String, Character, List<Integer>> modifiedOctet = octet.withEighth(newList);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 3.5, Blood Type A, a, [15])", modifiedOctet.toString());
    }

    @Test
    void fromArrayHappyScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false, true, true, false, null, false};

        // When
        final Either<EmptyTuple, Octet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean, Boolean>> octetEither = Octet.fromArray(array);

        // Then
        assertEquals("(false, false, false, true, true, false, null, false)", octetEither.get().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromArrayNullScenario(final Boolean[] array){
        // When
        final Either<EmptyTuple, Octet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean, Boolean>> octetEither = Octet.fromArray(array);

        // Then
        assertEquals("()", octetEither.getLeft().toString());
    }

    @Test
    void fromArrayWrongSizeScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false};

        // When
        final Either<EmptyTuple, Octet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean, Boolean>> octetEither = Octet.fromArray(array);

        // Then
        assertEquals("()", octetEither.getLeft().toString());
    }

    @Test
    void fromListHappyScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true, true, null, true);

        // When
        final Either<EmptyTuple, Octet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean, Boolean>> octetEither = Octet.fromList(array);

        // Then
        assertEquals("(false, false, false, true, true, true, null, true)", octetEither.get().toString());
    }

    @Test
    void fromListWrongSizeScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false);

        // When
        final Either<EmptyTuple, Octet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean, Boolean>> octetEither = Octet.fromList(array);

        // Then
        assertEquals("()", octetEither.getLeft().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromListNullScenario(final List<Boolean> array){
        // When
        final Either<EmptyTuple, Octet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean, Boolean, Boolean>> octetEither = Octet.fromList(array);

        // Then
        assertEquals("()", octetEither.getLeft().toString());
    }

    @Test
    void testingToList(){
        Assertions.assertEquals(8, Octet.of(1, true, 5.3, 1L, "foo",
                        "bar", "fizz", "buzz")
                .toList().size());
    }

    @Test
    void testingToArray(){
        Assertions.assertArrayEquals(new Object[]{1, true, 3.5, 1L, "foo", "bar", "fizz", "buzz"}, Octet.of(1,
                true,3.5, 1L,"foo", "bar", "fizz", "buzz").toArray());
    }

    @Test
    void checkingSize(){
        Assertions.assertEquals(8, Octet.of(false, false, "prince", 10,
                50, "foo", false, null).size());
    }
}