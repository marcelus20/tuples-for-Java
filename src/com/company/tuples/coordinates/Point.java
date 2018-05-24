package com.company.tuples.coordinates;

/**
 * THis is just a list of the methods that the any Point will have.
 */

public interface Point {





    Point scalePoint(final Double scaler);

    Point scalePoint(final Integer scaler);





    Point transLateX(final Integer translatorX);

    Point translateY(final Integer translatorY);

    Point translateZ(final Integer translatorZ);

    Point translateA(final Integer translatorA);

    Point transLateX(final Double translatorX);

    Point translateY(final Double translatorY);

    Point translateZ(final Double translatorZ);

    Point translateA(final Double translatorA);

    Point transLateX(final String translatorX);

    Point translateY(final String  translatorY);

    Point translateZ(final String translatorZ);

    Point translateA(final String translatorA);




}
