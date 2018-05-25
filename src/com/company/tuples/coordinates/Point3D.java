package com.company.tuples.coordinates;

import com.company.tuples.TupleOf3;

public class Point3D extends TupleOf3 implements Point {


    /**
     * All of the overloaded constructors points to the Double type parameters constructor (The middle one)
     * @param x
     * @param y
     * @param z
     */



    private Point3D(final Integer x, final Integer y, final Integer z){
        super(x, y, z);
    }

    private Point3D(final Double x, final Double y, final Double z){
        super(x, y, z);
    }

    private Point3D(final String x, final String y, final String z){

        super(Double.parseDouble(x), Double.parseDouble(y), Double.parseDouble(z));


    }

    public static Point3D point3D(final Integer x, final Integer y, final Integer z){
        return new Point3D(Double.valueOf(x), Double.valueOf(y), Double.valueOf(z));
    }

    public static Point3D point3D(final Double x, final Double y, final Double z){
        return new Point3D(x, y, z);
    }

    public static Point3D point3D(final String x, final String y, final String z){
        return new Point3D(Double.valueOf(x), Double.valueOf(y), Double.valueOf(z));
    }





    @Override
    public Point3D scalePointBy(final Double scaler) {
        return new Point3D((Double)_1*scaler, (Double)_2*scaler, (Double)_3*scaler);
    }

    @Override
    public Point3D scalePointBy(final Integer scaler) {
        return scalePointBy(Double.valueOf(scaler));
    }



    @Override
    public Point3D translateX(final Integer translatorX) {
        return translateX(Double.valueOf(translatorX));
    }

    @Override
    public Point3D translateX(final Double translatorX) {
        return new Point3D((Double)_1+translatorX, (Double)_2, (Double)_3);
    }

    @Override
    public Point3D translateX(final String translatorX) {
        return translateX(Double.valueOf(translatorX));
    }





    @Override
    public Point3D translateY(final Integer translatorY) {
        return translateY(Double.valueOf(translatorY));
    }

    @Override
    public Point3D translateY(final Double translatorY) {
        return new Point3D((Double)_1, (Double)_2+translatorY, (Double)_3);
    }

    @Override
    public Point3D translateY(final String translatorY) {
        return translateY(Double.valueOf(translatorY));
    }


    /**
     * THIRD PARAMETER TRANSLATOR OVERLOADED METHODS
     * @param translatorZ <- the third parameter of a Point3D
     * @return {Point3D}
     */

    @Override
    public Point3D translateZ(final Integer translatorZ) {
        return translateZ(Double.valueOf(translatorZ));
    }

    @Override
    public Point3D translateZ(final Double translatorZ) {
        return new Point3D((Double)_1, (Double)_2, (Double)_3+translatorZ);
    }

    @Override
    public Point3D translateZ(final String translatorZ) {
        return translateZ(Double.valueOf(translatorZ));
    }


    /**
     * Updating point to a 4D point: just translate the parameter A, that does not exists yet
     * @param translatorA <- the fourth parameter
     * @return {Point4D}
     */


    @Override
    public Point4D translateA(final Integer translatorA) {
        return  translateA(Double.valueOf(translatorA));
    }

    @Override
    public Point4D translateA(final Double translatorA) {
        return  Point4D.point4D((Double)_1,(Double) _2,(Double) _3, translatorA);
    }

    @Override
    public Point4D translateA(final String translatorA) {
        return  translateA(Double.valueOf(translatorA));
    }
}
