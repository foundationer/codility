package org.mackenzie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstPositiveIntegerNotInCollectionTest {

    private FirstPositiveIntegerNotInCollection solution;

    @BeforeEach
    void setUp() {
        solution = new FirstPositiveIntegerNotInCollection();
    }

    @Test
    void test1() {
        assertEquals(5, solution.solution(new int[] { 1, 3, 6, 4, 1, 2 }));
    }
}
