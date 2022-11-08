package com.marcelus.tuples4java.tuples;

/**
 * Class to represent an empty tuple or an invalid tuple.
 */
public class EmptyTuple implements Tuple{

    private static final Integer SIZE= 0;

    private EmptyTuple(){

    }

    public static EmptyTuple newInstance(){
        return new EmptyTuple();
    }

    @Override
    public Integer size() {
        return SIZE;
    }
}
