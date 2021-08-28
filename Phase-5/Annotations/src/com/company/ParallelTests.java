package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {

	WebDriver driver;
	WebDriver driverFirefox;
	
	@Test(groups="chrome")
	public void LaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/home/sathishtipofeve/Downloads/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(groups="chrome", dependsOnMethods="LaunchChrome")
	public void TryFacebook1()
	{
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("ravistudent@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("randompassword");
		driver.findElement(By.name("login")).click();
	}
	
	@Test(groups="firefox")
	public void LaunchFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "/home/sathishtipofeve/Downloads/geckodriver.exe");
		
		driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://www.facebook.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(groups="firefox", dependsOnMethods="LaunchFirefox")
	public void TryFacebook2()
	{
		System.out.println(Thread.currentThread().getId());
		driverFirefox.findElement(By.id("email")).sendKeys("ravistudent@gmail.com");
		driverFirefox.findElement(By.id("pass")).sendKeys("randompassword");
		driverFirefox.findElement(By.name("login")).click();
	}
	
	
}
