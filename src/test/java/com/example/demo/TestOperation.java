package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestOperation {
	@Test
	void testSquare() {
		assertTrue(Operation.square(10)==100);
	}
	
	@Test
	void testOpposite() {
		assertTrue(Operation.opposite(-2)==2);
	}

}
