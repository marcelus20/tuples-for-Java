package com.company;

import com.company.tuples.Tuple;
import com.company.tuples.TupleOf3;
import com.company.tuples.Tupleof2;

import static com.company.tuples.Tupleof2.tupleOf2;
import static com.company.tuples.TupleOf3.tupleOf3;
import static com.company.tuples.Tupleof4.tupleof4;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //testing tuples

        /**
         * Testing tupleof2
         */
        Tuple tupleOf2Elements = tupleOf2("Hello", 3.58);
        System.out.print("Tuple of 2: ");
        System.out.println(tupleOf2Elements);

        /**
         * Testing tuple of 3
         */

        //first way of initializing: 3 parameters
        Tuple tupleOf3Elements = tupleOf3("Boll", false, 3);
        System.out.print("Tuple of 3: ");
        System.out.println(tupleOf3Elements);

        //second way of initializing, through another tuple of 2: 2 parameters
        //I will be using a tupleof2Elements earlier on created
        Tuple anotherTupleOf3Elements = tupleOf3((Tupleof2)tupleOf2Elements, true);
        System.out.print("Tuple of 3: ");
        System.out.println(anotherTupleOf3Elements);

        /**
         * Testing tuple of 4 Elements
         */
        Tuple tupleOf4Elements = tupleof4(1, 3, false, new int[]{});
        System.out.print("Tuple of 4: ");
        System.out.println(tupleOf4Elements);

        //another way of intializing TupleOf4: 3 parameters:
        Tuple anotherTupleOf4Elements = tupleof4((TupleOf3)tupleOf3Elements, 'j');
        System.out.print("Tuple of 4: ");
        System.out.println(anotherTupleOf4Elements);
        //another way of initializing tupleOf4: 3 paramters

        Tuple anotherTupleOf4Elements2 = tupleof4((Tupleof2)tupleOf2Elements, "java", 82);
        System.out.print("Tuple of 4: ");
        System.out.println(anotherTupleOf4Elements2);

    }
}
