package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



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
}