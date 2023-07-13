package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class AddTest {

	@Test
	void myAddTest(TestInfo testInfo) {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(1, 4), "1 + 4 should equal 5");
		
	}

}
