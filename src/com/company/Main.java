package com.company;

import com.company.tuples.Tuple;
import com.company.tuples.TupleOf3;
import com.company.tuples.TupleOf2;
import com.company.tuples.TupleOf4;
import com.company.tuples.coordinates.Point2D;
import com.company.tuples.coordinates.Point3D;
import com.company.tuples.coordinates.Point4D;

import java.util.ArrayList;
import java.util.List;

import static com.company.tuples.TupleOf2.tupleOf2;
import static com.company.tuples.TupleOf3.tupleOf3;
import static com.company.tuples.TupleOf4.tupleOf4;
import static com.company.tuples.coordinates.Point2D.point2D;
import static com.company.tuples.coordinates.Point3D.point3D;
import static com.company.tuples.coordinates.Point4D.point4D;

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
        Tuple anotherTupleOf3Elements = tupleOf3((TupleOf2)tupleOf2Elements, true);
        System.out.print("Tuple of 3: ");
        System.out.println(anotherTupleOf3Elements);

        /**
         * Testing tuple of 4 Elements
         */
        Tuple tupleOf4Elements = TupleOf4.tupleOf4(1, 3, false, new int[]{});
        System.out.print("Tuple of 4: ");
        System.out.println(tupleOf4Elements);

        //another way of intializing TupleOf4: 3 parameters:
        Tuple anotherTupleOf4Elements = tupleOf4((TupleOf3)tupleOf3Elements, 'j');
        System.out.print("Tuple of 4: ");
        System.out.println(anotherTupleOf4Elements);
        //another way of initializing tupleOf4: 3 paramters

        Tuple anotherTupleOf4Elements2 = TupleOf4.tupleOf4((TupleOf2)tupleOf2Elements, "java", 82);
        System.out.print("Tuple of 4: ");
        System.out.println(anotherTupleOf4Elements2);








        //========PERFORMING TESTS WITH COORDINATES=============


        Point2D coord2D = point2D("13", "14");
        Point2D coord2D_2 = point2D(13, 14);
        Point2D coord2D_3 = point2D(8.3, 15.5);
        System.out.println(coord2D);
        System.out.println(coord2D_2);
        System.out.println(coord2D_3);
        System.out.println("scaling coordindate coord2D by 3: "+ coord2D.scalePointBy(3));
        System.out.println("scaling coordindate coord2D by 3.8: "+ coord2D.scalePointBy(3.8));
        System.out.println(coord2D_3.translateZ(5));


        // testing 3Dcoordinate

        Point3D coord3D = point3D(1, 5, 3);

        //translating z by 15
        coord3D = coord3D.translateZ(15); // should return (1, 5, 18)
        System.out.println(coord3D);


        //testing 4D coordinates
        Point4D coord4D = point4D(1, 5, 3, 8).translateX("12");//(x+12)should return (13, 5, 3, 8)
        System.out.println(coord4D);



        //application of Tuples usage on the quadratic equation:

        //-3x^2 - 4x + 8 = 0 (output should be (-2.4305008740430605, -2.4305008740430605))

        System.out.println(quadraticEquation(-3.0,-4.0,8.0)); // returns a tuple of x1 and x2


        /**
         * Performing tests with the zip functions by packing with tuples.
         *
         *
         */
        List<Integer> x = new ArrayList<>();//FIRST LIST
        List<String>  y = new ArrayList<>();//SECOND LIST
        List<Boolean> z = new ArrayList<>();//THIRD LIST
        List<Character> a = new ArrayList<>(); // FORTH LISTA


        //ADDING ELEMENTS TO THE LISTS
        x.add(0);
        x.add(1);
        x.add(2);
        y.add("Kleber");
        y.add("Felipe");
        y.add("Sara");
        z.add(true);
        z.add(false);
        z.add(false);
        a.add('m');
        a.add('m');
        a.add('f');

        //ZIPING THE FOUR ARRAYS:
        System.out.println(zip(x, y, z, a));
        //OUTPUT SHOULD BE: [(0, Kleber, true, m), (1, Felipe, false, m), (2, Sara, false, f)]


    }


    public static TupleOf2 quadraticEquation(final Double termA, final Double termB, final Double termC){
        Double delta = Math.pow(termB,2)-4*(termA*termC);

        Double x1;
        Double x2;

        x1 = (-termB+Math.pow(delta, 0.5))/(2*termA);
        x2 = (-termB+Math.pow(delta, 0.5))/(2*termA);

        return (TupleOf2) tupleOf2(x1, x2);
    }





    public static <T, G> List<TupleOf2> zip (final List<T> argA, final List<G> argB){

        Integer index = 0;
        List<TupleOf2> zipped = new ArrayList<>();
        for(T arg : argA){

            zipped.add(tupleOf2(arg, argB.get(index)));
            index++;
        }

        return zipped;
    }

    public static <T, G, F> List<TupleOf3> zip (final List<T> argA, final List<G> argB, final List<F> argC){

        Integer index = 0;
        List<TupleOf3> zipped = new ArrayList<>();
        for(T arg : argA){

            zipped.add(tupleOf3(arg, argB.get(index), argC.get(index)));
            index++;
        }

        return zipped;
    }

    public static <T, G, F, E> List<TupleOf3> zip (final List<T> argA, final List<G> argB, final List<F> argC, List<E> argE){

        Integer index = 0;
        List<TupleOf3> zipped = new ArrayList<>();
        for(T arg : argA){

            zipped.add(tupleOf4(arg, argB.get(index), argC.get(index), argE.get(index)));
            index++;
        }

        return zipped;
    }



}
