package com.companyname;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnaphsotsExample {

	public static void main(String args[])
	{
			System.setProperty("webdriver.gecko.driver", "/home/sathishtipofeve/Downloads/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.flipkart.com/");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File scr = ts.getScreenshotAs(OutputType.FILE); //Ctrl + Shift + O to add dependencies
			
			try {
				FileUtils.copyFile(scr, new File("/home/sathishtipofeve/Downloads/screenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
