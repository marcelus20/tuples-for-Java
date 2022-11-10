package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;
import com.marcelus.validators.ArrayValidator;
import com.marcelus.validators.ListValidator;
import com.marcelus.validators.NullValidator;
import io.vavr.control.Either;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Arrays;
import java.util.List;

import static com.marcelus.tuples4java.tuples.Sextet.TUPLE_SIZE;

public class Sextet<A, B, C, D, E, F> implements CollectibleTuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F> {

    private final com.marcelus.tuples4java.tuples.Sextet<A, B, C, D, E, F> sextetTuple;

    private Sextet(final com.marcelus.tuples4java.tuples.Sextet<A, B, C, D, E, F> sextetTuple) {
        this.sextetTuple = sextetTuple;
    }

    public static<A, B, C, D, E, F> Sextet<A, B, C, D, E, F>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first, second, third, fourth, fifth, sixth));
    }

    public static <T> Either<EmptyCollectibleTuple, Sextet<T, T, T, T,T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(validatedArray[0],
                    validatedArray[1], validatedArray[2], validatedArray[3], validatedArray[4], validatedArray[5])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Sextet<T, T, T, T,T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(validatedList.get(0),
                    validatedList.get(1), validatedList.get(2), validatedList.get(3), validatedList.get(4),
                    validatedList.get(5))));
        }
    }

    @Override
    public final Object[] toArray() {
        return new Object[]{first(), second(), third(), fourth(), fifth(), sixth()};
    }

    @Override
    public final List<Object> toList() {
        return Arrays.asList(first(), second(), third(), fourth(), fifth(), sixth());
    }

    @Override
    public final Integer size() {
        return sextetTuple.size();
    }

    @Override
    public final E fifth() {
        return sextetTuple.fifth();
    }

    @Override
    public final Sextet<A, B, C, D, E, F> withFifth(final E fifth) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first(), second(), third(), fourth(), fifth,
                sixth()));
    }

    @Override
    public final A first() {
        return sextetTuple.first();
    }

    @Override
    public final Sextet<A, B, C, D, E, F> withFirst(final A first) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first, second(), third(), fourth(), fifth(),
                sixth()));
    }

    @Override
    public final D fourth() {
        return sextetTuple.fourth();
    }

    @Override
    public final Sextet<A, B, C, D, E, F> withFourth(final D fourth) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first(), second(), third(), fourth, fifth(),
                sixth()));
    }

    @Override
    public final B second() {
        return sextetTuple.second();
    }

    @Override
    public final Sextet<A, B, C, D, E, F> withSecond(final B second) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first(), second, third(), fourth(), fifth(),
                sixth()));
    }

    @Override
    public final F sixth() {
        return sextetTuple.sixth();
    }

    @Override
    public final Sextet<A, B, C, D, E, F> withSixth(final F sixth) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first(), second(), third(), fourth(), fifth(),
                sixth));
    }

    @Override
    public final C third() {
        return sextetTuple.third();
    }

    @Override
    public final Sextet<A, B, C, D, E, F> withThird(final C third) {
        return new Sextet<>(com.marcelus.tuples4java.tuples.Sextet.of(first(), second(), third, fourth(), fifth(), sixth()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Sextet<?, ?, ?, ?, ?, ?> sextet1 = (Sextet<?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(sextetTuple, sextet1.sextetTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sextetTuple).toHashCode();
    }

    @Override
    public String toString() {
        return sextetTuple.toString();
    }
}
