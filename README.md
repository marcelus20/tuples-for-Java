# tuples-coordinates-functionalProg
As java lacks the use of tuples, this project shows how to build and create tuples in java and how you can create coordinates out of the use of tuples


<h3>The use of tuples</h3>
<p backgraound="silver">
  Tuples can be used when you feel the need of using immutable lists that may contain different types of variable,
  for instance, you can have the a cardinalTuple of an Integer as first element and String as second element.
<p>

<h3>How to make an static import</h3>

Supposing your class is at the com.jetbrains package:
<h4>Using static importation:</h4>
<code>import static com.company.tuples.TupleOf2.tupleOf2;</code>

<h4>Using regular importation:</h4>
<code>import com.company.tuples.TupleOf2</code>

<h3>How to initialize</h3>
<h4>Using static importation:</h4>
<code>Tuple myTuple = tupleOf2("Value", 3.5)</code>

<h4>Using regular importation:</h4>
<code>Tuple myTuple = TupleOf2.tupleOf2("Age", 28)</code>

<h3> Coordinates</h3>
<p backgraound="silver">
  The Points are classes that extends Tuples. You can create up to 4D coordinate using Points classes:
<p>

<h3>How to make an static import of Points</h3>

Supposing your class is at the com.jetbrains package:
<h4>Using static importation:</h4>
<code>import static com.company.tuples.coordinates.Point3D.point3D;</code>

<h4>Using regular importation:</h4>
<code>import static com.company.tuples.coordinates.Point3D</code>

<h3>How to initialize</h3>
<h4>Using static importation:</h4>
<code>Point3D myCoordinate = point3D(3.0, 3.5, -1.8)</code>

<h4>Using regular importation:</h4>
<code>Point3D myTuple = Point3D.point3D(2.4, 28.8, 5.0)</code><br/>


elements can be many types, Strings, Booleans, Point3D, it does not really matter, they are all generic type
