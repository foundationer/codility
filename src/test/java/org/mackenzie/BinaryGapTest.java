package org.mackenzie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryGapTest {

	private BinaryGap gap;

	@BeforeEach
	void setUp() {
		gap = new BinaryGap();
	}

	@Test
	void test() {
		assertEquals(2, gap.solution(9));
	}
}
