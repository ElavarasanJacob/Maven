package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;


public class Sample extends BaseClass {

	
	
	
	public static void main(String[] args) {
		
		getDriver();
		launchURL("https://adactinhotelapp.com/");
		
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("hello");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
