package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Triplet <A, B, C> implements Tuple, First<A>, Second<B>, Third<C> {

    public static final Integer TUPLE_SIZE = 3;

    private final A first;
    private final B second;
    private final C third;

    private Triplet(final A first, final B second, final C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <A, B, C> Triplet<A, B, C> of(final A first, final B second, final C third) {
        return new Triplet<>(first, second, third);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Triplet<A, B, C> withFirst(final A first) {
        return new Triplet<>(first, second, third);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Triplet<A, B, C> withSecond(final B second) {
        return new Triplet<>(first, second, third);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Triplet<A, B, C> withThird(final C third) {
        return new Triplet<>(first, second, third);
    }

    /**
     * Equals, hashcode and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;

        return new EqualsBuilder().append(first, triplet.first).append(second, triplet.second)
                .append(third, triplet.third).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", Tuple.wrapIfContainsComas(first), Tuple.wrapIfContainsComas(second),
                Tuple.wrapIfContainsComas(third));
    }

    @Override
    public final Integer size() {
        return TUPLE_SIZE;
    }
}
