package com.company;

public class TupleOf3 <B> extends Tupleof2 {
    protected final B _3;

    protected <T, G, A> TupleOf3(T _1, G _2, B _3) {
        super(_1, _2);
        this._3 = _3;
    }


    public static <T, G, B>TupleOf3 tupleOf3(T _1, G _2, B _3){
        return new TupleOf3(_1, _2, _3);
    }

    public static <T, G, B>TupleOf3 tupleOf3(Tupleof2 tupleOf2, B _3){
        T _1 = (T) tupleOf2.get_1();
        G _2 = (G) tupleOf2.get_2();
        return new TupleOf3(_1, _2, _3);
    }

    public B get_3() {
        return _3;
    }

    @Override
    public String toString() {
        return "("+_1+", "+_2+", "+_3+")";
    }
}
