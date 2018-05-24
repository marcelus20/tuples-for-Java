package com.company;

/**
 * The porpouse of using a Tuple class is to fit the need of using tuples, very common in functional programming languages
 * Java lacks Tuple, cause java is not a functional programming language. Due to this lack, I will be creating a Tuple
 * class to bring a bit of the functional programming into java.
 *
 * Tuples are like immutable lists
 */

public abstract class Tuple <T, G> {

    /**
     * the T type and G type represent the generic wrapper types
     * In other words, you could create a tuple of everything
     */

    protected final T _1;
    protected final G _2;

    protected Tuple(T _1, G _2) {
        this._1 = _1;
        this._2 = _2;
    }

    /**
     * getters
     * @return The attribute itself
     */
    public T get_1() {
        return _1;
    }

    public G get_2() {
        return _2;
    }

    @Override
    public String toString() {
        return "("+_1+", "+_2+")";
    }
}
