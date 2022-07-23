package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.out.println("Branch A check");
		System.out.println("Branch A check");
		System.out.println("Branch A check");
		System.out.println("Branch A check");
		System.out.println("Banch B check");
		System.out.println("Banch B check");
		System.out.println("Banch B check");
		System.out.println("Banch B check");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement source = driver.findElement(By.xpath("//input[@id='src']"));
		source.sendKeys("Chennai",Keys.ENTER);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Hiiiiiiiiiiiiiiiiiiii");
		System.out.println("Hiiiiiiiiiiiiiiiiiiii");
		System.out.println("Hiiiiiiiiiiiiiiiiiiii");
		source.sendKeys("Chennai");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("sdsdssssssssssssss");
		System.out.println("sdsdssssssssssssss");
		System.out.println("sdsdssssssssssssss");
		System.out.println("sdsdssssssssssssss");
		System.out.println("sdsdssssssssssssss");
		System.out.println("sdsdssssssssssssss");
		System.out.println("sdsdssssssssssssss");

		

		WebElement destination = driver.findElement(By.xpath("//input[@id='dest']"));
		destination.sendKeys("Madiwala, Bangalore");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement dateclick = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		dateclick.sendKeys("21-Jul-2022");
//		dateclick.click();
//		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[3]"));
//		findElement.click();

		WebElement searchBtn = driver.findElement(By.id("search_btn"));
		searchBtn.click();

		// driver.close();

	}

}
