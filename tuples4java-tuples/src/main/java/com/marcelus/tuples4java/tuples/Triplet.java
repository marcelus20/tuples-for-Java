package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.First;
import com.marcelus.tuples4java.gettables.Third;
import com.marcelus.tuples4java.gettables.Second;

public class Triplet <A, B, C> implements First<A>, Second<B>, Third<C> {

    private final A first;
    private final B second;
    private final C third;

    private Triplet(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public A first() {
        return first;
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
