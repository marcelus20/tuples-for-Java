package com.company.tuples;

public class TupleOf2 extends Tuple {

    protected TupleOf2(Object _1, Object _2) {
        super(_1, _2);
    }

    public static<T, G> Tuple tupleOf2( T _1, G _2){
        return new TupleOf2( _1, _2);
    }

}
