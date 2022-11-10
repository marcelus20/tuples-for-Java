# Tuple4java

Lib for creating tuples in java. 

## Modules: 

- [regular tuples4java module](tuples4java/README.md)
- [collectible tuple4java module](collectible-tuples4java/README.md)

## Features

Tuples4Java comes with 9 Tuples starting from an EmptyTuple (size 0) all the way to an Octet (size 8). 

- [EmptyTuple](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/EmptyTuple.java) - Tuple of 0 elements.
- [Unit](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Unit.java)```<A>``` - Tuple of 1 elements.
- [Pair](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Pair.java)```<A, B>``` - Tuple of 2 elements.
- [Triplet](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Triplet.java)```<A, B, C>``` - Tuple of 3 elements.
- [Quartet](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Quartet.java)```<A, B, C, D>``` - Tuple of 4 elements.
- [Quintet](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Quintet.java)```<A, B, C, D, E>``` - Tuple of 5 elements.
- [Sextet](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Sextet.java)```<A, B, C, D, E, F>``` - Tuple of 6 elements.
- [Septet](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Septet.java)```<A, B, C, D, E, F, H>``` - Tuple of 7 elements.
- [Octet](tuples4java/src/main/java/com/marcelus/tuples4java/tuples/Octet.java)```<A, B, C, D, E, F, H, I>``` - Tuple of 8 elements.


## Differences between modules: 

### Regular Tuples4java

This module doesn't come with the fromArray, fromList, toArray or toList methods. 
Module focused on the basic storing of value inside a Tuple.

### Collectible Tuples4java

Module comes with the fromArray, fromList, toArray and toList methods. When performing the *from* operations, 
the method won't through, but will return an ```Either<EmptyTuple, Tuple>``` instead. EmptyTuple indicates
the operation didn't succeed when converting from array or from list. 

---

## To install

### Regular Tuples4java

Check the Regular Tuples4java [README.md](tuples4java/README.md)

### Collectible Tuples4java

Check the Collectible Tuples4java [README.md](collectible-tuples4java/README.md)

### Installing from the parent folder

You can install the both modules at once by issuing the **mvn clean install** at the parent pom. However, for building Collectible-Tuples4java, an external lib called 
[marcelus20/jvalidators](https://github.com/marcelus20/jvalidators#readme) needs to be installed before-hand. 

Check the [Collectible Tuples4java README.md](collectible-tuples4java/README.md) for more details. These extra-steps is needed until this lib is available at the Maven Repository.

---

### Module Class Names

Both modules contains classes with the same name, for example, the class Pair belongs to either collectible-tuples4java
or tuples4java module. Therefore, the invoking of both classes at once will require the fully qualified name of the class
to differentiate one another: 
- com.marcelus.tuples4java.collectibletuples.Pair<A, B>
- com.marcelus.tuples4java.tuples.Pair<A, B>

Only use the collectibletuples if you need to do some array or list operations, like, converting to array, or creating
the tuple from the array. If your object is just to store data inside a tuple, use the regular tuple4java module. 

---

### Examples:

Check the [tuples4Java.Pair](tuples4java/src/test/java/com/marcelus/tuples4java/tuples) and 
[collectible-tuples4java](/home/foo/dev/tuples-for-Java/collectible-tuples4java/src/test/java) test cases.

---

### Contributions

Feel free to contribute, just please consider the following:
- All tuples4java software is distributed under the GNU General Public open source license, and your contributions will be licensed in the same way.
- Open Pull Requests with the new codes containing passing test cases.
- Create an issue if you want to discuss a new idea.

---

## License

[GNU GENERAL PUBLIC LICENSE](LICENSE)
