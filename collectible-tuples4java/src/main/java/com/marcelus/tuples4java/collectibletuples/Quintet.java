package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.Fifth;
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

import static com.marcelus.tuples4java.tuples.Quintet.TUPLE_SIZE;

public class Quintet<A, B, C, D, E> implements CollectibleTuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E> {

    private final com.marcelus.tuples4java.tuples.Quintet<A, B, C, D, E> quintetTuple;

    private Quintet(final com.marcelus.tuples4java.tuples.Quintet<A, B, C, D, E> quintetTuple) {
        this.quintetTuple = quintetTuple;
    }

    public static<A, B, C, D, E> Quintet<A, B, C, D, E>
    of(final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(first, second, third, fourth, fifth));
    }

    public static <T> Either<EmptyCollectibleTuple, Quintet<T, T, T, T,T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(validatedArray[0],
                    validatedArray[1], validatedArray[2], validatedArray[3], validatedArray[4])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Quintet<T, T, T, T,T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(validatedList.get(0), validatedList.get(1), validatedList.get(2),
                    validatedList.get(3), validatedList.get(4))));
        }
    }

    @Override
    public final Object[] toArray() {
        return new Object[]{first(), second(), third(), fourth(), fifth()};
    }

    @Override
    public final List<Object> toList() {
        return Arrays.asList(first(), second(), third(), fourth(), fifth());
    }

    @Override
    public final Integer size() {
        return quintetTuple.size();
    }

    @Override
    public final E fifth() {
        return quintetTuple.fifth();
    }

    @Override
    public final Quintet<A, B, C, D, E> withFifth(final E fifth) {
        return new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(first(), second(), third(), fourth(), fifth));
    }

    @Override
    public final A first() {
        return quintetTuple.first();
    }

    @Override
    public final Quintet<A, B, C, D, E> withFirst(final A first) {
        return new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(first, second(), third(), fourth(), fifth()));
    }

    @Override
    public final D fourth() {
        return quintetTuple.fourth();
    }

    @Override
    public final Quintet<A, B, C, D, E> withFourth(final D fourth) {
        return new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(first(), second(), third(), fourth, fifth()));
    }

    @Override
    public final B second() {
        return quintetTuple.second();
    }

    @Override
    public final Quintet<A, B, C, D, E> withSecond(final B second) {
        return new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(first(), second,
                third(), fourth(), fifth()));
    }

    @Override
    public final C third() {
        return quintetTuple.third();
    }

    @Override
    public final Quintet<A, B, C, D, E> withThird(final C third) {
        return new Quintet<>(com.marcelus.tuples4java.tuples.Quintet.of(first(), second(), third, fourth(), fifth()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Quintet<?, ?, ?, ?, ?> quintet1 = (Quintet<?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(quintetTuple, quintet1.quintetTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quintetTuple).toHashCode();
    }

    @Override
    public String toString() {
        return quintetTuple.toString();
    }
}
