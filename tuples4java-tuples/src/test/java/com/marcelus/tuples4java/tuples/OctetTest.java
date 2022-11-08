package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


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

}