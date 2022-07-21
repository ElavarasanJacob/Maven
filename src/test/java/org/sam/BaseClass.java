package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public String getTitle() {
		String title = driver.getTitle();
	return title;
	}

	public void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public static void closeCurrentBrowser() {
		driver.close();
	}

	public void quitWindow() {
		driver.quit();
	}
	public void textPass(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void navigateTo(String nextURL) {
		driver.navigate().to(nextURL);
	}
	public void refereshWindow() {
		driver.navigate().refresh();
	}

	public void backwardWindow() {
		driver.navigate().back();
		
	}
	public void forward() {
		driver.navigate().forward();
	}

	public void setWindowSize(int a, int b) {
		Dimension d = new Dimension(a, b);
		driver.manage().window().setSize(d);
	}

	public void setPosition(int a, int b) {
		Point p = new Point(a, b);
		driver.manage().window().setPosition(p);
	}

	public String parentWindow() {
		String parId = driver.getWindowHandle();
		return parId;
	}

	public Set<String> childWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public WebElement LocateByID(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}

	public WebElement LocateByName(String attributevalue) {
		WebElement findElement = driver.findElement(By.name(attributevalue));
		return findElement;
	}

	public WebElement LocateByClassName(String attributevalue) {
		WebElement findElement = driver.findElement(By.className(attributevalue));
		return findElement;
	}

	public WebElement LocateByTagName(String tagname) {
		WebElement findElement = driver.findElement(By.tagName(tagname));
		return findElement;
	}

	public WebElement LocateByLinkText(String linktext) {
		WebElement findElement = driver.findElement(By.linkText(linktext));
		return findElement;
	}

	public WebElement LocateByPartialLinkText(String partialtext) {
		WebElement findElement = driver.findElement(By.partialLinkText(partialtext));
		return findElement;
	}

	public List<WebElement> multipleElementsTagNames(String value) {
		List<WebElement> findElements = driver.findElements(By.tagName(value));
		return findElements;
	}

	public WebElement CSSLocator(String cssSelector) {
		WebElement findElement = driver.findElement(By.cssSelector(cssSelector));
		return findElement;
	}

	public WebElement XpathLocator(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}

	public void click(WebElement element) {
		element.click();
	}

	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public void submit(WebElement element) {
		element.submit();
	}

	public void scrolling(WebElement element, boolean cmnd) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + cmnd + ")", element);
	}

	public void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public void jsSendText(WebElement element, String data) { 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value'," + data + ")", element);
	}

	public void takeScreenShot(String newLocation) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(newLocation));
	}

	public void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void actionClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public void actionDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void actionRightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void dragAndDrop(WebElement srce, WebElement targt) {
		Actions a = new Actions(driver);
		a.dragAndDrop(srce, targt).perform();
	}

	public void clickAndHold(WebElement srce, WebElement targt) {
		Actions a = new Actions(driver);
		a.clickAndHold(srce).moveToElement(targt).release().perform();
	}

	public void robotClass(int keyPress, int keyRelease) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keyPress);
		r.keyRelease(keyRelease); // doubt
	}

	public Date date() {
		Date d = new Date();
		return d;
	}

	public boolean checkIsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public void SelectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void SelectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void SelectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public List<WebElement> getOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public List<WebElement> getAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getSelectOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public void deSelectbyIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public void deselectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}

	public Alert switctoAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}

	public void dismissAlert(Alert alert) {
		alert.dismiss();

	}

	public void accept(Alert alert) {
		alert.accept();
	}

	public void sendText(Alert alert, String text) {
		alert.sendKeys(text);
	}

	public String getAlertText(Alert alert) {
		String text = alert.getText();
		return text;
	}

	public void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void frameValue(String value) {
		driver.switchTo().frame(value);
	}

	public void frameByWebRef(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void frameParid() {
		driver.switchTo().parentFrame();
	}

	public void frameToWebPage() {
		driver.switchTo().defaultContent();
	}

	public int lengthOfString(String s) {
		int length = s.length();
		return length;
	}

	public boolean containsString(String s, String contains) {
		boolean contains2 = s.contains(contains);
		return contains2;
	}

	public int indexofString(String s, char d) {
		int indexOf = s.indexOf(d);
		return indexOf;
	}

	public int lastIndexOf(String s, char e) {
		int lastIndexOf = s.lastIndexOf(e);
		return lastIndexOf;
	}

	public char CharAt(String s, int f) {
		char charAt = s.charAt(f);
		return charAt;
	}

	public String toUpperCase(String s) {
		String upperCase = s.toUpperCase();
		return upperCase;
	}

	public String toLowerCase(String s) {
		String lowerCase = s.toLowerCase();
		return lowerCase;
	}

	public boolean startsWith(String s, String c) {
		boolean startsWith = s.startsWith(c);
		return startsWith;
	}

	public boolean endsWith(String s, String d) {
		boolean endsWith = s.endsWith(d);
		return endsWith;
	}

	public int compareTo(String s, String w) {
		int compareTo = s.compareTo(w);
		return compareTo;
	}

	public boolean equals(String s, String d) {
		boolean equals = s.equals(d);
		return equals;
	}

	public boolean equalsIgnoreCase(String s, String d) {
		boolean equalsIgnoreCase = s.equalsIgnoreCase(d);
		return equalsIgnoreCase;
	}

	public String subString(String s, int a) {
		String substring = s.substring(a);
		return substring;
	}

	public String subStringBy2(String s, int a, int o) {
		String substring = s.substring(a, o);
		return substring;
	}

	public String readFile(String path ,String name, int rowNo, int cellno) throws IOException {
		String res = null;
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet createSheet = w.getSheet(name);
		Row createRow = createSheet.getRow(rowNo);
		Cell cell = createRow.getCell(cellno);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
				res = s.format(dateCellValue);
			} 
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				BigDecimal bigDecimal = BigDecimal.valueOf(l);
				res = bigDecimal.toString();
			}
			break;
		
		default:
			break;
		}
		return res;
	}

	public void modifyData(String name, int rowNo, int cellno, String oldname, String newname) throws IOException {
		File f = new File("C:\\Maven\\Excel\\Task Read excele.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(name);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellno);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(oldname)) {
			cell.setCellValue(newname);
		}
		FileOutputStream s = new FileOutputStream(f);
		w.write(s);
	}

	public void writeData(String fileaddress,String name, int rowNo, int cellno, String data) throws IOException {
		File f = new File(fileaddress);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(name);
		Row row = sheet.getRow(rowNo); 
		Cell createCell = row.createCell(cellno);
		createCell.setCellValue(data);
		FileOutputStream s = new FileOutputStream(f);
		w.write(s);

	}
	public void createRow(String fileaddress,String name, int rowNo, int cellno, String data) throws IOException {
		File f = new File(fileaddress);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(name);
		Row row = sheet.createRow(rowNo);
		Cell createCell = row.createCell(cellno);
		createCell.setCellValue(data);
		FileOutputStream s = new FileOutputStream(f);
		w.write(s);

	}
	public JavascriptExecutor jsGetText() { 
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].getAttribute('value'," + data + ")", element);
	return js;
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	public void threadSleep(int miles) throws InterruptedException
	{
	     Thread.sleep(miles);
	}
	public static void implicityWaits(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	
	public WebElement findByLinkText(String linktext) {
		WebElement findElement = driver.findElement(By.linkText(linktext));
	return findElement;
	}
	public WebElement findByPartialText(String patext) {
		WebElement findElement = driver.findElement(By.partialLinkText(patext));
		return findElement;
	}

	
	
	
}




