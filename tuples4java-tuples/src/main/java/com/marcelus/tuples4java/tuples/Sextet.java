package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;

public class Sextet <A, B, C, D, E, F> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F> {
    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;

    private Sextet(A first, B second, C third, D fourth, E fifth, F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    @Override
    public E fifth() {
        return fifth;
    }

    @Override
    public Sextet <A, B, C, D, E, F> withFifth(E fifth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public A first() {
        return first;
    }

    @Override
    public Sextet <A, B, C, D, E, F> withFirst(A first) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public D fourth() {
        return fourth;
    }

    @Override
    public Sextet <A, B, C, D, E, F> withFourth(D fourth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Sextet <A, B, C, D, E, F> withSecond(B second) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public Sextet <A, B, C, D, E, F> withThird(C third) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public F sixth() {
        return sixth;
    }

    @Override
    public Sextet <A, B, C, D, E, F> withSixth(F sixth) {
        return new Sextet<>(first, second, third, fourth, fifth, sixth);
    }
}
