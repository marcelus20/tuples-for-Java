package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.List;

public class Triplet <A, B, C> implements Tuple, First<A>, Second<B>, Third<C> {

    public static final Integer SIZE = 3;

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

    public static <T> Either<EmptyTuple, Triplet<T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Triplet<>(validatedArray[0], validatedArray[1], validatedArray[2]));
        }
    }

    public static <T> Either<EmptyTuple, Triplet<T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Triplet<>(validatedList.get(0), validatedList.get(1), validatedList.get(2)));
        }
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
        return SIZE;
    }
}
