package com.marcelus.tuples4java.collectibletuples;

import java.util.List;

public interface CollectibleTuple extends com.marcelus.tuples4java.tuples.Tuple {

    Object[] toArray();

    List<Object> toList();
}
