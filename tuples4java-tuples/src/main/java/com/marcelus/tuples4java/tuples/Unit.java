package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;

import java.util.List;

public class Unit<A> implements Tuple, First<A> {

    public static final Integer SIZE = 1;

    private final A first;

    private Unit(final A first) {
        this.first = first;
    }

    public static <A> Unit<A> of(final A first) {
        return new Unit<>(first);
    }


    public static <A> Either<EmptyTuple, Unit<A>> fromArray(final A[] array) {
        final Either<Object[], A[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            return Either.right(new Unit<>(array[0]));
        }
    }

    public static <A> Either<EmptyTuple, Unit<A>> fromList(List<A> list){
        final Either<List<A>, List<A>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            return Either.right(new Unit<>(list.get(0)));
        }
    }


    @Override
    public A first() {
        return first;
    }

    @Override
    public Unit<A> withFirst(A first) {
        return new Unit<>(first);
    }


    @Override
    public final Integer size() {
        return SIZE;
    }


    /*
    * hasCode, equals and toStringDefinition
    * */


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
        return String.format("(%s)", Tuple.wrapIfContainsComas(first));
    }
}
