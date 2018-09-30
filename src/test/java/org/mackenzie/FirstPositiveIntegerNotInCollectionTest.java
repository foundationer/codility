package org.mackenzie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstPositiveIntegerNotInCollectionTest {

    private FirstPositiveIntegerNotInCollection solution;

    @Before
    public void setUp() {
        solution = new FirstPositiveIntegerNotInCollection();
    }

    @Test
    public void test1() {
        assertEquals(5, solution.solution(new int[] { 1, 3, 6, 4, 1, 2 }));
    }
}
