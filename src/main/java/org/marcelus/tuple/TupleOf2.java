package org.marcelus.tuple;

public class TupleOf2 <T, G> extends Tuple  {

    protected TupleOf2(T _1, G _2) {
        super(_1, _2);
    }

    public static<T, G> TupleOf2 tupleOf2( T _1, G _2){
        return new TupleOf2( _1, _2);
    }

}
