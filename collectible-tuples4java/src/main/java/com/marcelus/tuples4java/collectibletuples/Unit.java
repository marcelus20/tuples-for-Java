package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Arrays;
import java.util.List;

import static com.marcelus.tuples4java.tuples.Unit.TUPLE_SIZE;

public class Unit<A> implements CollectibleTuple, First<A> {

    private final com.marcelus.tuples4java.tuples.Unit<A> unitTuple;

    private Unit(final com.marcelus.tuples4java.tuples.Unit<A> unitTuple) {
        this.unitTuple = unitTuple;
    }

    public static<A> Unit<A> of(final A first) {
        return new Unit<>(com.marcelus.tuples4java.tuples.Unit.of(first));
    }

    public static <A> Either<EmptyCollectibleTuple, Unit<A>> fromArray(final A[] array) {
        final Either<Object[], A[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            return Either.right(new Unit<>(com.marcelus.tuples4java.tuples.Unit.of(array[0])));
        }
    }

    public static <A> Either<EmptyCollectibleTuple, Unit<A>> fromList(List<A> list){
        final Either<List<A>, List<A>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            return Either.right(new Unit<>(com.marcelus.tuples4java.tuples.Unit.of(list.get(0))));
        }
    }


    @Override
    public final Integer size() {
        return unitTuple.size();
    }

    @Override
    public final A first() {
        return unitTuple.first();
    }

    @Override
    public final Unit<A> withFirst(final A first) {
        return new Unit<>(com.marcelus.tuples4java.tuples.Unit.of(first));
    }

    @Override
    public final Object[] toArray() {
        return new Object[]{first()};
    }

    @Override
    public final List<Object> toList() {
        return Arrays.asList(first());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Unit<?> unit1 = (Unit<?>) o;

        return new EqualsBuilder().append(unitTuple, unit1.unitTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(unitTuple).toHashCode();
    }

    @Override
    public String toString() {
        return unitTuple.toString();
    }
}
