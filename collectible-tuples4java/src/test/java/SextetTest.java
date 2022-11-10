import com.marcelus.tuples4java.collectibletuples.EmptyCollectibleTuple;
import com.marcelus.tuples4java.collectibletuples.Sextet;
import io.vavr.control.Either;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SextetTest {


    @Test
    void testingWithFirstScenario(){
        // Given
        Sextet<String, Integer, String, Boolean, Double, String> sextet = Sextet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A");

        // When
        Sextet<String, Integer, String, Boolean, Double, String> modifiedSextet = sextet.withFirst("James");


        // Then
        Assertions.assertEquals("(James, 25, '75, fictional road', false, 3.5, Blood Type A)", modifiedSextet.toString());
    }

    @Test
    void testingWithSecondScenario(){
        // Given
        Sextet<String, Integer, String, Boolean, Double, String> sextet = Sextet.of("John", 25, "75, fictional road",
                false, 3.5, "Blood Type A");

        // When
        Sextet<String, Integer, String, Boolean, Double, String> modifiedSextet = sextet.withSecond(26);


        // Then
        Assertions.assertEquals("(John, 26, '75, fictional road', false, 3.5, Blood Type A)", modifiedSextet.toString());
    }

    @Test
    void testingWithThirdScenario(){
        // Given
        Sextet<String, Integer, String, Boolean, Double, String> sextet = Sextet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A");

        // When
        Sextet<String, Integer, String, Boolean, Double, String> modifiedSextet = sextet.withThird("10, foo road");


        // Then
        Assertions.assertEquals("(John, 25, '10, foo road', false, 3.5, Blood Type A)", modifiedSextet.toString());
    }

    @Test
    void testingWithFourthScenario(){
        // Given
        Sextet<String, Integer, String, Boolean, Double, String> sextet = Sextet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A");

        // When
        Sextet<String, Integer, String, Boolean, Double, String> modifiedSextet = sextet.withFourth(true);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', true, 3.5, Blood Type A)", modifiedSextet.toString());
    }

    @Test
    void testingWithFifthScenario(){
        // Given
        Sextet<String, Integer, String, Boolean, Double, String> sextet = Sextet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A");

        // When
        Sextet<String, Integer, String, Boolean, Double, String> modifiedSextet = sextet.withFifth(4.8);


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 4.8, Blood Type A)", modifiedSextet.toString());
    }

    @Test
    void testingWithSixthScenario(){
        // Given
        Sextet<String, Integer, String, Boolean, Double, String> sextet = Sextet
                .of("John", 25, "75, fictional road", false, 3.5, "Blood Type A");

        // When
        Sextet<String, Integer, String, Boolean, Double, String> modifiedSextet = sextet.withSixth("Blood Type -O");


        // Then
        Assertions.assertEquals("(John, 25, '75, fictional road', false, 3.5, Blood Type -O)", modifiedSextet.toString());
    }

    @Test
    void fromArrayHappyScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false, false, true, true, false};

        // When
        final Either<EmptyCollectibleTuple, Sextet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean>> sextetEither = Sextet.fromArray(array);

        // Then
        assertEquals("(false, false, false, true, true, false)", sextetEither.get().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromArrayNullScenario(final Boolean[] array){
        // When
        final Either<EmptyCollectibleTuple, Sextet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean>> sextetEither = Sextet.fromArray(array);

        // Then
        assertEquals("()", sextetEither.getLeft().toString());
    }

    @Test
    void fromArrayWrongSizeScenario(){
        // Given
        final Boolean[] array = new Boolean[]{false, false};

        // When
        final Either<EmptyCollectibleTuple, Sextet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean>> sextetEither = Sextet.fromArray(array);

        // Then
        assertEquals("()", sextetEither.getLeft().toString());
    }

    @Test
    void fromListHappyScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false, false, false, true, true, true);

        // When
        final Either<EmptyCollectibleTuple, Sextet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean>> sextetEither = Sextet.fromList(array);

        // Then
        assertEquals("(false, false, false, true, true, true)", sextetEither.get().toString());
    }

    @Test
    void fromListWrongSizeScenario(){
        // Given
        final List<Boolean> array = Arrays.asList(false);

        // When
        final Either<EmptyCollectibleTuple, Sextet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean>> sextetEither = Sextet.fromList(array);

        // Then
        assertEquals("()", sextetEither.getLeft().toString());
    }

    @ParameterizedTest
    @NullSource
    void fromListNullScenario(final List<Boolean> array){
        // When
        final Either<EmptyCollectibleTuple, Sextet<Boolean, Boolean, Boolean, Boolean,
                Boolean, Boolean>> sextetEither = Sextet.fromList(array);

        // Then
        assertEquals("()", sextetEither.getLeft().toString());
    }

    @Test
    void testingToList(){
        Assertions.assertEquals(6, Sextet.of(1, true, 5.3, 1L, "foo",
                        "bar")
                .toList().size());
    }

    @Test
    void testingToArray(){
        Assertions.assertArrayEquals(new Object[]{1, true, 3.5, 1L, "foo", "bar"}, Sextet.of(1, true,
                3.5, 1L,"foo", "bar").toArray());
    }

    @Test
    void checkingSize(){
        Assertions.assertEquals(6, Sextet.of(false, false, "prince", 10,
                50, "foo").size());
    }

}