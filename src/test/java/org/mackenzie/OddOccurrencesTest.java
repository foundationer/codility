package org.mackenzie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OddOccurrencesTest {

	private OddOccurrences oddity;

	@BeforeEach
	void setUp() {
		oddity = new OddOccurrences();
	}

	@Test
	void xxxTest() {
		assertEquals(7, oddity.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}
}
