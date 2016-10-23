package org.mackenzie;

public class CyclicRotation {

	public int[] solution(final int[] A, final int K) {
		if (A.length > 0) {
			for (int j = 1; j <= K; j++) {
				swap(A, K);
			}
		}
		return A;
	}

	private void swap(final int[] array, final int numberOfSteps) {
		int length = array.length;
		int last = array[length - 1];
		for (int i = length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = last;
	}
}
