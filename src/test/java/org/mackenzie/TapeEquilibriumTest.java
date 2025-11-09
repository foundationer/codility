package org.mackenzie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TapeEquilibriumTest {

	private TapeEquilibrium tape;

	@BeforeEach
	void setUp() {
		tape = new TapeEquilibrium();
	}

    @Disabled("Not working")
    @Test
	void testName() {
		assertEquals(0, tape.solution(new int[] {}, 1));
	}
}
