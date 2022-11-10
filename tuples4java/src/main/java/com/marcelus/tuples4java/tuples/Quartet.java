package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Quartet <A, B, C, D> implements Tuple , First<A>, Second<B>, Third<C>, Fourth<D> {

    public static final Integer TUPLE_SIZE = 4;

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;

    private Quartet(final A first, final B second, final C third, final D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <A, B, C, D> Quartet<A, B, C, D> of(A first, B second, C third, D fourth) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Quartet <A, B, C, D> withFirst(final A first) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Quartet <A, B, C, D> withFourth(final D fourth) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Quartet <A, B, C, D> withSecond(final B second) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Quartet <A, B, C, D> withThird(final C third) {
        return new Quartet<>(first, second, third, fourth);
    }

    /*
     * equals, hashcode, toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Quartet<?, ?, ?, ?> quartet = (Quartet<?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, quartet.first).append(second, quartet.second)
                .append(third, quartet.third).append(fourth, quartet.fourth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).append(fourth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s)", Tuple.wrapIfContainsComas(first), Tuple.wrapIfContainsComas(second),
                Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth));
    }

    @Override
    public final Integer size() {
        return TUPLE_SIZE;
    }
}
