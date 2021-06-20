package com.ecommerce.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Junit5 Repeated Tests Example")
@RunWith(JUnitPlatform.class)
public class RepeatableTestClass {

	@BeforeAll
	public static void init()
	{
		System.out.println("Before All init() method called");
	}
	
	@BeforeEach
	public void initEach()
	{
		System.out.println("Before Each initEach method called");
	}
	
	@AfterEach
	public void cleanUp()
	{
		System.out.println("After Each cleanUp method called");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("After All cleanup");
	}
	
	@Test
	@DisplayName("Add operation test")
	@RepeatedTest(2)
	void addNumber(TestInfo testinfo)
	{
		Calculator calc = new Calculator();
		Assertions.assertEquals(2, calc.add(1, 1),"1+1 should equal 2");;
		System.out.println("**********addNumber testcase executed******");		
	}
	
}
