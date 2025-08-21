package com.junit_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {
	
	@Test
	public void add_test() {
		Calculator calculator=new Calculator();
		int expected_value=50;
		int actual_value=calculator.add(20, 30);
		
		Assertions.assertEquals(expected_value, actual_value);
	}
	
	@Test
	public void mul_test() {
		Calculator calculator=new Calculator();
		int expected_value=50;
		int actual_value=calculator.mul(5, 10);
		
		Assertions.assertEquals(expected_value, actual_value);
	}
}
