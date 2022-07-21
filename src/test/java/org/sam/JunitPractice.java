package org.sam;

import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitPractice extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		launchURL("https://adactinhotelapp.com/");
		maximizeWindow();
		implicityWaits(90);

	}

	@AfterClass
	public static void afterClass() {
		closeCurrentBrowser();
	}

	@Test
	public void launchBrowser() throws IOException, InterruptedException {

		WebElement userName = LocateByID("username");
		String user = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 0);
		textPass(userName, user);

		WebElement password = LocateByID("password");
		String passTxt = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 1);
		textPass(password, passTxt);

		WebElement clickbtn = LocateByID("login");
		click(clickbtn);

		WebElement location = LocateByID("location");
		String newYork = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 2);
		SelectByVisibleText(location, newYork);

		WebElement hotel = LocateByID("hotels");
		String hotelName = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 3);
		SelectByVisibleText(hotel, hotelName);

		WebElement roomType = LocateByID("room_type");
		String rooms = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 4);
		SelectByVisibleText(roomType, rooms);

		WebElement roomrqrd = LocateByID("room_nos");
		String Rqrdrooms = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 5);
		SelectByVisibleText(roomrqrd, Rqrdrooms);

		WebElement chkndate = LocateByID("datepick_in");
		clear(chkndate);
		String stdate = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 6);
		textPass(chkndate, stdate);

		WebElement chkoutDate = LocateByID("datepick_out");
		clear(chkoutDate);
		String eddate = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 7);
		textPass(chkoutDate, eddate);

		WebElement adults = LocateByID("adult_room");
		String persons = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 8);
		SelectByVisibleText(adults, persons);

		WebElement child = LocateByID("child_room");
		String nochild = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 9);
		SelectByVisibleText(child, nochild);

		WebElement search = LocateByID("Submit");
		click(search);

		WebElement select = XpathLocator("//input[@name='radiobutton_0']");
		click(select);

		WebElement continueClick = CSSLocator("input#continue");
		click(continueClick);

		WebElement firstname = LocateByID("first_name");
		String frstnamepass = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 10);

		textPass(firstname, frstnamepass);

		WebElement lastNamename = LocateByID("last_name");
		String lastnamepass = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 11);
		textPass(lastNamename, lastnamepass);

		WebElement address = LocateByID("address");
		String billingadd = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 12);
		textPass(address, billingadd);

		WebElement cardNo = LocateByID("cc_num");
		String no = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 13);
		textPass(cardNo, no);

		WebElement cardName = LocateByID("cc_type");
		String Cardnametext = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 14);
		SelectByVisibleText(cardName, Cardnametext);

		WebElement expiryMonth = LocateByID("cc_exp_month");
		String month = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 15);
		SelectByVisibleText(expiryMonth, month);

		WebElement expiryYear = LocateByID("cc_exp_year");
		String va = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 16);
		SelectByValue(expiryYear, va);

		WebElement ccvNumber = LocateByID("cc_cvv");
		String numberccv = readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 17);
		textPass(ccvNumber, numberccv);

		WebElement booknowclick = LocateByID("book_now");
		click(booknowclick);

		WebElement value = LocateByID("order_no");
		String orderId = value.getAttribute("value");
		System.out.println(orderId);
		writeData("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 19, orderId);

	}

}
