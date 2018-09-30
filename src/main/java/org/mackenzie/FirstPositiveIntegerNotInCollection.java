package org.mackenzie;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstPositiveIntegerNotInCollection {

    // Find first positive number not contained in a given array

    public int solution(int[] A) {
        Set<Integer> ints = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toSet());
        return IntStream.iterate(1, i -> i+1)
                .filter(i -> !ints.contains(i))
                .findFirst()
                .getAsInt();
    }
}
