package org.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A extends BaseClass {

	@DataProvider
	public Object[][] beforeMethod() throws IOException {
//		Object[][] data = new Object[5][1];
		
		  return new Object[][] { 
			  { readFile("C:\\Maven\\Excel\\Adactin2.xlsx",
		  "FaceBook", 1, 2)},{ readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 2,
		  2)},{readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 3, 2)},
			  {readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 4, 2)},
			  {readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 5, 2)}  }; 
	}
		/* data[0][0] = readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 1, 2);
		data[1][0] = readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 2, 2);
		data[2][0] = readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 3, 2);
		data[3][0] = readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 4, 2);
		data[4][0] = readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 5, 2);

		return data;
	} */
	@BeforeClass
	private void beforeClass() throws IOException {
				
	}

	@Test(dataProvider = "beforeMethod")
	private void a(String s) throws IOException {
		getDriver();
		launchURL(readFile("C:\\Maven\\Excel\\Adactin2.xlsx", "FaceBook", 1, 3));
		maximizeWindow();
		implicityWaits(50);
		WebElement btn = XpathLocator("//button[@class='_2KpZ6l _2doB4z']");
		click(btn);
		WebElement search1 = XpathLocator("//input[@class='_3704LK']");
		textPass(search1, s);
		WebElement search = XpathLocator("//button[@type='submit']");
		click(search);
	}

	@AfterClass
	private void afterClass() {
		System.out.println("processing");

quitWindow();

System.out.println("successfully launched!");

	}

}
