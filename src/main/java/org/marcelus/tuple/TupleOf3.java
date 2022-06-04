package org.marcelus.tuple;

import java.util.Objects;

public class TupleOf3 <B> extends TupleOf2 {
    protected final B _3;

    protected <T, G, A> TupleOf3(T _1, G _2, B _3) {
        super(_1, _2);
        this._3 = _3;
    }


    /**
     * There will be two ways of initializing Tuples of 3, passing 3 parameters orpassing two parameters
     * If there is two parameters, the first necessarialy has to be a Tuple of 2 type, cause a TupleOf2 has
     * 2 elements so in the end it will  having 3 elements
     * @param _1 the first element
     * @param _2 the second
     * @param _3 the third
     * @param <T> type of the first element, it can be generic
     * @param <G> type of the sencond, also generic
     * @param <B> type of the third, also generic
     * @return
     */

    public static <T, G, B>TupleOf3 tupleOf3(T _1, G _2, B _3){
        return new TupleOf3(_1, _2, _3);
    }

    /**
     * +
     * @param tuple The tupleof type, so  elements already
     * @param _3 The extra element to complete 3
     * @param <T> Generic type for tuple fisrt element
     * @param <G>Generic type for tuple second element
     * @param <B> Generic type of third Element
     * @return
     */

    public static <T, G, B>TupleOf3 tupleOf3(TupleOf2 tuple, B _3){
        T _1 = (T) tuple.get_1();
        G _2 = (G) tuple.get_2();
        return new TupleOf3(_1, _2, _3);
    }


    /**
     * getter for _3 attribute. The others attribute has already been extended to this class
     * @return _3 itself
     */
    public B get_3() {
        return _3;
    }

    @Override
    public String toString() {
        return "("+_1+", "+_2+", "+_3+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TupleOf3<?> tupleOf3 = (TupleOf3<?>) o;
        return Objects.equals(_3, tupleOf3._3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), _3);
    }
}
