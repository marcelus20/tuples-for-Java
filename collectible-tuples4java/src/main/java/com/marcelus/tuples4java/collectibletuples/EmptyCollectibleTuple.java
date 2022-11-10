package com.marcelus.tuples4java.collectibletuples;

import com.marcelus.tuples4java.tuples.EmptyTuple;

import java.util.ArrayList;
import java.util.List;

public class EmptyCollectibleTuple implements CollectibleTuple {

    private final EmptyTuple emptyTuple;

    private EmptyCollectibleTuple(){
        emptyTuple = EmptyTuple.newInstance();
    }

    public static EmptyCollectibleTuple newInstance(){
        return new EmptyCollectibleTuple();
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public List<Object> toList() {
        return new ArrayList<>();
    }

    @Override
    public Integer size() {
        return emptyTuple.size();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof EmptyCollectibleTuple;
    }

    @Override
    public int hashCode() {
        return EmptyCollectibleTuple.class.hashCode();
    }

    @Override
    public String toString() {
        return emptyTuple.toString();
    }
}
