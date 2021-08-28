package com.company;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@Test
	public void Test1()
	{
		System.out.println("Test 1 Executed");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test 2 Executed");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Executed");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Executed");
	}

}
