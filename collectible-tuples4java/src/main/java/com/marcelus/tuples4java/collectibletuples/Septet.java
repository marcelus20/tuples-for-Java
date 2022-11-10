package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Seventh;
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

import static com.marcelus.tuples4java.tuples.Septet.TUPLE_SIZE;

public class Septet<A, B, C, D, E, F, G> implements CollectibleTuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G> {

    private final com.marcelus.tuples4java.tuples.Septet<A, B, C, D, E, F, G> septetTuple;

    private Septet(final com.marcelus.tuples4java.tuples.Septet<A, B, C, D, E, F, G> septetTuple) {
        this.septetTuple = septetTuple;
    }

    public static<A, B, C, D, E, F, G> Septet<A, B, C, D, E, F, G>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first, second, third, fourth, fifth, sixth,
                seventh));
    }

    public static <T> Either<EmptyCollectibleTuple, Septet<T, T, T, T, T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(validatedArray[0],
                    validatedArray[1], validatedArray[2], validatedArray[3], validatedArray[4], validatedArray[5],
                    validatedArray[6])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Septet<T, T, T, T, T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(validatedList.get(0),
                    validatedList.get(1), validatedList.get(2), validatedList.get(3), validatedList.get(4),
                    validatedList.get(5), validatedList.get(6))));
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[]{first(), second(), third(), fourth(), fifth(), sixth(), seventh()};
    }

    @Override
    public List<Object> toList() {
        return Arrays.asList(first(), second(), third(), fourth(), fifth(), sixth(), seventh());
    }

    @Override
    public final Integer size() {
        return septetTuple.size();
    }

    @Override
    public final E fifth() {
        return septetTuple.fifth();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withFifth(final E fifth) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first(), second(), third(), fourth(), fifth,
                sixth(), seventh()));
    }

    @Override
    public final A first() {
        return septetTuple.first();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withFirst(final A first) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first, second(), third(), fourth(), fifth(),
                sixth(), seventh()));
    }

    @Override
    public final D fourth() {
        return septetTuple.fourth();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withFourth(final D fourth) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first(), second(), third(), fourth, fifth(),
                sixth(), seventh()));
    }

    @Override
    public final B second() {
        return septetTuple.second();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withSecond(final B second) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first(), second, third(), fourth(), fifth(),
                sixth(), seventh()));
    }

    @Override
    public final G seventh() {
        return septetTuple.seventh();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withSeventh(final G seventh) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first(), second(), third(), fourth(), fifth(),
                sixth(), seventh));
    }

    @Override
    public final F sixth() {
        return septetTuple.sixth();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withSixth(final F sixth) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first(), second(), third(), fourth(), fifth(),
                sixth, seventh()));
    }

    @Override
    public final C third() {
        return septetTuple.third();
    }

    @Override
    public final Septet<A, B, C, D, E, F, G> withThird(final C third) {
        return new Septet<>(com.marcelus.tuples4java.tuples.Septet.of(first(), second(), third, fourth(), fifth(),
                sixth(), seventh()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Septet<?, ?, ?, ?, ?, ?, ?> septet1 = (Septet<?, ?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(septetTuple, septet1.septetTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(septetTuple).toHashCode();
    }

    @Override
    public String toString() {
        return septetTuple.toString();
    }
}
