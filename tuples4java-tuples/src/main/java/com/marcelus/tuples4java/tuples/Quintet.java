package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Third;

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
    public Quintet<A, B, C, D, E> withFifth(E fifth) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public A first() {
        return first;
    }

    @Override
    public Quintet<A, B, C, D, E> withFirst(A first) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public D fourth() {
        return fourth;
    }

    @Override
    public Quintet<A, B, C, D, E> withFourth(D fourth) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Quintet<A, B, C, D, E> withSecond(B second) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public Quintet<A, B, C, D, E> withThird(C third) {
        return new Quintet<>(first, second, third, fourth, fifth);
    }
}
