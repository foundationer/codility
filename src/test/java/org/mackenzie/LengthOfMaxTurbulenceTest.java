package org.mackenzie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfMaxTurbulenceTest {

    private LengthOfMaxTurbulence solution;

    @BeforeEach
    void setUp() {
        solution = new LengthOfMaxTurbulence();
    }

    @Test
    void test1() {
        assertEquals(5, solution.solution(new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9}));
    }

    @Test
    void test2() {
        assertEquals(2, solution.solution(new int[] { 4, 8, 12, 16}));
    }

    @Test
    void test3() {
        assertEquals(1, solution.solution(new int[] { 100 }));
    }

    @Test
    void test4() {
        assertEquals(0, solution.solution(new int[] { }));
    }

    @Test
    @Disabled("Not working")
    void afterMath() {
        assertEquals(0, solution.solution(new int[] { 5, 5, 5, 5, 5, 5 }));
    }

}
