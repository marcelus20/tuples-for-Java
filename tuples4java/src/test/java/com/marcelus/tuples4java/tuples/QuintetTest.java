package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class QuintetTest {

    @Test
    void testingWithFirstScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road', false, 3.5)", modifiedQuartet.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet.of("John", 25, "75, fictional road", false,
                3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road', false, 3.5)", modifiedQuartet.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedPair = quintet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road', false, 3.5)", modifiedPair.toString());
    }

    @Test
    void testingWithFourthScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withFourth(true);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', true, 3.5)", modifiedQuartet.toString());
    }

    @Test
    void testingWithFifthScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withFifth(4.8);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 4.8)", modifiedQuartet.toString());
    }
}