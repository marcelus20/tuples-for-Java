package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.gettables.Fourth;
import com.marcelus.tuples4java.gettables.First;
import com.marcelus.tuples4java.gettables.Third;
import com.marcelus.tuples4java.gettables.Second;

public class Quartet <A, B, C, D> implements First<A>, Second<B>, Third<C>, Fourth<D> {

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;

    private Quartet(A first, B second, C third, D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
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
