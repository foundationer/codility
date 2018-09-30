package org.mackenzie;

import java.util.Arrays;

public class OddOccurrences {

	public int solution(final int[] A) {
		return Arrays.stream(A)
				.filter(integer -> ocurrences(A, integer) == 1)
				.findFirst()
				.getAsInt();
	}

	public long ocurrences(final int[] array, final int element) {
		return Arrays.stream(array).filter(a -> a == element).count();
	}
}
