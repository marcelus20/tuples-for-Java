package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Arrays;
import java.util.List;

import static com.marcelus.tuples4java.tuples.Quartet.TUPLE_SIZE;

public class Quartet<A, B, C, D> implements CollectibleTuple, First<A>, Second<B>, Third<C>, Fourth<D> {

    private final com.marcelus.tuples4java.tuples.Quartet<A, B, C, D> quartetTuple;

    private Quartet(final com.marcelus.tuples4java.tuples.Quartet<A, B, C, D> quartetTuple) {
        this.quartetTuple = quartetTuple;
    }

    public static<A, B, C, D> Quartet<A, B, C, D> of(final A first, final B second, final C third, final D fourth) {
        return new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(first, second, third, fourth));
    }

    public static <T> Either<EmptyCollectibleTuple, Quartet<T, T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(validatedArray[0], validatedArray[1], validatedArray[2],
                    validatedArray[3])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Quartet<T, T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(validatedList.get(0), validatedList.get(1), validatedList.get(2),
                    validatedList.get(3))));
        }
    }

    @Override
    public final Object[] toArray() {
        return new Object[]{first(), second(), third(), fourth()};
    }

    @Override
    public final List<Object> toList() {
        return Arrays.asList(first(), second(), third(), fourth());
    }

    @Override
    public final Integer size() {
        return quartetTuple.size();
    }

    @Override
    public final A first() {
        return quartetTuple.first();
    }

    @Override
    public final Quartet<A, B, C, D> withFirst(final A first) {
        return new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(first, second(), third(),
                fourth()));
    }

    @Override
    public final D fourth() {
        return quartetTuple.fourth();
    }

    @Override
    public final Quartet<A, B, C, D> withFourth(final D fourth) {
        return new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(first(), second(), third(), fourth));
    }

    @Override
    public final B second() {
        return quartetTuple.second();
    }

    @Override
    public final Quartet<A, B, C, D> withSecond(final B second) {
        return new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(first(), second, third(), fourth()));
    }

    @Override
    public final C third() {
        return quartetTuple.third();
    }

    @Override
    public final Quartet<A, B, C, D> withThird(final C third) {
        return new Quartet<>(com.marcelus.tuples4java.tuples.Quartet.of(first(), second(), third, fourth()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Quartet<?, ?, ?, ?> quartet1 = (Quartet<?, ?, ?, ?>) o;

        return new EqualsBuilder().append(quartetTuple, quartet1.quartetTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quartetTuple).toHashCode();
    }

    @Override
    public String toString() {
        return quartetTuple.toString();
    }
}
