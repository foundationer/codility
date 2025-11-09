package org.mackenzie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CyclicRotationTest {

	private CyclicRotation rotation;

	@BeforeEach
	void setUp() {
		rotation = new CyclicRotation();
	}

	@Test
	void testEmpty() {
		int[] solution = rotation.solution(new int[] {}, 3);
		assertArrayEquals(new int[] {}, solution);
	}

	@Test
	void testNonEmpty() {
		int[] solution = rotation.solution(new int[] { 3, 8, 9, 7, 6 }, 3);
		assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, solution);
	}
}
