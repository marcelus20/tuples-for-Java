package com.marcelus.tuples4java.tuples;


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

import java.util.List;

public class Quartet <A, B, C, D> implements Tuple , First<A>, Second<B>, Third<C>, Fourth<D> {

    public static final Integer SIZE = 4;

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;

    private Quartet(final A first, final B second, final C third, final D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <A, B, C, D> Quartet<A, B, C, D> of(A first, B second, C third, D fourth) {
        return new Quartet<>(first, second, third, fourth);
    }

    public static <T> Either<EmptyTuple, Quartet<T, T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Quartet<>(validatedArray[0], validatedArray[1], validatedArray[2],
                    validatedArray[3]));
        }
    }

    public static <T> Either<EmptyTuple, Quartet<T, T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, SIZE));
        if(either.isLeft()){
            return Either.left(EmptyTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Quartet<>(validatedList.get(0), validatedList.get(1), validatedList.get(2),
                    validatedList.get(3)));
        }
    }

    @Override
    public final A first() {
        return first;
    }

    @Override
    public final Quartet <A, B, C, D> withFirst(final A first) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final D fourth() {
        return fourth;
    }

    @Override
    public final Quartet <A, B, C, D> withFourth(final D fourth) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final B second() {
        return second;
    }

    @Override
    public final Quartet <A, B, C, D> withSecond(final B second) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public final C third() {
        return third;
    }

    @Override
    public final Quartet <A, B, C, D> withThird(final C third) {
        return new Quartet<>(first, second, third, fourth);
    }

    /*
     * equals, hashcode, toString
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Quartet<?, ?, ?, ?> quartet = (Quartet<?, ?, ?, ?>) o;

        return new EqualsBuilder().append(first, quartet.first).append(second, quartet.second)
                .append(third, quartet.third).append(fourth, quartet.fourth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(first).append(second)
                .append(third).append(fourth).toHashCode();
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s, %s)", Tuple.wrapIfContainsComas(first), Tuple.wrapIfContainsComas(second),
                Tuple.wrapIfContainsComas(third), Tuple.wrapIfContainsComas(fourth));
    }

    @Override
    public final Integer size() {
        return SIZE;
    }
}
