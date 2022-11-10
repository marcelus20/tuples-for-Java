package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


public class Pair <A, B> implements Tuple, First<A>, Second<B> {

    private final A first;
    private final B second;

    public static final Integer TUPLE_SIZE = 2;

    private Pair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Pair<A, B> of (final A first, final B second){
        return new Pair<>(first, second);
    }


    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Pair<A, B> withFirst(final A first) {
        return new Pair<>(first, second);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Pair<A, B> withSecond(final B second) {
        return new Pair<>(first, second);
    }


    /*
     * hasCode, equals and toStringDefinition
     * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        return new EqualsBuilder().append(first, pair.first).append(second, pair.second).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(first).append(second).toHashCode();
    }


    @Override
    public String toString() {
        return String.format("(%s, %s)", Tuple.wrapIfContainsComas(first), Tuple.wrapIfContainsComas(second));
    }

    @Override
    public final Integer size() {
        return TUPLE_SIZE;
    }


}
