package com.marcelus.tuples4java.tuples;

import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;

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
    public Triplet<A, B, C> withFirst(A first) {
        return new Triplet<>(first, second, third);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Triplet<A, B, C> withSecond(B second) {
        return new Triplet<>(first, second, third);
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public Triplet<A, B, C> withThird(C third) {
        return new Triplet<>(first, second, third);
    }
}
