package org.mackenzie;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OddOccurrencesTest {

	private OddOccurrences oddity;

	@Before
	public void setUp() {
		oddity = new OddOccurrences();
	}

	@Test
	public void xxxTest() {
		assertEquals(7, oddity.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}
}
