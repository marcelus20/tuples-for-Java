# Tuples

## Building the project
```bash
mvn clean install
```

## Modules
### Cardinal Tuples
They are tuples with restricted number of elements and type-enforced elements. You can add up to 4 elements to it and the following classes corresponds to the number of elements allowed in it:

* org.marcelus.tuples.cardinaltuples.TupleOf2
* org.marcelus.tuples.cardinaltuples.TupleOf3
* org.marcelus.tuples.cardinaltuples.TupleOf4

#### Instantiating Cardinal Tuples 
You can use the factory method: 
```java
import org.marcelus.tuples.cardinaltuples.TupleOf2;
import org.marcelus.tuples.cardinaltuples.TupleOf3;
import org.marcelus.tuples.cardinaltuples.TupleOf4;

public class Main(){
    
    public static void main(String... args){
        /**
         * Except for the TupleOf2, you only need to specify the generic type
         * of the last element in the tuple. The others will be inferred
         */
        TupleOf2<String, Integer> tupleOf2 = TupleOf2.tupleOf2("Jane", 20);
        TupleOf3<Boolean> tupleOf3 = TupleOf3.tupleOf3("Jane", 20, false);
        TupleOf4<Integer> tupleOf4 = TupleOf4.tupleOf4("Jane", 20, false, 0);
        
        // Accessing elements:
        // Accessing the second element of tupleOf2
        tupleOf2.get_2();
        
        // Accessing the second element of tupleOf3
        tupleOf3.get_3();
        
        // Accessing the first element of tupleOf2, tupleOf3, tupleOf4
        tupleOf2.get_1();
        tupleOf3.get_1();
        tupleOf4.get_1();
        
    }
}
```

### Dynamic Tuples
They are tuples with unlimited amount of elements in it. Its datastruture is composed of an array of objects, however 
it's immutability is enforced once the tuple is instantiated. 

```java
import org.marcelus.tuples.dynamictuples.Tuple;


public class Main(){
    
    public static void main(String... args){

        //Instantiating
        Tuple tuple = new Tuple("John", "Doe", 20, false, 1.73);
    
        // Geting elements
        tuple.get(2);
    }
}
```


