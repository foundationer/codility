package org.mackenzie;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {

	private CyclicRotation rotation;

	@Before
	public void setUp() {
		rotation = new CyclicRotation();
	}

	@Test
	public void testEmpty() {
		int[] solution = rotation.solution(new int[] {}, 3);
		assertArrayEquals(new int[] {}, solution);
	}

	@Test
	public void testNonEmpty() {
		int[] solution = rotation.solution(new int[] { 3, 8, 9, 7, 6 }, 3);
		assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, solution);
	}
}
