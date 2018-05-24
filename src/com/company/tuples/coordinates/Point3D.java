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
    public Point3D scalePoint(Double scaler) {
        return new Point3D((Double)_1*scaler, (Double)_2*scaler, (Double)_3*scaler);
    }

    @Override
    public Point3D scalePoint(Integer scaler) {
        return new Point3D((Double)_1*scaler, (Double)_2*scaler, (Double)_3*scaler);
    }



    @Override
    public Point3D transLateX(Integer translatorX) {
        return new Point3D((Double)_1+translatorX, (Double)_2, (Double)_3);
    }

    @Override
    public Point3D translateY(Integer translatorY) {
        return new Point3D((Double)_1, (Double)_2+translatorY, (Double)_3);
    }

    @Override
    public Point3D translateZ(Integer translatorZ) {
        return new Point3D((Double)_1, (Double)_2, (Double)_3+Double.valueOf(translatorZ));
    }

    @Override
    public Point4D translateA(Integer translatorA) {
        return  Point4D.point4D((Double)_1,(Double) _2,(Double) _3, Double.valueOf(translatorA));
    }

    @Override
    public Point3D transLateX(Double translatorX) {
        return new Point3D((Double)_1+translatorX, (Double)_2, (Double)_3);
    }

    @Override
    public Point3D translateY(Double translatorY) {
        return new Point3D((Double)_1, (Double)_2+translatorY, (Double)_3);
    }

    @Override
    public Point3D translateZ(Double translatorZ) {
        return new Point3D((Double)_1, (Double)_2, (Double)_3+translatorZ);
    }

    @Override
    public Point4D translateA(Double translatorA) {
        return  Point4D.point4D((Double)_1,(Double) _2,(Double) _3, translatorA);
    }

    @Override
    public Point3D transLateX(String translatorX) {
        return new Point3D((Double)_1+Double.parseDouble(translatorX), (Double)_2, (Double)_3);
    }

    @Override
    public Point3D translateY(String translatorY) {
        return new Point3D((Double)_1, (Double)_2+Double.parseDouble(translatorY), (Double)_3);
    }

    @Override
    public Point3D translateZ(String translatorZ) {
        return new Point3D((Double)_1, (Double)_2, (Double)_3+Double.parseDouble(translatorZ));
    }

    @Override
    public Point4D translateA(String translatorA) {
        return  Point4D.point4D((Double)_1,(Double) _2,(Double) _3, Double.valueOf(translatorA));
    }
}
