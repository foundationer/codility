package org.mackenzie;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {

	private TapeEquilibrium tape;

	@Before
	public void setUp() {
		tape = new TapeEquilibrium();
	}

	@Test
	public void testName() {
		assertEquals(0, tape.solution(new int[] {}, 1));
	}
}
