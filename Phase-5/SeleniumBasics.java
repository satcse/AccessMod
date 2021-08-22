package com.companyname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {
	
	public static void main(String[] args)
	{
		//Firefox Browser
		System.setProperty("webdriver.gecko.driver", "/home/sathishtipofeve/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*//Chrome Browser
		System.setProperty("webdriver.chrome.driver","/home/downloads/chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();*/
		
		String baseUrl = "http://www.facebook.com";
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = "";
		String tagName ="";
		
		//Launch firefox browser and openup the baseUrl above.
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
			System.out.println("Test Failed");
		
		// Selenium Testing using Locators
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		System.out.println("2.) "+driver.findElement(By.name("email")).getTagName());
		
		// Selenium Testing using CSS Locators
		System.out.println("3.) "+driver.findElement(By.className("_6lux")).getTagName());
		System.out.println("4.) "+driver.findElement(By.cssSelector("input#email")).getTagName());
		System.out.println("5.) "+driver.findElement(By.cssSelector("input.inputtext")).getTagName());
		System.out.println("6.) "+driver.findElement(By.cssSelector("input[name=email]")).getTagName());
		
		//XPath
		System.out.println("XPath: "+driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).getTagName());
	}

}
