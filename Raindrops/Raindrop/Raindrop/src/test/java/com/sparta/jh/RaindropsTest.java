
import com.sparta.jh.raindropsclass.Raindrops;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class RaindropsTest {
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 24})
    @DisplayName("Given that a number is divisible by 3 it should return \"Pling\"")
    void testThreeReturnsPling(int number) {
        Assertions.assertEquals("Pling", Raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    @DisplayName("Given that a number is divisible by 5 it should return \"Plang\"")
    void testFiveReturnsPlang(int number) {
        Assertions.assertEquals("Plang", Raindrops.plingPlangPlong(number));
    }


    @ParameterizedTest
    @ValueSource(ints = {7, 14, 28})
    @DisplayName("Given that a number is divisible by 7 it should return \"Plong\"")
    void testSevenReturnsPlong(int number) {
        Assertions.assertEquals("Plong", Raindrops.plingPlangPlong(number));
    }

    @ParameterizedTest
    @MethodSource("divisibleByThreeAndFive")
    @DisplayName("Given that a number is divisible by 3 and 5 it should return \"PlingPlang\"")
    void threeAndFive(int number, String expected) {
        Assertions.assertEquals(expected, Raindrops.plingPlangPlong(number));
    }
    private static Stream<Arguments> divisibleByThreeAndFive(){
        return Stream.of(Arguments.arguments((3*5), "PlingPlang"),
                Arguments.arguments((3*10), "PlingPlang"),
                Arguments.arguments((3*15), "PlingPlang"),
                Arguments.arguments((3*20), "PlingPlang"));
    }
    @ParameterizedTest
    @MethodSource("divisibleByThreeAndSeven")
    @DisplayName("Given that a number is divisible by 3 and 7 it should return \"PlingPlong\"")
    void threeAndSeven(int number, String expected) {
        Assertions.assertEquals(expected, Raindrops.plingPlangPlong(number));
    }
    private static Stream<Arguments> divisibleByThreeAndSeven(){
        return Stream.of(Arguments.arguments((3*7), "PlingPlong"),
                Arguments.arguments((3*14), "PlingPlong"));
    }

    @ParameterizedTest
    @MethodSource("divisibleByFiveAndSeven")
    @DisplayName("Given that a number is divisible by 5 and 7 it should return \"PlingPlong\"")
    void fiveAndSeven(int number, String expected) {
        Assertions.assertEquals(expected, Raindrops.plingPlangPlong(number));
    }
    private static Stream<Arguments> divisibleByFiveAndSeven(){
        return Stream.of(Arguments.arguments((7*10), "PlangPlong"),
                Arguments.arguments(7*20, "PlangPlong"));
    }
    @Test
    @DisplayName("Given that a number is not divisible by 3, 5 or 7 it should return the number")
    void returnNumber(){
        Assertions.assertEquals("34", Raindrops.plingPlangPlong(34));
    }



}


