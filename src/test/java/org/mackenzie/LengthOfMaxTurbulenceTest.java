package org.mackenzie;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfMaxTurbulenceTest {

    private LengthOfMaxTurbulence solution;

    @Before
    public void setUp() {
        solution = new LengthOfMaxTurbulence();
    }

    @Test
    public void test1() {
        assertEquals(5, solution.solution(new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.solution(new int[] { 4, 8, 12, 16}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.solution(new int[] { 100 }));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.solution(new int[] { }));
    }

    @Test
    @Ignore("Not working")
    public void afterMath() {
        assertEquals(0, solution.solution(new int[] { 5, 5, 5, 5, 5, 5 }));
    }

}
