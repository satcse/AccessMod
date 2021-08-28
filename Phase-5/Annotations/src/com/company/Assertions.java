package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	SoftAssert soft = new SoftAssert();
	WebDriver driver;
	
	@Test
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test(dependsOnMethods="Launch")
	public void Facebook()
	{
		driver.get("https://www.facebook.com");
		soft.assertEquals("fdfsfFacebook - Log In or Sign Up", driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="Facebook")
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("sample@xyz.com");
		driver.findElement(By.id("pass")).sendKeys("dfsdfdfdfdf");
		driver.findElement(By.name("login")).click();
		soft.assertAll();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
