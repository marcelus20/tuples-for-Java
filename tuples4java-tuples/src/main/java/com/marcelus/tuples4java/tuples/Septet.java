package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Seventh;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;

public class Septet <A, B, C, D, E, F, G> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G> {

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
    public Septet <A, B, C, D, E, F, G> withFifth(E fifth) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public A first() {
        return first;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withFirst(A first) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public D fourth() {
        return fourth;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withFourth(D fourth) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withSecond(B second) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public G seventh() {
        return seventh;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withSeventh(G seventh) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public F sixth() {
        return sixth;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withSixth(F sixth) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public Septet <A, B, C, D, E, F, G> withThird(C third) {
        return new Septet<>(first, second, third, fourth, fifth, sixth, seventh);
    }
}
