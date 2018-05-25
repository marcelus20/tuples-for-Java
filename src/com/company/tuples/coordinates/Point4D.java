package com.company.tuples.coordinates;

import com.company.tuples.TupleOf4;

public class Point4D extends TupleOf4 implements Point {


    /**
     * All of the overloaded constructors points to the Double type parameters constructor (The middle one)
     * @param x
     * @param y
     * @param z
     * @param a
     */


    private Point4D(final Integer x, final Integer y, final Integer z, final Integer a){
        super(Double.valueOf(x), Double.valueOf(y), Double.valueOf(z), Double.valueOf(a));
    }

    private Point4D(final Double x, final Double y, final Double z, final Double a){
        super(x, y, z, a);
    }

    private Point4D(final String x, final String y, final String z, final String a){

        super(Double.valueOf(x), Double.valueOf(y), Double.valueOf(z), Double.valueOf(a));


    }

    public static Point4D point4D(final Integer x, final Integer y, final Integer z, final Integer a){
        return new Point4D(x, y, z, a);
    }

    public static Point4D point4D(final Double x, final Double y, final Double z, final Double a){
        return new Point4D(x, y, z, a);
    }

    public static Point4D point4D(final String x, final String y, final String z, final String a){
        return new Point4D(x, y, z, a);
    }












    @Override
    public Point4D scalePointBy(final Double scaler) {
        return new Point4D((Double)_1*scaler, (Double)_2*scaler, (Double)_3*scaler, (Double) _4*scaler);
    }

    @Override
    public Point4D scalePointBy(final Integer scaler) {
        return scalePointBy(Double.valueOf(scaler));
    }






    @Override
    public Point4D transLateX(final Integer translatorX) {
        return transLateX(Double.valueOf(translatorX));
    }

    @Override
    public Point4D transLateX(final Double translatorX) {
        return new Point4D((Double)_1,(Double) _2,(Double) _3, translatorX);
    }

    @Override
    public Point4D transLateX(final String translatorX) {
        return transLateX(Double.valueOf(translatorX));
    }





    @Override
    public Point4D translateY(final Integer translatorY) {
        return translateY(Double.valueOf(translatorY));
    }

    @Override
    public Point4D translateY(final Double translatorY) {
        return new Point4D((Double) _1,(Double) _2+translatorY, (Double)_3,(Double) _4);
    }

    @Override
    public Point4D translateY(final String translatorY) {
        return translateY(Double.valueOf(translatorY));
    }





    @Override
    public Point4D translateZ(final Integer translatorZ) {
        return translateZ(Double.valueOf(translatorZ));
    }

    @Override
    public Point4D translateZ(final Double translatorZ) {
        return new Point4D((Double) _1,(Double) _2, (Double)_3+translatorZ,(Double) _4);
    }

    @Override
    public Point4D translateZ(final String translatorZ) {
        return translateZ(Double.valueOf(translatorZ));
    }





    @Override
    public Point4D translateA(final Integer translatorA) {
        return translateA(Double.valueOf(translatorA));
    }

    @Override
    public Point4D translateA(final Double translatorA) {
        return new Point4D((Double)_1,(Double) _2, (Double)_3,(Double) _4+translatorA);
    }

    @Override
    public Point4D translateA(final String translatorA) {
        return translateA(Double.valueOf(translatorA));
    }
}
