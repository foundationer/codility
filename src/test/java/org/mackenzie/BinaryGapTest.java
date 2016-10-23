package org.mackenzie;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {

	private BinaryGap gap;

	@Before
	public void setUp() {
		gap = new BinaryGap();
	}

	@Test
	public void test() {
		assertEquals(2, gap.solution(9));
	}
}
