package org.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sam.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom extends BaseClass {

	@DataProvider
	private Object[][] inputData() throws IOException {

		return new Object[][] { 
			    { readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 1, 2) },
				{ readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 2, 2) },
				{ readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 3, 2) },
//				{ readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 4, 2) },
//				{ readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 5, 2) } 
				};
	}

	@Test(dataProvider = "inputData")
	private void launchFlipkart(String s1) throws IOException {
		getDriver();
		launchURL(readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 1, 3));
		maximizeWindow();
		implicityWaits(50);

		LoginPage l = new LoginPage();
		l.loginPage(s1);
		
		
	}
@AfterClass
private void afterClass() {
	quitWindow();
	System.out.println("done!");
	

}

}
