package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.First;
import io.vavr.control.Either;

import java.security.InvalidParameterException;
import java.util.List;

public class Unit<A> implements Tuple, First<A> {

    public static final Integer SIZE = 1;

    private final A first;

    private Unit(A first) {
        this.first = first;
    }

    public static <A> Unit<A> of(A first) {
        return new Unit<>(first);
    }


    public static <A> Either<Exception, Unit<A>> fromArray(A[] first) {
        if(first == null){
            return Either.left(new InvalidParameterException(Conditions.PARAM_NULL.getMessage()));
        }else if(first.length != 1){
            return Either.left(new InvalidParameterException(Conditions.WRONG_SIZE.getMessage()));
        }else{
            return Either.right(new Unit<>(first[0]));
        }
    }

    public static <A> Either<Exception, Unit<A>> fromList(List<A> a){
        if(a == null){
            return Either.left(new InvalidParameterException("Array cannot be null"));
        }else if(a.size() != 1){
            return Either.left(new InvalidParameterException("Array must contain exactly 1 element."));
        }else{
            return Either.right(new Unit<>(a.get(0)));
        }
    }


    @Override
    public A first() {
        return first;
    }

    public Unit<A> withFirst(A first){
        return new Unit<>(first);
    }

    @Override
    public final Integer size() {
        return SIZE;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Unit<?> unit = (Unit<?>) o;

        return new org.apache.commons.lang.builder.EqualsBuilder().append(first, unit.first).isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang.builder.HashCodeBuilder(17, 37)
                .append(first).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s)", first);
    }
}
