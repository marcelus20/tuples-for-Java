package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
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

import static com.marcelus.tuples4java.tuples.Triplet.TUPLE_SIZE;

public class Triplet<A, B, C> implements CollectibleTuple, First<A>, Second<B>, Third<C> {

    private final com.marcelus.tuples4java.tuples.Triplet<A, B, C> tripletTuple;

    private Triplet(final com.marcelus.tuples4java.tuples.Triplet<A, B, C> tripletTuple) {
        this.tripletTuple = tripletTuple;
    }

    public static<A, B, C> Triplet<A, B, C> of(final A first, final B second, final C third) {
        return new Triplet<>(com.marcelus.tuples4java.tuples.Triplet.of(first, second, third));
    }

    public static <T> Either<EmptyCollectibleTuple, Triplet<T, T, T>> fromArray(final T[] array) {
        final Either<Object[], T[]> either = NullValidator.notNull(array)
                .flatMap(nonNullArray -> ArrayValidator.arrayCorrectSize(nonNullArray, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final T[] validatedArray = either.get();
            return Either.right(new Triplet<>(com.marcelus.tuples4java.tuples.Triplet.of(validatedArray[0],
                    validatedArray[1], validatedArray[2])));
        }
    }

    public static <T> Either<EmptyCollectibleTuple, Triplet<T, T, T>> fromList(final List<T> list){
        final Either<List<T>, List<T>> either = NullValidator.notNull(list)
                .flatMap(nonNullList -> ListValidator.listCorrectSize(nonNullList, TUPLE_SIZE));
        if(either.isLeft()){
            return Either.left(EmptyCollectibleTuple.newInstance());
        }else{
            final List<T> validatedList = either.get();
            return Either.right(new Triplet<>(com.marcelus.tuples4java.tuples.Triplet.of(validatedList.get(0),
                    validatedList.get(1), validatedList.get(2))));
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[]{first(), second(), third()};
    }

    @Override
    public List<Object> toList() {
        return Arrays.asList(first(), second(), third());
    }

    @Override
    public Integer size() {
        return tripletTuple.size();
    }

    @Override
    public A first() {
        return tripletTuple.first();
    }

    @Override
    public Triplet<A, B, C> withFirst(final A first) {
        return new Triplet<>(com.marcelus.tuples4java.tuples.Triplet.of(first, second(), third()));
    }

    @Override
    public B second() {
        return tripletTuple.second();
    }

    @Override
    public Triplet<A, B, C> withSecond(final B second) {
        return new Triplet<>(com.marcelus.tuples4java.tuples.Triplet.of(first(), second, third()));
    }

    @Override
    public C third() {
        return tripletTuple.third();
    }

    @Override
    public Triplet<A, B, C> withThird(final C third) {
        return new Triplet<>(com.marcelus.tuples4java.tuples.Triplet.of(first(), second(), third));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Triplet<?, ?, ?> triplet1 = (Triplet<?, ?, ?>) o;

        return new EqualsBuilder().append(tripletTuple, triplet1.tripletTuple).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tripletTuple).toHashCode();
    }

    @Override
    public String toString() {
        return tripletTuple.toString();
    }
}
