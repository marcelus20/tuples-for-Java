package com.company.tuples.coordinates;

import com.company.tuples.TupleOf2;


/**
 * THIS CLASS represents a 2D coordinate
 */

public class Point2D extends TupleOf2  implements Point{


    /**
     * All of the overloaded constructors points to the Double type parameters constructor (The middle one)
     * @param x
     * @param y
     */



    private Point2D(final Integer x, final Integer y){
        super(Double.valueOf(x), Double.valueOf(y));
    }

    private Point2D(final Double x, final Double y){
        super(x, y);
    }

    private Point2D(final String x, final String y){

        super(Double.valueOf(x), Double.valueOf(y));


    }

    public static Point2D point2D(final Integer x, final Integer y){
        return new Point2D(x, y);
    }

    public static Point2D point2D(final Double x, final Double y){
        return new Point2D(x, y);
    }

    public static Point2D point2D(final String x, final String y){
        return new Point2D(x, y);
    }


    @Override
    public Point2D scalePoint(Double scaler) {
        return new Point2D((Double)this._1*scaler, (Double)this._2*scaler);
    }

    @Override
    public Point2D scalePoint(Integer scaler) {
        return new Point2D((Double)this._1*scaler, (Double)this._2*scaler);
    }




    @Override
    public Point2D transLateX(Integer translatorX) {
        return new Point2D(((Double)_1)+translatorX, (Double)_2);
    }

    @Override
    public Point2D translateY(Integer translatorY) {
        return new Point2D((Double)_1, ((Double)_2)+translatorY);
    }

    @Override
    public Point3D translateZ(Integer translatorZ) {
        return Point3D.point3D((Double)_1, (Double)_2, Double.valueOf(translatorZ));
    }

    @Override
    public  Point4D translateA(Integer translatorA) {
        return Point4D.point4D((Double)_1,(Double) _2,0.0, Double.valueOf(translatorA));
    }

    @Override
    public Point2D transLateX(Double translatorX) {
        return new Point2D(((Double)_1)+translatorX, (Double)_2);
    }

    @Override
    public Point2D translateY(Double translatorY) {
        return new Point2D((Double)_1, ((Double)_2)+translatorY);
    }

    @Override
    public Point3D translateZ(Double translatorZ) {
        return Point3D.point3D((Double)_1, (Double)_2, translatorZ);
    }

    @Override
    public Point4D translateA(Double translatorA) {
        return Point4D.point4D((Double)_1,(Double) _2,0.0, Double.valueOf(translatorA));
    }

    @Override
    public Point2D transLateX(String translatorX) {
        return new Point2D(((Double)_1)+Double.parseDouble(translatorX), (Double)_2);
    }

    @Override
    public Point2D translateY(String translatorY) {
        return new Point2D((Double)_1, ((Double)_2)+Double.parseDouble(translatorY));
    }

    @Override
    public Point3D translateZ(String translatorZ) {
        return Point3D.point3D((String)_1, (String)_2, translatorZ);
    }

    @Override
    public Point4D translateA(String translatorA) {
        return Point4D.point4D((Double)_1,(Double) _2,0.0, Double.valueOf(translatorA));
    }
}
