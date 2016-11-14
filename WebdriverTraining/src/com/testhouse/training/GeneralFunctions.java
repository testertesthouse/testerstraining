package com.testhouse.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GeneralFunctions {
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void browserIn(String browser)
	{
		if(browser.equalsIgnoreCase("FF"))
		{
		driver = new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.getProperty("chrome", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		}
	@AfterMethod
	public void browserOut()
	{
		driver.close();
		driver.quit();
		System.out.println("Test");
	}
}
