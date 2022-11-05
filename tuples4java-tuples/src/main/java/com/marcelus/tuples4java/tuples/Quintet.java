package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.*;

public class Quintet<A, B, C, D, E> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E> {

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;

    private Quintet(A first, B second, C third, D fourth, E fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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
}
