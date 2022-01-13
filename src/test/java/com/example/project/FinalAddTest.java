package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class FinalAddTest {

	@Test
	void myAddTest1(TestInfo testInfo1) {
		Calculator calculator = new Calculator();
		assertEquals(7, calculator.add(2, 5), "2+5 should equal 7");
		
	}

}
