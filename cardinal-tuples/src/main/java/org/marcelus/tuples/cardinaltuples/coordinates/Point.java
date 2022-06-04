package org.marcelus.tuples.cardinaltuples.coordinates;

/**
 * THis is just a list of the methods that the any Point will have.
 */

public interface Point {





    Point scalePointBy(final Double scaler);

    Point scalePointBy(final Integer scaler);





    Point translateX(final Integer translatorX);

    Point translateX(final String translatorX);

    Point translateX(final Double translatorX);



    Point translateY(final Double translatorY);

    Point translateY(final Integer translatorY);

    Point translateY(final String  translatorY);




    Point translateZ(final Integer translatorZ);

    Point translateZ(final Double translatorZ);

    Point translateZ(final String translatorZ);




    Point translateA(final Integer translatorA);

    Point translateA(final Double translatorA);

    Point translateA(final String translatorA);




}
