package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.Eighth;
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

import static com.marcelus.tuples4java.tuples.Octet.TUPLE_SIZE;

public class Octet<A, B, C, D, E, F, G, H> implements CollectibleTuple, First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G>, Eighth<H> {

    private final com.marcelus.tuples4java.tuples.Octet<A, B, C, D, E, F, G, H> octetTuple;

    private Octet(final com.marcelus.tuples4java.tuples.Octet<A, B, C, D, E, F, G, H> octetTuple) {
        this.octetTuple = octetTuple;
    }

    public static<A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh,
       final H eighth) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first, second, third, fourth, fifth, sixth,
                seventh, eighth));
    }

    public static <T> Either<EmptyCollectibleTuple, Octet<T, T, T, T, T, T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(validatedArray[0],
                    validatedArray[1], validatedArray[2], validatedArray[3], validatedArray[4], validatedArray[5],
                    validatedArray[6], validatedArray[7])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Octet<T, T, T, T, T, T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(validatedList.get(0),
                    validatedList.get(1), validatedList.get(2), validatedList.get(3), validatedList.get(4),
                    validatedList.get(5), validatedList.get(6), validatedList.get(7))));
        }
    }

    @Override
    public final Object[] toArray() {
        return new Object[]{first(), second(), third(), fourth(), fifth(), sixth(), seventh(), eighth()};
    }

    @Override
    public final List<Object> toList() {
        return Arrays.asList(first(), second(), third(), fourth(), fifth(), sixth(), seventh(), eighth());
    }

    @Override
    public final Integer size() {
        return octetTuple.size();
    }

    @Override
    public final H eighth() {
        return octetTuple.eighth();
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withEighth(final H eighth) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second(), third(), fourth(), fifth(),
                sixth(), seventh(), eighth));
    }

    @Override
    public final E fifth() {
        return octetTuple.fifth();
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withFifth(final E fifth) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second(), third(), fourth(), fifth,
                sixth(), seventh(), eighth()));
    }

    @Override
    public final A first() {
        return octetTuple.first();
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withFirst(final A first) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first, second(), third(), fourth(), fifth(),
                sixth(), seventh(), eighth()));
    }

    @Override
    public final D fourth() {
        return octetTuple.fourth();
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withFourth(final D fourth) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second(), third(), fourth, fifth(),
                sixth(), seventh(), eighth()));
    }

    @Override
    public final B second() {
        return octetTuple.second();
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withSecond(final B second) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second, third(), fourth(), fifth(),
                sixth(), seventh(), eighth()));
    }

    @Override
    public final G seventh() {
        return octetTuple.seventh();
    }

    @Override
    public Octet<A, B, C, D, E, F, G, H> withSeventh(G seventh) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second(), third(), fourth(), fifth(),
                sixth(), seventh, eighth()));
    }

    @Override
    public F sixth() {
        return octetTuple.sixth();
    }

    @Override
    public Octet<A, B, C, D, E, F, G, H> withSixth(F sixth) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second(), third(), fourth(), fifth(),
                sixth, seventh(), eighth()));
    }

    @Override
    public C third() {
        return octetTuple.third();
    }

    @Override
    public Octet<A, B, C, D, E, F, G, H> withThird(C third) {
        return new Octet<>(com.marcelus.tuples4java.tuples.Octet.of(first(), second(), third, fourth(), fifth(),
                sixth(), seventh(), eighth()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Octet<?, ?, ?, ?, ?, ?, ?, ?> octet1 = (Octet<?, ?, ?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(octetTuple, octet1.octetTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(octetTuple).toHashCode();
    }

    @Override
    public String toString() {
        return octetTuple.toString();
    }
}
