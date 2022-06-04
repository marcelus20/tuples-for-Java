package org.marcelus.tuples.dynamictuples.exceptions;

public class IndexOutBoundInTupleException extends Throwable {

    public IndexOutBoundInTupleException(){
        super("The index provided is out of bound for this Tuple instance.");
    }
}
