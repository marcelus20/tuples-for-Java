package com.marcelus.tuples4java.tuples;


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

import java.util.List;

public class Octet <A, B, C, D, E, F, G, H> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G>, Eighth<H> {

    public static final Integer SIZE = 8;

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;
    private final H eighth;

    private Octet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth,
                  final G seventh, final H eighth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
    }

    public static <A, B, C, D, E, F, G, H> Octet<A, B, C, D, E, F, G, H>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh,
       final H eighth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    public static <T> Either<EmptyTuple, Octet<T, T, T, T, T, T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Octet<>(validatedArray[0], validatedArray[1], validatedArray[2],
                    validatedArray[3], validatedArray[4], validatedArray[5], validatedArray[6], validatedArray[7]));
        }
    }

    public static <T> Either<EmptyTuple, Octet<T, T, T, T, T, T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Octet<>(validatedList.get(0), validatedList.get(1), validatedList.get(2),
                    validatedList.get(3), validatedList.get(4), validatedList.get(5), validatedList.get(6),
                    validatedList.get(7)));
        }
    }

    @Override
    public final H eighth() {
        return eighth;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withEighth(final H eighth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final E fifth() {
        return fifth;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withFifth(final E fifth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withFirst(final A first) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withFourth(final D fourth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withSecond(final B second) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final G seventh() {
        return seventh;
    }

    @Override
    public final Octet <A, B, C, D, E, F, G, H> withSeventh(final G seventh) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final F sixth() {
        return sixth;
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withSixth(final F sixth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Octet<A, B, C, D, E, F, G, H> withThird(final C third) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    /*
     * hashcode equals and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Octet<?, ?, ?, ?, ?, ?, ?, ?> octet = (Octet<?, ?, ?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, octet.first).append(second, octet.second).append(third, octet.third)
                .append(fourth, octet.fourth).append(fifth, octet.fifth).append(sixth, octet.sixth)
                .append(seventh, octet.seventh).append(eighth, octet.eighth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).append(fourth).append(fifth).append(sixth).append(seventh).append(eighth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s, %s, %s)", Tuple.wrapIfContainsComas(first),
                Tuple.wrapIfContainsComas(second), Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth),
                Tuple.wrapIfContainsComas(fifth), Tuple.wrapIfContainsComas(sixth), Tuple.wrapIfContainsComas(seventh),
                Tuple.wrapIfContainsComas(eighth));
    }
}
