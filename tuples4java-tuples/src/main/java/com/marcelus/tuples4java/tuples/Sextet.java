package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.*;

public class Sextet <A, B, C, D, E, F> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>{
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
    public A first() {
        return first;
    }

    @Override
    public D fourth() {
        return fourth;
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public F sixth() {
        return sixth;
    }
}
