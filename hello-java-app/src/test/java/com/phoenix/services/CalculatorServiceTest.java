package com.phoenix.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.phoenix.math.Calculator;

public class CalculatorServiceTest {
	
	private CalculatorService calService;
	
	@Before
	public void setup()
	{
		calService=new CalculatorService(new Calculator());
		
	}
	@Test
	public void  testAddition()
	{
		assertEquals(30,calService.addition(10,20));
	}
	
	@After
	public void tearDown()
	{
		calService=null;
	}
	
	

}
