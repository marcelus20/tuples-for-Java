package org.marcelus.tuples.cardinaltuples;

import java.util.Objects;

public class TupleOf4<E> extends TupleOf3 {

    protected final Object _4;

    /**
     * Private constructor, it will be accessed just through the static tupleOf4 overloaded methods
     * @param _1 The element of the tuple
     * @param _2 the second
     * @param _3 the third
     * @param _4 the fourth
     * @param <T> Type of the first: generics
     * @param <G> type of the second: generics
     * @param <B> tye of the third: generics
     * @param <E> type of the 4th, generics
     */

    protected <T, G, B, E> TupleOf4(T _1, G _2, B _3, E _4){
        super(_1, _2, _3);
        this._4 = _4;
    }

    /**
     *
     * 4 parameters for initialization of the Tuple object
     */
    public static <T, G, B, E> TupleOf4 tupleOf4(T _1, G _2, B _3, E _4){
        return new <T, G, B, E>TupleOf4(_1, _2, _3, _4);
    }

    /**
     *
     * 3 parameters for initialization of the Tuple object, the first is necessarially a Tuple of 2.
     * The _1 and _2 attribute will be filled with the first and second element of the tuple parameter
     */

    public static <T, G, B, E> TupleOf4 tupleOf4(TupleOf2 tuple, B _3, E _4){

        T _1 = (T)tuple.get_1();
        G _2 = (G)tuple.get_2();

        return new <T, G, B, E>TupleOf4(_1, _2, _3, _4);
    }

    /**
     *
     * 2 parameters for initialization of the Tuple object, the first is necessarially a Tuple of 3.
     * The _1 , _2  and _3 attributes will be filled with the first, second and the third element of the tuple parameter
     */

    public static <T, G, B, E> TupleOf4 tupleOf4(TupleOf3 tuple, E _4){

        T _1 = (T)tuple.get_1();
        G _2 = (G)tuple.get_2();
        B _3 = (B)tuple.get_3();

        return new <T, G, B, E>TupleOf4(_1, _2, _3, _4);
    }

    public Object get_4() {
        return _4;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s)", _1, _2, _3, _4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TupleOf4<?> cardinalTupleOf4 = (TupleOf4<?>) o;
        return Objects.equals(_4, cardinalTupleOf4._4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), _4);
    }
}
