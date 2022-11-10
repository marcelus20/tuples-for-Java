package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Sextet <A, B, C, D, E, F> implements Tuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F> {

    public static final Integer TUPLE_SIZE = 6;
    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;

    private Sextet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    public static <A, B, C, D, E, F> Sextet<A, B, C, D, E, F>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final E fifth() {
        return fifth;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withFifth(final E fifth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withFirst(final A first) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withFourth(final D fourth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withSecond(final B second) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withThird(final C third) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final F sixth() {
        return sixth;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withSixth(final F sixth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    /*
     * hashcode, equals and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Sextet<?, ?, ?, ?, ?, ?> sextet = (Sextet<?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, sextet.first).append(second, sextet.second).append(third, sextet.third).append(fourth, sextet.fourth).append(fifth, sextet.fifth).append(sixth, sextet.sixth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second).append(third).append(fourth).append(fifth).append(sixth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s)", Tuple.wrapIfContainsComas(first),
                Tuple.wrapIfContainsComas(second), Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth),
                Tuple.wrapIfContainsComas(fifth), Tuple.wrapIfContainsComas(sixth));
    }

    @Override
    public Integer size() {
        return TUPLE_SIZE;
    }
}
