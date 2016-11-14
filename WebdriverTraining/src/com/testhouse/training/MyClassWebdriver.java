package com.testhouse.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyClassWebdriver extends GeneralFunctions {
	@Test
	public void webDriverTraining(){
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hotels')]")).click();
		
	}

}
