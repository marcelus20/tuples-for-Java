package com.marcelus.tuples4java.tuples;

import java.util.List;

public interface Tuple {

    Integer size();

    Object[] toArray();

    List<Object> toList();

    static String wrapIfContainsComas(final Object object){
        if(String.valueOf(object).contains(",")){
            return String.format("'%s'",object);
        }else {
            return String.valueOf(object);
        }
    }
}
