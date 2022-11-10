package com.marcelus.tuples4java.collectibletuples;


import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Arrays;
import java.util.List;

import static com.marcelus.tuples4java.tuples.Pair.TUPLE_SIZE;

public class Pair<A, B> implements CollectibleTuple, First<A>, Second<B> {

    private final com.marcelus.tuples4java.tuples.Pair<A, B> pairTuple;

    private Pair(final com.marcelus.tuples4java.tuples.Pair<A, B> pairTuple) {
        this.pairTuple = pairTuple;
    }

    public static<A, B> Pair<A, B> of(final A first, final B second) {
        return new Pair<>(com.marcelus.tuples4java.tuples.Pair.of(first, second));
    }

    public static <T> Either<EmptyCollectibleTuple, Pair<T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Pair<>(com.marcelus.tuples4java.tuples.Pair.of(validatedArray[0],
                    validatedArray[1])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Pair<T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Pair<>(com.marcelus.tuples4java.tuples.Pair.of(validatedList.get(0),
                    validatedList.get(1))));
        }
    }

    @Override
    public final Object[] toArray() {
        return new Object[]{first(), second()};
    }

    @Override
    public final List<Object> toList() {
        return Arrays.asList(first(), second());
    }

    @Override
    public final Integer size() {
        return pairTuple.size();
    }

    @Override
    public final A first() {
        return pairTuple.first();
    }

    @Override
    public final Pair<A, B> withFirst(final A first) {
        return new Pair<>(com.marcelus.tuples4java.tuples.Pair.of(first, second()));
    }

    @Override
    public final B second() {
        return pairTuple.second();
    }

    @Override
    public final Pair<A, B> withSecond(final B second) {
        return new Pair<>(com.marcelus.tuples4java.tuples.Pair.of(first(), second));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair1 = (Pair<?, ?>) o;

        return new EqualsBuilder().append(pairTuple, pair1.pairTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(pairTuple).toHashCode();
    }

    @Override
    public String toString() {
        return pairTuple.toString();
    }
}
