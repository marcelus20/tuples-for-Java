package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;

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
    public Quartet <A, B, C, D> withFirst(A first) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public D fourth() {
        return fourth;
    }

    @Override
    public Quartet <A, B, C, D> withFourth(D fourth) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Quartet <A, B, C, D> withSecond(B second) {
        return new Quartet<>(first, second, third, fourth);
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public Quartet <A, B, C, D> withThird(C third) {
        return new Quartet<>(first, second, third, fourth);
    }
}
