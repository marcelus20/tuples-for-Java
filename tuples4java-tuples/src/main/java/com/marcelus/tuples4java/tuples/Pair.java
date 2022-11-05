package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.First;
import com.marcelus.tuples4java.gettables.Second;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.security.InvalidParameterException;
import java.util.List;

public class Pair <A, B> implements First<A>, Second<B> {

    private final A first;
    private final B second;

    private Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Pair<A, B> of (A first, B second){
        return new Pair<>(first, second);
    }

    public static <T> Either<Exception, Pair<T, T>> fromArray(T[] array) {
        if(array == null){
            return Either.left(new InvalidParameterException(Tuple.Conditions.PARAM_NULL.getMessage()));
        }else if(array.length != 2){
            return Either.left(new InvalidParameterException(Tuple.Conditions.WRONG_SIZE.getMessage()));
        }else{
            return Either.right(new Pair<>(array[0], array[1]));
        }
    }

    public static <T> Either<Exception, Pair<T, T>> fromList(List<T> list){
        if(list == null){
            return Either.left(new InvalidParameterException("Array cannot be null"));
        }else if(list.size() != 1){
            return Either.left(new InvalidParameterException("Array must contain exactly 1 element."));
        }else{
            return Either.right(new Pair<>(list.get(0), list.get(1)));
        }
    }


    @Override
    public A first() {
        return first;
    }

    public Pair<A, B> withFirst(A first){
        return new Pair<>(first, second);
    }

    @Override
    public B second() {
        return second;
    }

    public Pair<A, B> withSecond(B second){
        return new Pair<>(first, second);
    }


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
}
