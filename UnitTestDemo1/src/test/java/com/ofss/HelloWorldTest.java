package com.ofss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
// testing code
class HelloWorldTest {

	@Test
	void testSayHello() {
		// unit testing code for testing "sayHello()" method
		HelloWorld hw=new HelloWorld();
		String actual=hw.sayHello();
		String expected="Hello"; // intentionally making this to fail to demo you
		// compare if actual is equal to expected, if so, unit testing passes
		// if not, unit testing fails, you need to look at the dev code for 
		// any fix required
		assertEquals(expected, actual);
	}
	
	// If you don't add this @Test annotation, this method will not be considered as a test case
	@Test
	void testCalculateSimpleInterest()
	{
		// unit testing code for testing "calculateInterest()" method
		HelloWorld hw=new HelloWorld();
		double actual=hw.calculateSimpleInterest(1000, 0.1, 1);
		double expected=1100;
		// compare if actual is equal to expected, if so, unit testing passes
		// if not, unit testing fails, you need to look at the dev code for 
		// any fix required
		assertEquals(expected, actual);
	}
}
