package com.marcelus.tuples4java.tuples;

public interface Tuple {

    enum Conditions{
        PARAM_NULL("Array cannot be null"),
        WRONG_SIZE("Array or List must contain the exact number of elements that the tuple supports.");

        private final String message;

        Conditions(String message) {
            this.message= message;
        }

        public String getMessage() {
            return message;
        }
    }

    Integer size();



}
