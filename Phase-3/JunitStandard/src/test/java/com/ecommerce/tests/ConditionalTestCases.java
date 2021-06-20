package com.ecommerce.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Junit 5 Conditional TestCases Example")
@RunWith(JUnitPlatform.class)
public class ConditionalTestCases {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows()
	{
		System.out.println("This runs only on Windows");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux()
	{
		System.out.println("This runs only on Linux");
	}
	
	@Test
	@DisabledIf("Math.random() < 0.314159")
	public void mightNotBeExecuted()
	{
		System.out.println("This may or may not get executed");
	}
}
