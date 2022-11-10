package com.marcelus.tuples4java.tuples;

public interface Tuple {

    Integer size();

    static String wrapIfContainsComas(final Object object){
        if(String.valueOf(object).contains(",")){
            return String.format("'%s'",object);
        }else {
            return String.valueOf(object);
        }
    }
}
