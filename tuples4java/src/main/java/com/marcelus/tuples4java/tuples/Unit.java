package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.First;

public class Unit<A> implements Tuple, First<A> {

    public static final Integer TUPLE_SIZE = 1;

    private final A first;

    private Unit(final A first) {
        this.first = first;
    }

    public static <A> Unit<A> of(final A first) {
        return new Unit<>(first);
    }


    @Override
    public A first() {
        return first;
    }

    @Override
    public Unit<A> withFirst(A first) {
        return new Unit<>(first);
    }


    @Override
    public Integer size() {
        return TUPLE_SIZE;
    }


    /*
    * hasCode, equals and toStringDefinition
    * */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Unit<?> unit = (Unit<?>) o;

        return new org.apache.commons.lang.builder.EqualsBuilder().append(first, unit.first).isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang.builder.HashCodeBuilder(17, 37)
                .append(first).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s)", Tuple.wrapIfContainsComas(first));
    }
}
