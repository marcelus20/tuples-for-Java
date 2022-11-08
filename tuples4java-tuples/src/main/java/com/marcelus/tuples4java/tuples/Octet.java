package com.marcelus.tuples4java.tuples;


import com.marcelus.tuples4java.tuples.ordinals.Eighth;
import com.marcelus.tuples4java.tuples.ordinals.Fifth;
import com.marcelus.tuples4java.tuples.ordinals.First;
import com.marcelus.tuples4java.tuples.ordinals.Fourth;
import com.marcelus.tuples4java.tuples.ordinals.Second;
import com.marcelus.tuples4java.tuples.ordinals.Seventh;
import com.marcelus.tuples4java.tuples.ordinals.Sixth;
import com.marcelus.tuples4java.tuples.ordinals.Third;

public class Octet <A, B, C, D, E, F, G, H> implements First<A>, Second<B>, Third<C>, Fourth<D>, Fifth<E>, Sixth<F>,
        Seventh<G>, Eighth<H> {

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;
    private final H eighth;

    private Octet(A first, B second, C third, D fourth, E fifth, F sixth, G seventh, H eighth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
    }

    @Override
    public H eighth() {
        return eighth;
    }

    @Override
    public Octet <A, B, C, D, E, F, G, H> withEighth(H eighth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public E fifth() {
        return fifth;
    }

    @Override
    public Octet <A, B, C, D, E, F, G, H> withFifth(E fifth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public A first() {
        return first;
    }

    @Override
    public Octet <A, B, C, D, E, F, G, H> withFirst(A first) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public D fourth() {
        return fourth;
    }

    @Override
    public Octet <A, B, C, D, E, F, G, H> withFourth(D fourth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public B second() {
        return second;
    }

    @Override
    public Octet <A, B, C, D, E, F, G, H> withSecond(B second) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public G seventh() {
        return seventh;
    }

    @Override
    public Octet <A, B, C, D, E, F, G, H> withSeventh(G seventh) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public F sixth() {
        return sixth;
    }

    @Override
    public Sixth<F> withSixth(F sixth) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public C third() {
        return third;
    }

    @Override
    public Third<C> withThird(C third) {
        return new Octet<>(first, second, third, fourth, fifth, sixth, seventh, eighth);
    }
}
