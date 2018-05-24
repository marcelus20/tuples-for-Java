package com.company;

public class Tupleof4 <E> extends TupleOf3{

    private final Object _4;

    private <T, G, B, E>Tupleof4(T _1, G _2, B _3, E _4){
        super(_1, _2, _3);
        this._4 = _4;
    }

    public static <T, G, B, E>Tupleof4 tupleof4(T _1, G _2, B _3, E _4){
        return new <T, G, B, E>Tupleof4(_1, _2, _3, _4);
    }

    public static <T, G, B, E>Tupleof4 tupleof4(Tupleof2 tuple, B _3, E _4){

        T _1 = (T)tuple.get_1();
        G _2 = (G)tuple.get_2();

        return new <T, G, B, E>Tupleof4(_1, _2, _3, _4);
    }

    public static <T, G, B, E>Tupleof4 tupleof4(TupleOf3 tuple, E _4){

        T _1 = (T)tuple.get_1();
        G _2 = (G)tuple.get_2();
        B _3 = (B)tuple.get_3();

        return new <T, G, B, E>Tupleof4(_1, _2, _3, _4);
    }

    public Object get_4() {
        return _4;
    }

    @Override
    public String toString() {
        return "("+_1+", "+_2+", "+_3+","+_4+")";
    }
}
