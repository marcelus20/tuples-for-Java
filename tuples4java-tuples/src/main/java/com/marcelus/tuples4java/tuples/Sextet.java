package com.marcelus.tuples4java.tuples;

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

import java.util.List;

public class Sextet <A, B, C, D, E, F> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F> {

    public static final Integer SIZE = 6;
    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;

    private Sextet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    public static <A, B, C, D, E, F> Sextet<A, B, C, D, E, F>
    of(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    public static <T> Either<EmptyTuple, Sextet<T, T, T, T,T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Sextet<>(validatedArray[0], validatedArray[1], validatedArray[2],
                    validatedArray[3], validatedArray[4], validatedArray[5]));
        }
    }

    public static <T> Either<EmptyTuple, Sextet<T, T, T, T,T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Sextet<>(validatedList.get(0), validatedList.get(1), validatedList.get(2),
                    validatedList.get(3), validatedList.get(4), validatedList.get(5)));
        }
    }

    @Override
    public final E fifth() {
        return fifth;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withFifth(final E fifth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withFirst(final A first) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withFourth(final D fourth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withSecond(final B second) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withThird(final C third) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public final F sixth() {
        return sixth;
    }

    @Override
    public final Sextet <A, B, C, D, E, F> withSixth(final F sixth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    /*
     * hashcode, equals and toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Sextet<?, ?, ?, ?, ?, ?> sextet = (Sextet<?, ?, ?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, sextet.first).append(second, sextet.second).append(third, sextet.third).append(fourth, sextet.fourth).append(fifth, sextet.fifth).append(sixth, sextet.sixth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second).append(third).append(fourth).append(fifth).append(sixth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s, %s)", Tuple.wrapIfContainsComas(first),
                Tuple.wrapIfContainsComas(second), Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth),
                Tuple.wrapIfContainsComas(fifth), Tuple.wrapIfContainsComas(sixth));
    }
}
