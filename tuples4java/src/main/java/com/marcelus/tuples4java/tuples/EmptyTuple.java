package com.marcelus.tuples4java.tuples;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public List<Object> toList() {
        return new ArrayList<>();
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
