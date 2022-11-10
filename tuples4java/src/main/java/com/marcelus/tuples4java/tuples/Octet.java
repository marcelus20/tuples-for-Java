package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.Eighth;
import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Seventh;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


public class Octet <A, B, C, D, E, F, G, H> implements Tuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G>, Eighth<H> {

    public static final Integer TUPLE_SIZE = 8;

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;
    private final H eighth;

    private Octet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth,
                  final G seventh, final H eighth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
    }

    public static <A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh,
       final H eighth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final H eighth() {
        return eighth;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withEighth(final H eighth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final E fifth() {
        return fifth;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withFifth(final E fifth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withFirst(final A first) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withFourth(final D fourth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withSecond(final B second) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final G seventh() {
        return seventh;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withSeventh(final G seventh) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final F sixth() {
        return sixth;
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withSixth(final F sixth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withThird(final C third) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    /*
     * hashcode equals and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Octet<?, ?, ?, ?, ?, ?, ?, ?> octet = (Octet<?, ?, ?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, octet.first).append(second, octet.second).append(third, octet.third)
                .append(fourth, octet.fourth).append(fifth, octet.fifth).append(sixth, octet.sixth)
                .append(seventh, octet.seventh).append(eighth, octet.eighth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).append(fourth).append(fifth).append(sixth).append(seventh).append(eighth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s, %s, %s)", Tuple.wrapIfContainsComas(first),
                Tuple.wrapIfContainsComas(second), Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth),
                Tuple.wrapIfContainsComas(fifth), Tuple.wrapIfContainsComas(sixth), Tuple.wrapIfContainsComas(seventh),
                Tuple.wrapIfContainsComas(eighth));
    }

    @Override
    public Integer size() {
        return TUPLE_SIZE;
    }
}
