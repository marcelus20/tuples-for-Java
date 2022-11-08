package com.marcelus.tuples4java.tuples.ordinals;

public interface Second<T>{

    T second();
    Second<T> withSecond(final T second);
}
