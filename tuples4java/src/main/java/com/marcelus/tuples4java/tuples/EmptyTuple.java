package com.marcelus.tuples4java.tuples;


/**
 * Class to represent an empty tuple or an invalid tuple.
 */
public class EmptyTuple implements Tuple{

    private static final Integer TUPLE_SIZE = 0;

    private EmptyTuple(){

    }

    public static EmptyTuple newInstance(){
        return new EmptyTuple();
    }

    @Override
    public final Integer size() {
        return TUPLE_SIZE;
    }


    /*
     * Equals Hashcode and toString
     */
    @Override
    public boolean equals(Object o) {
        // All empty tuples will be equal to each other.
        return o instanceof EmptyTuple;
    }

    @Override
    public int hashCode() {
        return EmptyTuple.class.hashCode();
    }

    @Override
    public String toString() {
        return "()";
    }
}
