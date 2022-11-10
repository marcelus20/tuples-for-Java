import com.marcelus.tuples4java.collectibletuples.EmptyCollectibleTuple;
import com.marcelus.tuples4java.collectibletuples.Quintet;
import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuintetTest {

    @Test
    void testingWithFirstScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road', false, 3.5)", modifiedQuartet.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet.of("John", 25, "75, fictional road", false,
                3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road', false, 3.5)", modifiedQuartet.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedPair = quintet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road', false, 3.5)", modifiedPair.toString());
    }

    @Test
    void testingWithFourthScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withFourth(true);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', true, 3.5)", modifiedQuartet.toString());
    }

    @Test
    void testingWithFifthScenario(){
        // Given
        Quintet<String, Integer, String, Boolean, Double> quintet = Quintet
                .of("John", 25, "75, fictional road", false, 3.5);

        // When
        Quintet<String, Integer, String, Boolean, Double> modifiedQuartet = quintet.withFifth(4.8);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 4.8)", modifiedQuartet.toString());
    }

    @Test
    void fromArrayHappyScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false, true, true};

        // When
        final Either<EmptyCollectibleTuple, Quintet<Boolean, Boolean, Boolean, Boolean,
                Boolean>> quintetEither = Quintet.fromArray(array);

        // Then
        assertEquals("(false, false, false, true, true)", quintetEither.get().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromArrayNullScenario(final Boolean[] array){
        // When
        final Either<EmptyCollectibleTuple, Quintet<Boolean, Boolean, Boolean, Boolean,
                Boolean>> quintetEither = Quintet.fromArray(array);

        // Then
        assertEquals("()", quintetEither.getLeft().toString());
    }

    @Test
    void fromArrayWrongSizeScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false};

        // When
        final Either<EmptyCollectibleTuple, Quintet<Boolean, Boolean, Boolean, Boolean,
                Boolean>> quintetEither = Quintet.fromArray(array);

        // Then
        assertEquals("()", quintetEither.getLeft().toString());
    }

    @Test
    void fromListHappyScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true);

        // When
        final Either<EmptyCollectibleTuple, Quintet<Boolean, Boolean, Boolean, Boolean,
                Boolean>> quintetEither = Quintet.fromList(array);

        // Then
        assertEquals("(false, false, false, true, true)", quintetEither.get().toString());
    }

    @Test
    void fromListWrongSizeScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true, true);

        // When
        final Either<EmptyCollectibleTuple, Quintet<Boolean, Boolean, Boolean, Boolean,
                Boolean>> quintetEither = Quintet.fromList(array);

        // Then
        assertEquals("()", quintetEither.getLeft().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromListNullScenario(final List<Boolean> array){
        // When
        final Either<EmptyCollectibleTuple, Quintet<Boolean, Boolean, Boolean, Boolean,
                Boolean>> quintetEither = Quintet.fromList(array);

        // Then
        assertEquals("()", quintetEither.getLeft().toString());
    }

    @Test
    void testingToList(){
        Assertions.assertEquals(5, Quintet.of(1, true, 5.3, 1L, "foo")
                .toList().size());
    }

    @Test
    void testingToArray(){
        Assertions.assertArrayEquals(new Object[]{1, true, 3.5, 1L, "foo"}, Quintet.of(1, true, 3.5, 1L,
                        "foo").toArray());
    }

    @Test
    void checkingSize(){
        Assertions.assertEquals(5, Quintet.of(false, false, "prince", 10,
                50).size());
    }

}