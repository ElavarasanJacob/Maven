package org.sam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DailyPractice {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		File f = new File("C:\\Maven\\Excel\\writing.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Sheet3");

		driver.findElement(By.id("enterimg")).click();
		WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select s = new Select(skills);
		List<WebElement> options = s.getOptions();
         for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
			Row createRow = sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			if (text.equals("C++")) {
				Row row = sheet.getRow(1);
				Cell createCell2 = row.createCell(3);
				createCell2.setCellValue(text);
				
			}
			/*WebElement webElement = options.get(2);
			
			String text2 = webElement.getText();
			Cell createCell2 = createRow.createCell(1);

			
			createCell2.setCellValue(text2);*/
		}
		FileOutputStream q = new FileOutputStream(f);
		w.write(q);
	}

}
