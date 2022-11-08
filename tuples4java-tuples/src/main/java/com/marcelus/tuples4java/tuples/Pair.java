package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.List;

public class Pair <A, B> implements Tuple, First<A>, Second<B> {

    private final A first;
    private final B second;

    private static final Integer SIZE = 2;

    private Pair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Pair<A, B> of (final A first, final B second){
        return new Pair<>(first, second);
    }

    public static <T> Either<EmptyTuple, Pair<T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Pair<>(validatedArray[0], validatedArray[1]));
        }
    }

    public static <T> Either<EmptyTuple, Pair<T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Pair<>(validatedList.get(0), validatedList.get(1)));
        }
    }


    @Override
    public A first() {
        return first;
    }

    @Override
    public Pair<A, B> withFirst(A first) {
        return new Pair<>(first, second);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Pair<A, B> withSecond(B second) {
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
        return String.format("(%s, %s)", first, second);
    }

    @Override
    public Integer size() {
        return SIZE;
    }
}
