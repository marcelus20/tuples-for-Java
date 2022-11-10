package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Quintet<A, B, C, D, E> implements Tuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E> {

    public static final Integer TUPLE_SIZE = 5;

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;

    private Quintet(final A first, final B second, final C third, final D fourth, final E fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    public static <A, B, C, D, E> Quintet<A, B, C, D, E>
    of(final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }


    @Override
    public final E fifth() {
        return fifth;
    }

    @Override
    public final Quintet<A, B, C, D, E> withFifth(final E fifth) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Quintet<A, B, C, D, E> withFirst(final A first) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Quintet<A, B, C, D, E> withFourth(final D fourth) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Quintet<A, B, C, D, E> withSecond(final B second) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Quintet<A, B, C, D, E> withThird(final C third) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    /*
     * hashcode, equals and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Quintet<?, ?, ?, ?, ?> quintet = (Quintet<?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, quintet.first).append(second, quintet.second)
                .append(third, quintet.third).append(fourth, quintet.fourth).append(fifth, quintet.fifth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).append(fourth).append(fifth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s)", Tuple.wrapIfContainsComas(first), Tuple.wrapIfContainsComas(second),
                Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth), Tuple.wrapIfContainsComas(fifth));
    }

    @Override
    public Integer size() {
        return TUPLE_SIZE;
    }
}
