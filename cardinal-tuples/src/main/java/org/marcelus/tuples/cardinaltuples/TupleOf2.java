package org.marcelus.tuples.cardinaltuples;

public class TupleOf2<T, G> extends CardinalTuple {

    protected TupleOf2(T _1, G _2) {
        super(_1, _2);
    }

    public static<T, G> TupleOf2 tupleOf2(T _1, G _2){
        return new TupleOf2( _1, _2);
    }

}
