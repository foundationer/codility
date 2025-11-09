package org.mackenzie;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CarryOperationsTest {

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(65, 55, 2),
                Arguments.of(123, 456, 0),
                Arguments.of(555, 555, 3),
                Arguments.of(900, 11, 0),
                Arguments.of(145, 55, 2),
                Arguments.of(0, 0, 0),
                Arguments.of(1, 99999, 5),
                Arguments.of(999045, 1055, 5),
                Arguments.of(101, 809, 1),
                Arguments.of(189, 209, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void test(int a, int b, int expectedCarryOperations) {
        assertEquals(expectedCarryOperations, CarryOperations.numberOfCarryOperations(a, b));
    }
}
