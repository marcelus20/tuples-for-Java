package org.marcelus.tuples.cardinaltuples.coordinates;


import org.marcelus.tuples.cardinaltuples.TupleOf2;

/**
 * THIS CLASS represents a 2D coordinate
 */

public class Point2D extends TupleOf2 implements Point{


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


    /**
     * Scaler methods:
     * (2, 2)scalePointby(3)===> output (6, 6)
     * @param scaler
     * @return {Point 2D modifyied}
     */


    @Override
    public Point2D scalePointBy(final Double scaler) {
        return new Point2D((Double)this._1*scaler, (Double)this._2*scaler);
    }

    @Override
    public Point2D scalePointBy(final Integer scaler) {
        return scalePointBy(Double.valueOf(scaler));
    }




    //THE THREE OVERLOADED TRANNSLATE X METHODS POINTS TO THE MIDDLE ONE (THE DOUBLE TYPED PARAMETER)

    @Override
    public Point2D translateX(final Integer translatorX) {
        return translateX(Double.valueOf(translatorX));
    }

    @Override
    public Point2D translateX(final Double translatorX) {
        return new Point2D(((Double)_1)+translatorX, (Double)_2);
    }

    @Override
    public Point2D translateX(final String translatorX) {
        return translateX(Double.valueOf(translatorX));
    }




    @Override
    public Point2D translateY(final Integer translatorY) {
        return translateY(Double.valueOf(translatorY));
    }

    @Override
    public Point2D translateY(final Double translatorY) {
        return new Point2D((Double)_1, ((Double)_2)+translatorY);
    }

    @Override
    public Point2D translateY(final String translatorY) {
        return translateY(Double.valueOf(translatorY));
    }


    /**
     * The translator methods bellow returns a tuple of 3D and 4D tuples even if this is a 2D tuple.
     * The idea is that, a 2D tuple does not have z parameter and a paramenter, but if the user wants to include them,
     * it will end up becoming from a 2D point to a 3D or 4D point..
     * @param translatorZ <- the third parameter of a 3D point, (z)
     * @return {Point3D} remaining it _1 attribute and _2 tuple attribute and adding z as third
     */

    @Override
    public Point3D translateZ(final Integer translatorZ) {
        return translateZ(Double.valueOf(translatorZ));
    }

    @Override
    public Point3D translateZ(final Double translatorZ) {
        return Point3D.point3D((Double)_1, (Double)_2, translatorZ);
    }


    @Override
    public Point3D translateZ(final String translatorZ) {
        return translateZ(Double.valueOf(translatorZ));
    }


    /**
     * Same with the 4D returning type. As this is a Point2D class, if user wants to converts streight away to 4D,
     * the third parameter will be a zero.
     * @param translatorA <- the third paramenter
     * @return {4DPoint}
     */



    @Override
    public Point4D translateA(final Integer translatorA) {
        return translateA(Double.valueOf(translatorA));
    }

    @Override
    public Point4D translateA(final Double translatorA) {
        return Point4D.point4D((Double)_1,(Double) _2,0.0, Double.valueOf(translatorA));
    }


    @Override
    public Point4D translateA(final String translatorA) {
        return translateA(Double.valueOf(translatorA));
    }
}
