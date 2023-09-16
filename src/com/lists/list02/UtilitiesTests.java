package com.lists.list02;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UtilitiesTests {

	Utilities utils;

	@Before
	public void setUp() {
		utils = new Utilities();
	}

	@Test
	public void SumTest() {
		int testArray[] = { 1, 2, 3, 4, 5, 6 };

		assertEquals(21, utils.sum(testArray));
	}

	@Test
	public void ShowEvenNumbersTest() {

	}

}
