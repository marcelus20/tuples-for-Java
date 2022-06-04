package org.marcelus.tuples.dynamictuples;

import org.marcelus.tuples.dynamictuples.exceptions.IndexOutBoundInTupleException;

import java.util.Arrays;

public class Tuple {
    private final Object[] elements;

    Tuple(final Object... elements){
        this.elements = elements;
    }

    public Object get(final int index) throws IndexOutBoundInTupleException {
        try{
            return elements[index];
        }catch (Exception e){
            throw new IndexOutBoundInTupleException();
        }
    }

    @Override
    public String toString() {
        return String.format(
                "(%s)",
                Arrays.stream(elements).reduce("", this::reduceHelper)
        );
    }

    private Object reduceHelper(Object acc, Object element) {
        if(((String)acc).length() == 0){
            return element;
        }else{
            return String.format("%s, %s", acc, element);
        }
    }
}
