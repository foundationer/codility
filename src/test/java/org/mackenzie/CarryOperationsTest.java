package org.mackenzie;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class CarryOperationsTest {

    @DataPoints
    public static Integer[][] dataPoints() {
        return new Integer[][]{
                new Integer[]{65, 55, 2},
                new Integer[]{123, 456, 0},
                new Integer[]{555, 555, 3},
                new Integer[]{900, 11, 0},
                new Integer[]{145, 55, 2},
                new Integer[]{0, 0, 0},
                new Integer[]{1, 99999, 5},
                new Integer[]{999045, 1055, 5},
                new Integer[]{101, 809, 1},
                new Integer[]{189, 209, 1}
        };
    }

    @Theory
    public void test(Integer[] parameters) {
        assertEquals(parameters[2].intValue(), CarryOperations.numberOfCarryOperations(parameters[0], parameters[1]));
    }
}
