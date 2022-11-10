package com.marcelus.tuples4java.tuples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
}