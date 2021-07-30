package com.wissen;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c= new Calculator();
		assertEquals(20,c.add(10, 10));
	}
	
	@Test
	public void testSub() {
		Calculator c= new Calculator();
		assertEquals(0,c.sub(10, 10));
	}
	
	@Test
	public void testMul() {
		Calculator c= new Calculator();
		assertEquals(100,c.mul(10, 10));
	}
	
	@Test
	public void testDiv() {
		Calculator c= new Calculator();
		assertEquals(1,c.div(10, 10));
	}

}
