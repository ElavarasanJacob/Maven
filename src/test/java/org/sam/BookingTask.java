package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BookingTask {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		BaseClass b = new BaseClass();
		b.getDriver();
		b.maximizeWindow();
		b.implicityWaits(50);
		b.launchURL("https://adactinhotelapp.com/index.php");
		
		WebElement userName = b.LocateByID("username");
		String user = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 0);
		b.textPass(userName, user);

		WebElement password = b.LocateByID("password");
		String passTxt = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 1);
		b.textPass(password, passTxt);
		// String attribute = b.getAttribute(password);
		// System.out.println(attribute);

		WebElement clickbtn = b.LocateByID("login");
		b.click(clickbtn);

		WebElement location = b.LocateByID("location");
		String newYork = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 2);
		b.SelectByVisibleText(location, newYork);
//		String attribute16 = b.getAttribute(location);
//		System.out.println(attribute16);

		WebElement hotel = b.LocateByID("hotels");
		String hotelName = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 3);
		b.SelectByVisibleText(hotel, hotelName);
//		String attribute15 = b.getAttribute(hotel);
//		System.out.println(attribute15);

		WebElement roomType = b.LocateByID("room_type");
		String rooms = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 4);
		b.SelectByVisibleText(roomType, rooms);
//		String attribute14 = b.getAttribute(roomType);
//		System.out.println(attribute14);

		WebElement roomrqrd = b.XpathLocator("//select[@id='room_nos']");
		String Rqrdrooms = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 5);
		b.SelectByVisibleText(roomrqrd, Rqrdrooms);
//		String attribute13 = b.getAttribute(roomrqrd);
//		System.out.println(attribute13);

		WebElement chkndate = b.LocateByID("datepick_in");
		b.clear(chkndate);
		String stdate = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 6);
		b.textPass(chkndate, stdate);
//		String attribute2 = b.getAttribute(chkndate);
//		System.out.println(attribute2);

		WebElement chkoutDate = b.LocateByID("datepick_out");
		b.clear(chkoutDate);
		String eddate = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 7);
		b.textPass(chkoutDate, eddate);
//		String attribute = b.getAttribute(chkoutDate);
//		System.out.println(attribute);

		WebElement adults = b.XpathLocator("//select[@id='adult_room']");
		String persons = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 8);
		b.SelectByVisibleText(adults, persons);
//		String attribute12 = b.getAttribute(adults);
//		System.out.println(attribute12);

		WebElement child = b.XpathLocator("//select[@id='child_room']");
		String nochild = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 9);
		b.SelectByVisibleText(child, nochild);
//		String attribute11 = b.getAttribute(child);
//		System.out.println(attribute11);

		WebElement search = b.LocateByID("Submit");
		b.click(search);

		WebElement select = b.XpathLocator("//input[@name='radiobutton_0']");
		b.click(select);

		WebElement continueClick = b.CSSLocator("input#continue");
		b.click(continueClick);

		WebElement firstname = b.LocateByID("first_name");
		String frstnamepass = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 10);
		b.textPass(firstname, frstnamepass);
//		String attribute3 = b.getAttribute(firstname);
//		System.out.println(attribute3);

		WebElement lastNamename = b.LocateByID("last_name");
		String lastnamepass = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 11);
		b.textPass(lastNamename, lastnamepass);
//		String attribute4 = b.getAttribute(lastNamename);
//		System.out.println(attribute4);

		WebElement address = b.LocateByID("address");
		String billingadd = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 12);
		b.textPass(address, billingadd);
//		String attribute5 = b.getAttribute(address);
//		System.out.println(attribute5);

		WebElement cardNo = b.LocateByID("cc_num");
		String no = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 13);
		b.textPass(cardNo, no);
//		String attribute6 = b.getAttribute(cardNo);
//		System.out.println(attribute6);

		WebElement cardName = b.LocateByID("cc_type");
		String Cardnametext = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 14);
		b.SelectByVisibleText(cardName, Cardnametext);
//		String attribute7 = b.getAttribute(cardName);
//		System.out.println(attribute7);

		WebElement expiryMonth = b.LocateByID("cc_exp_month");
		String month = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 15);
		b.SelectByVisibleText(expiryMonth, month);
//		String attribute8 = b.getAttribute(expiryMonth);
//		System.out.println(attribute8);

		WebElement expiryYear = b.LocateByID("cc_exp_year");
		String va = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 16);
		b.SelectByVisibleText(expiryYear, va);
//		String attribute9 = b.getAttribute(expiryYear);
//		System.out.println(attribute9);

		WebElement ccvNumber = b.LocateByID("cc_cvv");
		String numberccv = b.readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 17);
		b.textPass(ccvNumber, numberccv);
//		String attribute10 = b.getAttribute(ccvNumber);
//		System.out.println(attribute10);

		WebElement booknowclick = b.LocateByID("book_now");
		b.click(booknowclick);

//		WebElement value = b.LocateByID("order_no");
		WebElement orderNo = b.XpathLocator("//input[@name='order_no']");
		String orderId = orderNo.getAttribute("value");
		System.out.println(orderId);

		b.writeData("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 18, orderId);
		b.closeCurrentBrowser();

	}

}
