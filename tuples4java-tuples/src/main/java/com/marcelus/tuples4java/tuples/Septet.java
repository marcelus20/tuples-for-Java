package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Seventh;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Septet <A, B, C, D, E, F, G> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G> {

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;

    private Septet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth,
                   final G seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
    }

    public static<A, B, C, D, E, F, G> Septet<A, B, C, D, E, F, G>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final E fifth() {
        return fifth;
    }

    @Override
    public final Septet <A, B, C, D, E, F, G> withFifth(final E fifth) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Septet <A, B, C, D, E, F, G> withFirst(final A first) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Septet <A, B, C, D, E, F, G> withFourth(final D fourth) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Septet <A, B, C, D, E, F, G> withSecond(final B second) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final G seventh() {
        return seventh;
    }

    @Override
    public final Septet <A, B, C, D, E, F, G> withSeventh(final G seventh) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final F sixth() {
        return sixth;
    }

    @Override
    public final Septet <A, B, C, D, E, F, G> withSixth(final F sixth) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withThird(C third) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    /*
     * hashcode, equals and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Septet<?, ?, ?, ?, ?, ?, ?> septet = (Septet<?, ?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, septet.first).append(second, septet.second).append(third, septet.third)
                .append(fourth, septet.fourth).append(fifth, septet.fifth).append(sixth, septet.sixth)
                .append(seventh, septet.seventh).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).append(fourth).append(fifth).append(sixth).append(seventh).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s, %s)", Tuple.wrapIfContainsComas(first),
                Tuple.wrapIfContainsComas(second), Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth),
                Tuple.wrapIfContainsComas(fifth), Tuple.wrapIfContainsComas(sixth), Tuple.wrapIfContainsComas(seventh));
    }
}
