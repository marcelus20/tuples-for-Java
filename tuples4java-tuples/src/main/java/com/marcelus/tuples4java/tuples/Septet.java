package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.*;

public class Septet <A, B, C, D, E, F, G> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G>{

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;

    private Septet(A first, B second, C third, D fourth, E fifth, F sixth, G seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
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
    public G seventh() {
        return seventh;
    }

    @Override
    public F sixth() {
        return sixth;
    }

    @Override
    public C third() {
        return third;
    }
}
